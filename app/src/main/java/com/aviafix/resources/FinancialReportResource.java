package com.aviafix.resources;

import com.aviafix.api.*;
import com.aviafix.api.FinancialReportReadRepresentation;
import com.aviafix.api.TotalPaymentRepresentation;
import com.aviafix.core.OrderStatus;
import com.aviafix.db.generated.tables.ORDERS;
import com.aviafix.db.generated.tables.PAYBYCHEQUE;
import com.codahale.metrics.annotation.Timed;
import com.codahale.metrics.health.HealthCheck;
import org.jooq.*;
import org.jooq.impl.DSL;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static com.aviafix.db.generated.tables.HASPARTS.HASPARTS;
import static com.aviafix.db.generated.tables.ORDERS.ORDERS;
import static com.aviafix.db.generated.tables.PAYBYCREDITCARD.PAYBYCREDITCARD;
import static com.aviafix.db.generated.tables.PAYONLINE.PAYONLINE;
import static com.aviafix.db.generated.tables.PAYBYCHEQUE.PAYBYCHEQUE;
import static com.aviafix.db.generated.tables.PAYOFFLINE.PAYOFFLINE;
import static org.jooq.impl.DSL.val;

@Path("/payments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class FinancialReportResource {

    @GET
    @Timed
    public List<FinancialReportReadRepresentation> getReport(
                @Context DSLContext database
    ) {
        List<FinancialReportReadRepresentation> representations = database.select(
                val(PAYBYCHEQUE.AMOUNT.sum().plus(PAYBYCREDITCARD.AMOUNT.sum())).as("revenue"),
                val(HASPARTS.REPAIRCOST.sum()).as("costOfGoodsSold"),
                val((HASPARTS.QTY.multiply(HASPARTS.SELLPRICE)).sum()).as("profit"))
                .from(HASPARTS, PAYBYCHEQUE, PAYBYCREDITCARD)
                .fetchInto(FinancialReportReadRepresentation.class);

        return representations;
    }

}
