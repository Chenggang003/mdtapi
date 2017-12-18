package web.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerLoginFailHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerLoginFailHistoryExample() {
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

        public Criteria andCustomerLoginFailHistorySysIdIsNull() {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdIsNotNull() {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdEqualTo(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID =", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID <>", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdGreaterThan(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID >", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID >=", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdLessThan(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID <", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID <=", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdLike(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID like", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdNotLike(String value) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID not like", value, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdIn(List<String> values) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID in", values, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID not in", values, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID between", value1, value2, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andCustomerLoginFailHistorySysIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LOGIN_FAIL_HISTORY_SYS_ID not between", value1, value2, "customerLoginFailHistorySysId");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("LOGIN_TIME =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("LOGIN_TIME <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("LOGIN_TIME >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("LOGIN_TIME <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("LOGIN_TIME in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("LOGIN_TIME not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andSourceIpIsNull() {
            addCriterion("SOURCE_IP is null");
            return (Criteria) this;
        }

        public Criteria andSourceIpIsNotNull() {
            addCriterion("SOURCE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIpEqualTo(String value) {
            addCriterion("SOURCE_IP =", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotEqualTo(String value) {
            addCriterion("SOURCE_IP <>", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpGreaterThan(String value) {
            addCriterion("SOURCE_IP >", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_IP >=", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpLessThan(String value) {
            addCriterion("SOURCE_IP <", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_IP <=", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpLike(String value) {
            addCriterion("SOURCE_IP like", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotLike(String value) {
            addCriterion("SOURCE_IP not like", value, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpIn(List<String> values) {
            addCriterion("SOURCE_IP in", values, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotIn(List<String> values) {
            addCriterion("SOURCE_IP not in", values, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpBetween(String value1, String value2) {
            addCriterion("SOURCE_IP between", value1, value2, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andSourceIpNotBetween(String value1, String value2) {
            addCriterion("SOURCE_IP not between", value1, value2, "sourceIp");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("BROWSER is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("BROWSER is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("BROWSER =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("BROWSER <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("BROWSER >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("BROWSER >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("BROWSER <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("BROWSER <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("BROWSER like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("BROWSER not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("BROWSER in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("BROWSER not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("BROWSER between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("BROWSER not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageIsNull() {
            addCriterion("ACCEPT_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageIsNotNull() {
            addCriterion("ACCEPT_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageEqualTo(String value) {
            addCriterion("ACCEPT_LANGUAGE =", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageNotEqualTo(String value) {
            addCriterion("ACCEPT_LANGUAGE <>", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageGreaterThan(String value) {
            addCriterion("ACCEPT_LANGUAGE >", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPT_LANGUAGE >=", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageLessThan(String value) {
            addCriterion("ACCEPT_LANGUAGE <", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageLessThanOrEqualTo(String value) {
            addCriterion("ACCEPT_LANGUAGE <=", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageLike(String value) {
            addCriterion("ACCEPT_LANGUAGE like", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageNotLike(String value) {
            addCriterion("ACCEPT_LANGUAGE not like", value, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageIn(List<String> values) {
            addCriterion("ACCEPT_LANGUAGE in", values, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageNotIn(List<String> values) {
            addCriterion("ACCEPT_LANGUAGE not in", values, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageBetween(String value1, String value2) {
            addCriterion("ACCEPT_LANGUAGE between", value1, value2, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andAcceptLanguageNotBetween(String value1, String value2) {
            addCriterion("ACCEPT_LANGUAGE not between", value1, value2, "acceptLanguage");
            return (Criteria) this;
        }

        public Criteria andForwardUrlIsNull() {
            addCriterion("FORWARD_URL is null");
            return (Criteria) this;
        }

        public Criteria andForwardUrlIsNotNull() {
            addCriterion("FORWARD_URL is not null");
            return (Criteria) this;
        }

        public Criteria andForwardUrlEqualTo(String value) {
            addCriterion("FORWARD_URL =", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotEqualTo(String value) {
            addCriterion("FORWARD_URL <>", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlGreaterThan(String value) {
            addCriterion("FORWARD_URL >", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FORWARD_URL >=", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlLessThan(String value) {
            addCriterion("FORWARD_URL <", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlLessThanOrEqualTo(String value) {
            addCriterion("FORWARD_URL <=", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlLike(String value) {
            addCriterion("FORWARD_URL like", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotLike(String value) {
            addCriterion("FORWARD_URL not like", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlIn(List<String> values) {
            addCriterion("FORWARD_URL in", values, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotIn(List<String> values) {
            addCriterion("FORWARD_URL not in", values, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlBetween(String value1, String value2) {
            addCriterion("FORWARD_URL between", value1, value2, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotBetween(String value1, String value2) {
            addCriterion("FORWARD_URL not between", value1, value2, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNull() {
            addCriterion("CUSTOMER_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNotNull() {
            addCriterion("CUSTOMER_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT =", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT <>", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThan(String value) {
            addCriterion("CUSTOMER_ACCOUNT >", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT >=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThan(String value) {
            addCriterion("CUSTOMER_ACCOUNT <", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT <=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLike(String value) {
            addCriterion("CUSTOMER_ACCOUNT like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotLike(String value) {
            addCriterion("CUSTOMER_ACCOUNT not like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIn(List<String> values) {
            addCriterion("CUSTOMER_ACCOUNT in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotIn(List<String> values) {
            addCriterion("CUSTOMER_ACCOUNT not in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ACCOUNT between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ACCOUNT not between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNull() {
            addCriterion("SERVER_PORT is null");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNotNull() {
            addCriterion("SERVER_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andServerPortEqualTo(String value) {
            addCriterion("SERVER_PORT =", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotEqualTo(String value) {
            addCriterion("SERVER_PORT <>", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThan(String value) {
            addCriterion("SERVER_PORT >", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_PORT >=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThan(String value) {
            addCriterion("SERVER_PORT <", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThanOrEqualTo(String value) {
            addCriterion("SERVER_PORT <=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLike(String value) {
            addCriterion("SERVER_PORT like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotLike(String value) {
            addCriterion("SERVER_PORT not like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIn(List<String> values) {
            addCriterion("SERVER_PORT in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotIn(List<String> values) {
            addCriterion("SERVER_PORT not in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortBetween(String value1, String value2) {
            addCriterion("SERVER_PORT between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotBetween(String value1, String value2) {
            addCriterion("SERVER_PORT not between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("ERROR_CODE =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("ERROR_CODE <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("ERROR_CODE >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("ERROR_CODE <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("ERROR_CODE like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("ERROR_CODE not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("ERROR_CODE in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("ERROR_CODE not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("ERROR_CODE between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdIsNull() {
            addCriterion("CUSTOMER_PSWD is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdIsNotNull() {
            addCriterion("CUSTOMER_PSWD is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdEqualTo(String value) {
            addCriterion("CUSTOMER_PSWD =", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdNotEqualTo(String value) {
            addCriterion("CUSTOMER_PSWD <>", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdGreaterThan(String value) {
            addCriterion("CUSTOMER_PSWD >", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PSWD >=", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdLessThan(String value) {
            addCriterion("CUSTOMER_PSWD <", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PSWD <=", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdLike(String value) {
            addCriterion("CUSTOMER_PSWD like", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdNotLike(String value) {
            addCriterion("CUSTOMER_PSWD not like", value, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdIn(List<String> values) {
            addCriterion("CUSTOMER_PSWD in", values, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdNotIn(List<String> values) {
            addCriterion("CUSTOMER_PSWD not in", values, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PSWD between", value1, value2, "customerPswd");
            return (Criteria) this;
        }

        public Criteria andCustomerPswdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PSWD not between", value1, value2, "customerPswd");
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