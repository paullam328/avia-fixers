/**
 * This class is generated by jOOQ
 */
package com.aviafix.db.generated.tables.records;


import com.aviafix.db.generated.tables.REPAIR;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class REPAIRRECORD extends UpdatableRecordImpl<REPAIRRECORD> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 538302220;

    /**
     * Setter for <code>AviaFixers.repair.eridrepair</code>.
     */
    public void ERIDREPAIR(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>AviaFixers.repair.eridrepair</code>.
     */
    public Integer ERIDREPAIR() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>AviaFixers.repair.pNumrepair</code>.
     */
    public void PNUMREPAIR(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>AviaFixers.repair.pNumrepair</code>.
     */
    public Integer PNUMREPAIR() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>AviaFixers.repair.ordNumrepair</code>.
     */
    public void ORDNUMREPAIR(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>AviaFixers.repair.ordNumrepair</code>.
     */
    public Integer ORDNUMREPAIR() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return REPAIR.REPAIR.ERIDREPAIR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return REPAIR.REPAIR.PNUMREPAIR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return REPAIR.REPAIR.ORDNUMREPAIR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return ERIDREPAIR();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return PNUMREPAIR();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return ORDNUMREPAIR();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public REPAIRRECORD value1(Integer value) {
        ERIDREPAIR(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public REPAIRRECORD value2(Integer value) {
        PNUMREPAIR(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public REPAIRRECORD value3(Integer value) {
        ORDNUMREPAIR(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public REPAIRRECORD values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached REPAIRRECORD
     */
    public REPAIRRECORD() {
        super(REPAIR.REPAIR);
    }

    /**
     * Create a detached, initialised REPAIRRECORD
     */
    public REPAIRRECORD(Integer ERIDREPAIR, Integer PNUMREPAIR, Integer ORDNUMREPAIR) {
        super(REPAIR.REPAIR);

        set(0, ERIDREPAIR);
        set(1, PNUMREPAIR);
        set(2, ORDNUMREPAIR);
    }
}
