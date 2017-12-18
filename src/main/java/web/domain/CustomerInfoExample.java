package web.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerInfoExample() {
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

        public Criteria andFirstNameIsNull() {
            addCriterion("FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("FIRST_NAME =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("FIRST_NAME <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("FIRST_NAME >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("FIRST_NAME <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("FIRST_NAME like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("FIRST_NAME not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("FIRST_NAME in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("FIRST_NAME not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("FIRST_NAME between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("LAST_NAME =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("LAST_NAME <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("LAST_NAME >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("LAST_NAME <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("LAST_NAME like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("LAST_NAME not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("LAST_NAME in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("LAST_NAME not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("LAST_NAME between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andLandlineIsNull() {
            addCriterion("LANDLINE is null");
            return (Criteria) this;
        }

        public Criteria andLandlineIsNotNull() {
            addCriterion("LANDLINE is not null");
            return (Criteria) this;
        }

        public Criteria andLandlineEqualTo(String value) {
            addCriterion("LANDLINE =", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotEqualTo(String value) {
            addCriterion("LANDLINE <>", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineGreaterThan(String value) {
            addCriterion("LANDLINE >", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineGreaterThanOrEqualTo(String value) {
            addCriterion("LANDLINE >=", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLessThan(String value) {
            addCriterion("LANDLINE <", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLessThanOrEqualTo(String value) {
            addCriterion("LANDLINE <=", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLike(String value) {
            addCriterion("LANDLINE like", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotLike(String value) {
            addCriterion("LANDLINE not like", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineIn(List<String> values) {
            addCriterion("LANDLINE in", values, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotIn(List<String> values) {
            addCriterion("LANDLINE not in", values, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineBetween(String value1, String value2) {
            addCriterion("LANDLINE between", value1, value2, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotBetween(String value1, String value2) {
            addCriterion("LANDLINE not between", value1, value2, "landline");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdIsNull() {
            addCriterion("REGION_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdIsNotNull() {
            addCriterion("REGION_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdEqualTo(String value) {
            addCriterion("REGION_SYS_ID =", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdNotEqualTo(String value) {
            addCriterion("REGION_SYS_ID <>", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdGreaterThan(String value) {
            addCriterion("REGION_SYS_ID >", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_SYS_ID >=", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdLessThan(String value) {
            addCriterion("REGION_SYS_ID <", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdLessThanOrEqualTo(String value) {
            addCriterion("REGION_SYS_ID <=", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdLike(String value) {
            addCriterion("REGION_SYS_ID like", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdNotLike(String value) {
            addCriterion("REGION_SYS_ID not like", value, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdIn(List<String> values) {
            addCriterion("REGION_SYS_ID in", values, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdNotIn(List<String> values) {
            addCriterion("REGION_SYS_ID not in", values, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdBetween(String value1, String value2) {
            addCriterion("REGION_SYS_ID between", value1, value2, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andRegionSysIdNotBetween(String value1, String value2) {
            addCriterion("REGION_SYS_ID not between", value1, value2, "regionSysId");
            return (Criteria) this;
        }

        public Criteria andFromSystemIsNull() {
            addCriterion("FROM_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andFromSystemIsNotNull() {
            addCriterion("FROM_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andFromSystemEqualTo(String value) {
            addCriterion("FROM_SYSTEM =", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemNotEqualTo(String value) {
            addCriterion("FROM_SYSTEM <>", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemGreaterThan(String value) {
            addCriterion("FROM_SYSTEM >", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_SYSTEM >=", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemLessThan(String value) {
            addCriterion("FROM_SYSTEM <", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemLessThanOrEqualTo(String value) {
            addCriterion("FROM_SYSTEM <=", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemLike(String value) {
            addCriterion("FROM_SYSTEM like", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemNotLike(String value) {
            addCriterion("FROM_SYSTEM not like", value, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemIn(List<String> values) {
            addCriterion("FROM_SYSTEM in", values, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemNotIn(List<String> values) {
            addCriterion("FROM_SYSTEM not in", values, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemBetween(String value1, String value2) {
            addCriterion("FROM_SYSTEM between", value1, value2, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andFromSystemNotBetween(String value1, String value2) {
            addCriterion("FROM_SYSTEM not between", value1, value2, "fromSystem");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsIsNull() {
            addCriterion("RECEIVE_NEWS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsIsNotNull() {
            addCriterion("RECEIVE_NEWS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsEqualTo(String value) {
            addCriterion("RECEIVE_NEWS =", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsNotEqualTo(String value) {
            addCriterion("RECEIVE_NEWS <>", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsGreaterThan(String value) {
            addCriterion("RECEIVE_NEWS >", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_NEWS >=", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsLessThan(String value) {
            addCriterion("RECEIVE_NEWS <", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_NEWS <=", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsLike(String value) {
            addCriterion("RECEIVE_NEWS like", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsNotLike(String value) {
            addCriterion("RECEIVE_NEWS not like", value, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsIn(List<String> values) {
            addCriterion("RECEIVE_NEWS in", values, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsNotIn(List<String> values) {
            addCriterion("RECEIVE_NEWS not in", values, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsBetween(String value1, String value2) {
            addCriterion("RECEIVE_NEWS between", value1, value2, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andReceiveNewsNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_NEWS not between", value1, value2, "receiveNews");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNull() {
            addCriterion("IS_VIP is null");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNotNull() {
            addCriterion("IS_VIP is not null");
            return (Criteria) this;
        }

        public Criteria andIsVipEqualTo(String value) {
            addCriterion("IS_VIP =", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotEqualTo(String value) {
            addCriterion("IS_VIP <>", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThan(String value) {
            addCriterion("IS_VIP >", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VIP >=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThan(String value) {
            addCriterion("IS_VIP <", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThanOrEqualTo(String value) {
            addCriterion("IS_VIP <=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLike(String value) {
            addCriterion("IS_VIP like", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotLike(String value) {
            addCriterion("IS_VIP not like", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipIn(List<String> values) {
            addCriterion("IS_VIP in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotIn(List<String> values) {
            addCriterion("IS_VIP not in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipBetween(String value1, String value2) {
            addCriterion("IS_VIP between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotBetween(String value1, String value2) {
            addCriterion("IS_VIP not between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("MEMBER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("MEMBER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("MEMBER_TYPE =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("MEMBER_TYPE <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("MEMBER_TYPE >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("MEMBER_TYPE <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("MEMBER_TYPE like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("MEMBER_TYPE not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("MEMBER_TYPE in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("MEMBER_TYPE not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccIsNull() {
            addCriterion("CUSTOMERID_MICC is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccIsNotNull() {
            addCriterion("CUSTOMERID_MICC is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccEqualTo(String value) {
            addCriterion("CUSTOMERID_MICC =", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccNotEqualTo(String value) {
            addCriterion("CUSTOMERID_MICC <>", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccGreaterThan(String value) {
            addCriterion("CUSTOMERID_MICC >", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERID_MICC >=", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccLessThan(String value) {
            addCriterion("CUSTOMERID_MICC <", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERID_MICC <=", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccLike(String value) {
            addCriterion("CUSTOMERID_MICC like", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccNotLike(String value) {
            addCriterion("CUSTOMERID_MICC not like", value, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccIn(List<String> values) {
            addCriterion("CUSTOMERID_MICC in", values, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccNotIn(List<String> values) {
            addCriterion("CUSTOMERID_MICC not in", values, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccBetween(String value1, String value2) {
            addCriterion("CUSTOMERID_MICC between", value1, value2, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andCustomeridMiccNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERID_MICC not between", value1, value2, "customeridMicc");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptIsNull() {
            addCriterion("IS_ITEMS_ACCEPT is null");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptIsNotNull() {
            addCriterion("IS_ITEMS_ACCEPT is not null");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptEqualTo(String value) {
            addCriterion("IS_ITEMS_ACCEPT =", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptNotEqualTo(String value) {
            addCriterion("IS_ITEMS_ACCEPT <>", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptGreaterThan(String value) {
            addCriterion("IS_ITEMS_ACCEPT >", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ITEMS_ACCEPT >=", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptLessThan(String value) {
            addCriterion("IS_ITEMS_ACCEPT <", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptLessThanOrEqualTo(String value) {
            addCriterion("IS_ITEMS_ACCEPT <=", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptLike(String value) {
            addCriterion("IS_ITEMS_ACCEPT like", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptNotLike(String value) {
            addCriterion("IS_ITEMS_ACCEPT not like", value, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptIn(List<String> values) {
            addCriterion("IS_ITEMS_ACCEPT in", values, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptNotIn(List<String> values) {
            addCriterion("IS_ITEMS_ACCEPT not in", values, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptBetween(String value1, String value2) {
            addCriterion("IS_ITEMS_ACCEPT between", value1, value2, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andIsItemsAcceptNotBetween(String value1, String value2) {
            addCriterion("IS_ITEMS_ACCEPT not between", value1, value2, "isItemsAccept");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeIsNull() {
            addCriterion("ITEMS_ACCEPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeIsNotNull() {
            addCriterion("ITEMS_ACCEPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeEqualTo(Date value) {
            addCriterion("ITEMS_ACCEPT_TIME =", value, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeNotEqualTo(Date value) {
            addCriterion("ITEMS_ACCEPT_TIME <>", value, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeGreaterThan(Date value) {
            addCriterion("ITEMS_ACCEPT_TIME >", value, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ITEMS_ACCEPT_TIME >=", value, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeLessThan(Date value) {
            addCriterion("ITEMS_ACCEPT_TIME <", value, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeLessThanOrEqualTo(Date value) {
            addCriterion("ITEMS_ACCEPT_TIME <=", value, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeIn(List<Date> values) {
            addCriterion("ITEMS_ACCEPT_TIME in", values, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeNotIn(List<Date> values) {
            addCriterion("ITEMS_ACCEPT_TIME not in", values, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeBetween(Date value1, Date value2) {
            addCriterion("ITEMS_ACCEPT_TIME between", value1, value2, "itemsAcceptTime");
            return (Criteria) this;
        }

        public Criteria andItemsAcceptTimeNotBetween(Date value1, Date value2) {
            addCriterion("ITEMS_ACCEPT_TIME not between", value1, value2, "itemsAcceptTime");
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