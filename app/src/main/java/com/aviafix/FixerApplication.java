package com.aviafix;

import com.aviafix.health.TemplateHealthCheck;
import com.aviafix.resources.ElectronicPaymentResource;
import com.aviafix.resources.FixerResource;
import com.aviafix.resources.OrdersResourse;
import com.aviafix.resources.PartsResourse;
import com.bendb.dropwizard.jooq.JooqBundle;
import com.bendb.dropwizard.jooq.JooqFactory;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class FixerApplication extends Application<FixerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FixerApplication().run(args);
    }

    @Override
    public String getName() {
        return "Fixer";
    }

    @Override
    public void initialize(final Bootstrap<FixerConfiguration> bootstrap) {
        // TODO: application initialization
        // added all below
        bootstrap.addBundle(new JooqBundle<FixerConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(FixerConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }

            @Override
            public JooqFactory getJooqFactory(FixerConfiguration configuration) {
                return configuration.getJooqFactory();
            }
        });

        bootstrap.addBundle(new AssetsBundle("/assets", "/", "index.html"));
    }

    @Override
    public void run(final FixerConfiguration configuration,
                    final Environment environment) {

        // Serialization Configuration
        FixerApplication.configureMapper(environment.getObjectMapper());

        // TODO: implement application
        final FixerResource resource = new FixerResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        final OrdersResourse ordersResourse = new OrdersResourse();
        final PartsResourse partsResourse = new PartsResourse();
        final ElectronicPaymentResource electronicPaymentResource = new ElectronicPaymentResource();

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
        environment.jersey().register(ordersResourse);
        environment.jersey().register(partsResourse);
        environment.jersey().register(electronicPaymentResource);

    }

    public static ObjectMapper configureMapper(final ObjectMapper mapper){
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.registerModule(new JSR310Module());
        return mapper;
    }

}
