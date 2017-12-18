package web.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerRegisterDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerRegisterDeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCustomerRegisterDeviceSysIdIsNull() {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdIsNotNull() {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdEqualTo(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID =", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID <>", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdGreaterThan(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID >", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID >=", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdLessThan(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID <", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID <=", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdLike(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID like", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdNotLike(String value) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID not like", value, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdIn(List<String> values) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID in", values, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID not in", values, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID between", value1, value2, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerRegisterDeviceSysIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_REGISTER_DEVICE_SYS_ID not between", value1, value2, "customerRegisterDeviceSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdIsNull() {
            addCriterion("CUSTOMER_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdIsNotNull() {
            addCriterion("CUSTOMER_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdEqualTo(String value) {
            addCriterion("CUSTOMER_SYS_ID =", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_SYS_ID <>", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdGreaterThan(String value) {
            addCriterion("CUSTOMER_SYS_ID >", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SYS_ID >=", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdLessThan(String value) {
            addCriterion("CUSTOMER_SYS_ID <", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SYS_ID <=", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdLike(String value) {
            addCriterion("CUSTOMER_SYS_ID like", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdNotLike(String value) {
            addCriterion("CUSTOMER_SYS_ID not like", value, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdIn(List<String> values) {
            addCriterion("CUSTOMER_SYS_ID in", values, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_SYS_ID not in", values, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SYS_ID between", value1, value2, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerSysIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SYS_ID not between", value1, value2, "customerSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdIsNull() {
            addCriterion("DEVICE_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdIsNotNull() {
            addCriterion("DEVICE_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdEqualTo(String value) {
            addCriterion("DEVICE_SYS_ID =", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdNotEqualTo(String value) {
            addCriterion("DEVICE_SYS_ID <>", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdGreaterThan(String value) {
            addCriterion("DEVICE_SYS_ID >", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_SYS_ID >=", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdLessThan(String value) {
            addCriterion("DEVICE_SYS_ID <", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_SYS_ID <=", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdLike(String value) {
            addCriterion("DEVICE_SYS_ID like", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdNotLike(String value) {
            addCriterion("DEVICE_SYS_ID not like", value, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdIn(List<String> values) {
            addCriterion("DEVICE_SYS_ID in", values, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdNotIn(List<String> values) {
            addCriterion("DEVICE_SYS_ID not in", values, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdBetween(String value1, String value2) {
            addCriterion("DEVICE_SYS_ID between", value1, value2, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceSysIdNotBetween(String value1, String value2) {
            addCriterion("DEVICE_SYS_ID not between", value1, value2, "deviceSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("DEVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("DEVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("DEVICE_NAME =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("DEVICE_NAME <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("DEVICE_NAME >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NAME >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("DEVICE_NAME <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NAME <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("DEVICE_NAME like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("DEVICE_NAME not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("DEVICE_NAME in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("DEVICE_NAME not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("DEVICE_NAME between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NAME not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("SN is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("SN is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("SN =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("SN <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("SN >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("SN >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("SN <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("SN <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("SN like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("SN not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("SN in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("SN not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("SN between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("SN not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("PURCHASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("PURCHASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PURCHASE_DATE <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_DATE in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PURCHASE_DATE not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_DATE between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PURCHASE_DATE not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("INVOICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("INVOICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("INVOICE_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("INVOICE_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("INVOICE_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("INVOICE_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("INVOICE_NO like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("INVOICE_NO not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("INVOICE_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("INVOICE_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("INVOICE_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NO not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNull() {
            addCriterion("INVOICE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNotNull() {
            addCriterion("INVOICE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateEqualTo(Date value) {
            addCriterion("INVOICE_DATE =", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotEqualTo(Date value) {
            addCriterion("INVOICE_DATE <>", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThan(Date value) {
            addCriterion("INVOICE_DATE >", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICE_DATE >=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThan(Date value) {
            addCriterion("INVOICE_DATE <", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThanOrEqualTo(Date value) {
            addCriterion("INVOICE_DATE <=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIn(List<Date> values) {
            addCriterion("INVOICE_DATE in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotIn(List<Date> values) {
            addCriterion("INVOICE_DATE not in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateBetween(Date value1, Date value2) {
            addCriterion("INVOICE_DATE between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotBetween(Date value1, Date value2) {
            addCriterion("INVOICE_DATE not between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("CREATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("CREATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("CREATION_TIME =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("CREATION_TIME <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("CREATION_TIME >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("CREATION_TIME <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("CREATION_TIME in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("CREATION_TIME not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}