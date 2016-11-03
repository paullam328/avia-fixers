/**
 * This class is generated by jOOQ
 */
package com.aviafix.db.generated;


import com.aviafix.db.generated.tables.CUSTOMER_USERS;
import com.aviafix.db.generated.tables.EMPLOYEE_USERS;
import com.aviafix.db.generated.tables.FINANCEOFFICE_EMPLOYEES;
import com.aviafix.db.generated.tables.HASPARTS;
import com.aviafix.db.generated.tables.ORDERS;
import com.aviafix.db.generated.tables.PAYBYCHEQUE;
import com.aviafix.db.generated.tables.PAYBYCREDITCARD;
import com.aviafix.db.generated.tables.PAYOFFLINE;
import com.aviafix.db.generated.tables.PAYONLINE;
import com.aviafix.db.generated.tables.REPAIR;
import com.aviafix.db.generated.tables.REPAIRSHOP_EMPLOYEES;
import com.aviafix.db.generated.tables.USERS;
import com.aviafix.db.generated.tables.USRNAME_PASS;
import com.aviafix.db.generated.tables.records.CUSTOMER_USERSRECORD;
import com.aviafix.db.generated.tables.records.EMPLOYEE_USERSRECORD;
import com.aviafix.db.generated.tables.records.FINANCEOFFICE_EMPLOYEESRECORD;
import com.aviafix.db.generated.tables.records.HASPARTSRECORD;
import com.aviafix.db.generated.tables.records.ORDERSRECORD;
import com.aviafix.db.generated.tables.records.PAYBYCHEQUERECORD;
import com.aviafix.db.generated.tables.records.PAYBYCREDITCARDRECORD;
import com.aviafix.db.generated.tables.records.PAYOFFLINERECORD;
import com.aviafix.db.generated.tables.records.PAYONLINERECORD;
import com.aviafix.db.generated.tables.records.REPAIRRECORD;
import com.aviafix.db.generated.tables.records.REPAIRSHOP_EMPLOYEESRECORD;
import com.aviafix.db.generated.tables.records.USERSRECORD;
import com.aviafix.db.generated.tables.records.USRNAME_PASSRECORD;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>AviaFixers</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CUSTOMER_USERSRECORD, Integer> IDENTITY_CUSTOMER_USERS = Identities0.IDENTITY_CUSTOMER_USERS;
    public static final Identity<HASPARTSRECORD, Integer> IDENTITY_HASPARTS = Identities0.IDENTITY_HASPARTS;
    public static final Identity<ORDERSRECORD, Integer> IDENTITY_ORDERS = Identities0.IDENTITY_ORDERS;
    public static final Identity<PAYBYCREDITCARDRECORD, Integer> IDENTITY_PAYBYCREDITCARD = Identities0.IDENTITY_PAYBYCREDITCARD;
    public static final Identity<USERSRECORD, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CUSTOMER_USERSRECORD> KEY_CUSTOMER_USERS_PRIMARY = UniqueKeys0.KEY_CUSTOMER_USERS_PRIMARY;
    public static final UniqueKey<EMPLOYEE_USERSRECORD> KEY_EMPLOYEE_USERS_PRIMARY = UniqueKeys0.KEY_EMPLOYEE_USERS_PRIMARY;
    public static final UniqueKey<FINANCEOFFICE_EMPLOYEESRECORD> KEY_FINANCEOFFICE_EMPLOYEES_PRIMARY = UniqueKeys0.KEY_FINANCEOFFICE_EMPLOYEES_PRIMARY;
    public static final UniqueKey<HASPARTSRECORD> KEY_HASPARTS_PRIMARY = UniqueKeys0.KEY_HASPARTS_PRIMARY;
    public static final UniqueKey<ORDERSRECORD> KEY_ORDERS_PRIMARY = UniqueKeys0.KEY_ORDERS_PRIMARY;
    public static final UniqueKey<PAYBYCHEQUERECORD> KEY_PAYBYCHEQUE_PRIMARY = UniqueKeys0.KEY_PAYBYCHEQUE_PRIMARY;
    public static final UniqueKey<PAYBYCREDITCARDRECORD> KEY_PAYBYCREDITCARD_PRIMARY = UniqueKeys0.KEY_PAYBYCREDITCARD_PRIMARY;
    public static final UniqueKey<PAYBYCREDITCARDRECORD> KEY_PAYBYCREDITCARD_ETID_UNIQUE = UniqueKeys0.KEY_PAYBYCREDITCARD_ETID_UNIQUE;
    public static final UniqueKey<PAYOFFLINERECORD> KEY_PAYOFFLINE_PRIMARY = UniqueKeys0.KEY_PAYOFFLINE_PRIMARY;
    public static final UniqueKey<PAYOFFLINERECORD> KEY_PAYOFFLINE_CQNUMPAYOFFLINECOL_UNIQUE = UniqueKeys0.KEY_PAYOFFLINE_CQNUMPAYOFFLINECOL_UNIQUE;
    public static final UniqueKey<PAYOFFLINERECORD> KEY_PAYOFFLINE_ORNUMPAYOFFLINE_UNIQUE = UniqueKeys0.KEY_PAYOFFLINE_ORNUMPAYOFFLINE_UNIQUE;
    public static final UniqueKey<PAYONLINERECORD> KEY_PAYONLINE_PRIMARY = UniqueKeys0.KEY_PAYONLINE_PRIMARY;
    public static final UniqueKey<PAYONLINERECORD> KEY_PAYONLINE_ORDNUMPAYONL_UNIQUE = UniqueKeys0.KEY_PAYONLINE_ORDNUMPAYONL_UNIQUE;
    public static final UniqueKey<REPAIRRECORD> KEY_REPAIR_PRIMARY = UniqueKeys0.KEY_REPAIR_PRIMARY;
    public static final UniqueKey<REPAIRSHOP_EMPLOYEESRECORD> KEY_REPAIRSHOP_EMPLOYEES_PRIMARY = UniqueKeys0.KEY_REPAIRSHOP_EMPLOYEES_PRIMARY;
    public static final UniqueKey<USERSRECORD> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;
    public static final UniqueKey<USRNAME_PASSRECORD> KEY_USRNAME_PASS_PRIMARY = UniqueKeys0.KEY_USRNAME_PASS_PRIMARY;
    public static final UniqueKey<USRNAME_PASSRECORD> KEY_USRNAME_PASS_USRID_UNIQUE = UniqueKeys0.KEY_USRNAME_PASS_USRID_UNIQUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CUSTOMER_USERSRECORD, USERSRECORD> CUID = ForeignKeys0.CUID;
    public static final ForeignKey<EMPLOYEE_USERSRECORD, USERSRECORD> EUID = ForeignKeys0.EUID;
    public static final ForeignKey<FINANCEOFFICE_EMPLOYEESRECORD, EMPLOYEE_USERSRECORD> FEID = ForeignKeys0.FEID;
    public static final ForeignKey<HASPARTSRECORD, ORDERSRECORD> PORDERNUM = ForeignKeys0.PORDERNUM;
    public static final ForeignKey<ORDERSRECORD, CUSTOMER_USERSRECORD> ORDERCID = ForeignKeys0.ORDERCID;
    public static final ForeignKey<PAYOFFLINERECORD, CUSTOMER_USERSRECORD> CIDPAYOFFLINE = ForeignKeys0.CIDPAYOFFLINE;
    public static final ForeignKey<PAYOFFLINERECORD, PAYBYCHEQUERECORD> CQNUMPAYOFFLINE = ForeignKeys0.CQNUMPAYOFFLINE;
    public static final ForeignKey<PAYOFFLINERECORD, ORDERSRECORD> ORNUMPAYOFFLINE = ForeignKeys0.ORNUMPAYOFFLINE;
    public static final ForeignKey<PAYONLINERECORD, CUSTOMER_USERSRECORD> CIDPAYONLINE = ForeignKeys0.CIDPAYONLINE;
    public static final ForeignKey<PAYONLINERECORD, ORDERSRECORD> ORDNUMPAYONL = ForeignKeys0.ORDNUMPAYONL;
    public static final ForeignKey<PAYONLINERECORD, PAYBYCREDITCARDRECORD> ETIDPAYONLINE = ForeignKeys0.ETIDPAYONLINE;
    public static final ForeignKey<REPAIRRECORD, REPAIRSHOP_EMPLOYEESRECORD> ERIDREPAIR = ForeignKeys0.ERIDREPAIR;
    public static final ForeignKey<REPAIRRECORD, HASPARTSRECORD> PNUMREPAIR = ForeignKeys0.PNUMREPAIR;
    public static final ForeignKey<REPAIRRECORD, ORDERSRECORD> ORDNUMREPAIR = ForeignKeys0.ORDNUMREPAIR;
    public static final ForeignKey<REPAIRSHOP_EMPLOYEESRECORD, EMPLOYEE_USERSRECORD> REID = ForeignKeys0.REID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CUSTOMER_USERSRECORD, Integer> IDENTITY_CUSTOMER_USERS = createIdentity(CUSTOMER_USERS.CUSTOMER_USERS, CUSTOMER_USERS.CUSTOMER_USERS.CID);
        public static Identity<HASPARTSRECORD, Integer> IDENTITY_HASPARTS = createIdentity(HASPARTS.HASPARTS, HASPARTS.HASPARTS.PARTNUM);
        public static Identity<ORDERSRECORD, Integer> IDENTITY_ORDERS = createIdentity(ORDERS.ORDERS, ORDERS.ORDERS.ORDERNUM);
        public static Identity<PAYBYCREDITCARDRECORD, Integer> IDENTITY_PAYBYCREDITCARD = createIdentity(PAYBYCREDITCARD.PAYBYCREDITCARD, PAYBYCREDITCARD.PAYBYCREDITCARD.ETID);
        public static Identity<USERSRECORD, Integer> IDENTITY_USERS = createIdentity(USERS.USERS, USERS.USERS.UID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CUSTOMER_USERSRECORD> KEY_CUSTOMER_USERS_PRIMARY = createUniqueKey(CUSTOMER_USERS.CUSTOMER_USERS, "KEY_customer_users_PRIMARY", CUSTOMER_USERS.CUSTOMER_USERS.CID);
        public static final UniqueKey<EMPLOYEE_USERSRECORD> KEY_EMPLOYEE_USERS_PRIMARY = createUniqueKey(EMPLOYEE_USERS.EMPLOYEE_USERS, "KEY_employee_users_PRIMARY", EMPLOYEE_USERS.EMPLOYEE_USERS.EID);
        public static final UniqueKey<FINANCEOFFICE_EMPLOYEESRECORD> KEY_FINANCEOFFICE_EMPLOYEES_PRIMARY = createUniqueKey(FINANCEOFFICE_EMPLOYEES.FINANCEOFFICE_EMPLOYEES, "KEY_financeoffice_employees_PRIMARY", FINANCEOFFICE_EMPLOYEES.FINANCEOFFICE_EMPLOYEES.FEID);
        public static final UniqueKey<HASPARTSRECORD> KEY_HASPARTS_PRIMARY = createUniqueKey(HASPARTS.HASPARTS, "KEY_hasParts_PRIMARY", HASPARTS.HASPARTS.PARTNUM, HASPARTS.HASPARTS.PORDERNUM);
        public static final UniqueKey<ORDERSRECORD> KEY_ORDERS_PRIMARY = createUniqueKey(ORDERS.ORDERS, "KEY_orders_PRIMARY", ORDERS.ORDERS.ORDERNUM);
        public static final UniqueKey<PAYBYCHEQUERECORD> KEY_PAYBYCHEQUE_PRIMARY = createUniqueKey(PAYBYCHEQUE.PAYBYCHEQUE, "KEY_payByCheque_PRIMARY", PAYBYCHEQUE.PAYBYCHEQUE.CHEQUENUM);
        public static final UniqueKey<PAYBYCREDITCARDRECORD> KEY_PAYBYCREDITCARD_PRIMARY = createUniqueKey(PAYBYCREDITCARD.PAYBYCREDITCARD, "KEY_payByCreditCard_PRIMARY", PAYBYCREDITCARD.PAYBYCREDITCARD.ETID);
        public static final UniqueKey<PAYBYCREDITCARDRECORD> KEY_PAYBYCREDITCARD_ETID_UNIQUE = createUniqueKey(PAYBYCREDITCARD.PAYBYCREDITCARD, "KEY_payByCreditCard_ETID_UNIQUE", PAYBYCREDITCARD.PAYBYCREDITCARD.ETID);
        public static final UniqueKey<PAYOFFLINERECORD> KEY_PAYOFFLINE_PRIMARY = createUniqueKey(PAYOFFLINE.PAYOFFLINE, "KEY_payOffline_PRIMARY", PAYOFFLINE.PAYOFFLINE.CIDPAYOFFLINE, PAYOFFLINE.PAYOFFLINE.CQNUMPAYOFFLINE, PAYOFFLINE.PAYOFFLINE.ORNUMPAYOFFLINE, PAYOFFLINE.PAYOFFLINE.FEIDPAYOFFLINE);
        public static final UniqueKey<PAYOFFLINERECORD> KEY_PAYOFFLINE_CQNUMPAYOFFLINECOL_UNIQUE = createUniqueKey(PAYOFFLINE.PAYOFFLINE, "KEY_payOffline_cqNumpayOfflinecol_UNIQUE", PAYOFFLINE.PAYOFFLINE.CQNUMPAYOFFLINE);
        public static final UniqueKey<PAYOFFLINERECORD> KEY_PAYOFFLINE_ORNUMPAYOFFLINE_UNIQUE = createUniqueKey(PAYOFFLINE.PAYOFFLINE, "KEY_payOffline_orNumpayOffline_UNIQUE", PAYOFFLINE.PAYOFFLINE.ORNUMPAYOFFLINE);
        public static final UniqueKey<PAYONLINERECORD> KEY_PAYONLINE_PRIMARY = createUniqueKey(PAYONLINE.PAYONLINE, "KEY_payOnline_PRIMARY", PAYONLINE.PAYONLINE.CIDPAYONLINE, PAYONLINE.PAYONLINE.ORDNUMPAYONL, PAYONLINE.PAYONLINE.ETIDPAYONLINE);
        public static final UniqueKey<PAYONLINERECORD> KEY_PAYONLINE_ORDNUMPAYONL_UNIQUE = createUniqueKey(PAYONLINE.PAYONLINE, "KEY_payOnline_ordNumPayOnl_UNIQUE", PAYONLINE.PAYONLINE.ORDNUMPAYONL);
        public static final UniqueKey<REPAIRRECORD> KEY_REPAIR_PRIMARY = createUniqueKey(REPAIR.REPAIR, "KEY_repair_PRIMARY", REPAIR.REPAIR.ERIDREPAIR, REPAIR.REPAIR.PNUMREPAIR, REPAIR.REPAIR.ORDNUMREPAIR);
        public static final UniqueKey<REPAIRSHOP_EMPLOYEESRECORD> KEY_REPAIRSHOP_EMPLOYEES_PRIMARY = createUniqueKey(REPAIRSHOP_EMPLOYEES.REPAIRSHOP_EMPLOYEES, "KEY_repairshop_employees_PRIMARY", REPAIRSHOP_EMPLOYEES.REPAIRSHOP_EMPLOYEES.REID);
        public static final UniqueKey<USERSRECORD> KEY_USERS_PRIMARY = createUniqueKey(USERS.USERS, "KEY_users_PRIMARY", USERS.USERS.UID);
        public static final UniqueKey<USRNAME_PASSRECORD> KEY_USRNAME_PASS_PRIMARY = createUniqueKey(USRNAME_PASS.USRNAME_PASS, "KEY_UsrName_pass_PRIMARY", USRNAME_PASS.USRNAME_PASS.USRN);
        public static final UniqueKey<USRNAME_PASSRECORD> KEY_USRNAME_PASS_USRID_UNIQUE = createUniqueKey(USRNAME_PASS.USRNAME_PASS, "KEY_UsrName_pass_UsrID_UNIQUE", USRNAME_PASS.USRNAME_PASS.USRN);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<CUSTOMER_USERSRECORD, USERSRECORD> CUID = createForeignKey(com.aviafix.db.generated.Keys.KEY_USERS_PRIMARY, CUSTOMER_USERS.CUSTOMER_USERS, "cuID", CUSTOMER_USERS.CUSTOMER_USERS.CUID);
        public static final ForeignKey<EMPLOYEE_USERSRECORD, USERSRECORD> EUID = createForeignKey(com.aviafix.db.generated.Keys.KEY_USERS_PRIMARY, EMPLOYEE_USERS.EMPLOYEE_USERS, "euID", EMPLOYEE_USERS.EMPLOYEE_USERS.EUID);
        public static final ForeignKey<FINANCEOFFICE_EMPLOYEESRECORD, EMPLOYEE_USERSRECORD> FEID = createForeignKey(com.aviafix.db.generated.Keys.KEY_EMPLOYEE_USERS_PRIMARY, FINANCEOFFICE_EMPLOYEES.FINANCEOFFICE_EMPLOYEES, "feID", FINANCEOFFICE_EMPLOYEES.FINANCEOFFICE_EMPLOYEES.FEID);
        public static final ForeignKey<HASPARTSRECORD, ORDERSRECORD> PORDERNUM = createForeignKey(com.aviafix.db.generated.Keys.KEY_ORDERS_PRIMARY, HASPARTS.HASPARTS, "porderNum", HASPARTS.HASPARTS.PORDERNUM);
        public static final ForeignKey<ORDERSRECORD, CUSTOMER_USERSRECORD> ORDERCID = createForeignKey(com.aviafix.db.generated.Keys.KEY_CUSTOMER_USERS_PRIMARY, ORDERS.ORDERS, "ordercID", ORDERS.ORDERS.ORDERCID);
        public static final ForeignKey<PAYOFFLINERECORD, CUSTOMER_USERSRECORD> CIDPAYOFFLINE = createForeignKey(com.aviafix.db.generated.Keys.KEY_CUSTOMER_USERS_PRIMARY, PAYOFFLINE.PAYOFFLINE, "cidpayOffline", PAYOFFLINE.PAYOFFLINE.CIDPAYOFFLINE);
        public static final ForeignKey<PAYOFFLINERECORD, PAYBYCHEQUERECORD> CQNUMPAYOFFLINE = createForeignKey(com.aviafix.db.generated.Keys.KEY_PAYBYCHEQUE_PRIMARY, PAYOFFLINE.PAYOFFLINE, "cqNumpayOffline", PAYOFFLINE.PAYOFFLINE.CQNUMPAYOFFLINE);
        public static final ForeignKey<PAYOFFLINERECORD, ORDERSRECORD> ORNUMPAYOFFLINE = createForeignKey(com.aviafix.db.generated.Keys.KEY_ORDERS_PRIMARY, PAYOFFLINE.PAYOFFLINE, "orNumpayOffline", PAYOFFLINE.PAYOFFLINE.ORNUMPAYOFFLINE);
        public static final ForeignKey<PAYONLINERECORD, CUSTOMER_USERSRECORD> CIDPAYONLINE = createForeignKey(com.aviafix.db.generated.Keys.KEY_CUSTOMER_USERS_PRIMARY, PAYONLINE.PAYONLINE, "cidpayOnline", PAYONLINE.PAYONLINE.CIDPAYONLINE);
        public static final ForeignKey<PAYONLINERECORD, ORDERSRECORD> ORDNUMPAYONL = createForeignKey(com.aviafix.db.generated.Keys.KEY_ORDERS_PRIMARY, PAYONLINE.PAYONLINE, "ordNumPayOnl", PAYONLINE.PAYONLINE.ORDNUMPAYONL);
        public static final ForeignKey<PAYONLINERECORD, PAYBYCREDITCARDRECORD> ETIDPAYONLINE = createForeignKey(com.aviafix.db.generated.Keys.KEY_PAYBYCREDITCARD_PRIMARY, PAYONLINE.PAYONLINE, "etidPayOnline", PAYONLINE.PAYONLINE.ETIDPAYONLINE);
        public static final ForeignKey<REPAIRRECORD, REPAIRSHOP_EMPLOYEESRECORD> ERIDREPAIR = createForeignKey(com.aviafix.db.generated.Keys.KEY_REPAIRSHOP_EMPLOYEES_PRIMARY, REPAIR.REPAIR, "eridrepair", REPAIR.REPAIR.ERIDREPAIR);
        public static final ForeignKey<REPAIRRECORD, HASPARTSRECORD> PNUMREPAIR = createForeignKey(com.aviafix.db.generated.Keys.KEY_HASPARTS_PRIMARY, REPAIR.REPAIR, "pNumrepair", REPAIR.REPAIR.PNUMREPAIR);
        public static final ForeignKey<REPAIRRECORD, ORDERSRECORD> ORDNUMREPAIR = createForeignKey(com.aviafix.db.generated.Keys.KEY_ORDERS_PRIMARY, REPAIR.REPAIR, "ordNumrepair", REPAIR.REPAIR.ORDNUMREPAIR);
        public static final ForeignKey<REPAIRSHOP_EMPLOYEESRECORD, EMPLOYEE_USERSRECORD> REID = createForeignKey(com.aviafix.db.generated.Keys.KEY_EMPLOYEE_USERS_PRIMARY, REPAIRSHOP_EMPLOYEES.REPAIRSHOP_EMPLOYEES, "reID", REPAIRSHOP_EMPLOYEES.REPAIRSHOP_EMPLOYEES.REID);
    }
}
