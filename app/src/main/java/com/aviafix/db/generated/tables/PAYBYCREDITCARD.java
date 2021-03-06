/**
 * This class is generated by jOOQ
 */
package com.aviafix.db.generated.tables;


import com.aviafix.db.DateConverter;
import com.aviafix.db.generated.Aviafixers;
import com.aviafix.db.generated.Keys;
import com.aviafix.db.generated.tables.records.PAYBYCREDITCARDRECORD;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PAYBYCREDITCARD extends TableImpl<PAYBYCREDITCARDRECORD> {

    private static final long serialVersionUID = -405877267;

    /**
     * The reference instance of <code>AviaFixers.payByCreditCard</code>
     */
    public static final PAYBYCREDITCARD PAYBYCREDITCARD = new PAYBYCREDITCARD();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PAYBYCREDITCARDRECORD> getRecordType() {
        return PAYBYCREDITCARDRECORD.class;
    }

    /**
     * The column <code>AviaFixers.payByCreditCard.ETID</code>.
     */
    public final TableField<PAYBYCREDITCARDRECORD, Integer> ETID = createField("ETID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>AviaFixers.payByCreditCard.creditCardNum</code>.
     */
    public final TableField<PAYBYCREDITCARDRECORD, Integer> CREDITCARDNUM = createField("creditCardNum", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>AviaFixers.payByCreditCard.expDate</code>.
     */
    public final TableField<PAYBYCREDITCARDRECORD, LocalDate> EXPDATE = createField("expDate", org.jooq.impl.SQLDataType.DATE, this, "", new DateConverter());

    /**
     * The column <code>AviaFixers.payByCreditCard.code</code>.
     */
    public final TableField<PAYBYCREDITCARDRECORD, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>AviaFixers.payByCreditCard.cardHolderName</code>.
     */
    public final TableField<PAYBYCREDITCARDRECORD, String> CARDHOLDERNAME = createField("cardHolderName", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>AviaFixers.payByCreditCard.amount</code>.
     */
    public final TableField<PAYBYCREDITCARDRECORD, Double> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>AviaFixers.payByCreditCard</code> table reference
     */
    public PAYBYCREDITCARD() {
        this("payByCreditCard", null);
    }

    /**
     * Create an aliased <code>AviaFixers.payByCreditCard</code> table reference
     */
    public PAYBYCREDITCARD(String alias) {
        this(alias, PAYBYCREDITCARD);
    }

    private PAYBYCREDITCARD(String alias, Table<PAYBYCREDITCARDRECORD> aliased) {
        this(alias, aliased, null);
    }

    private PAYBYCREDITCARD(String alias, Table<PAYBYCREDITCARDRECORD> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Aviafixers.AVIAFIXERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PAYBYCREDITCARDRECORD, Integer> getIdentity() {
        return Keys.IDENTITY_PAYBYCREDITCARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PAYBYCREDITCARDRECORD> getPrimaryKey() {
        return Keys.KEY_PAYBYCREDITCARD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PAYBYCREDITCARDRECORD>> getKeys() {
        return Arrays.<UniqueKey<PAYBYCREDITCARDRECORD>>asList(Keys.KEY_PAYBYCREDITCARD_PRIMARY, Keys.KEY_PAYBYCREDITCARD_ETID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PAYBYCREDITCARD as(String alias) {
        return new PAYBYCREDITCARD(alias, this);
    }

    /**
     * Rename this table
     */
    public PAYBYCREDITCARD rename(String name) {
        return new PAYBYCREDITCARD(name, null);
    }
}
