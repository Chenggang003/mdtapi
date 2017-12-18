package web.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerBackupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerBackupExample() {
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

        public Criteria andCustomerBackupSysIdIsNull() {
            addCriterion("CUSTOMER_BACKUP_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdIsNotNull() {
            addCriterion("CUSTOMER_BACKUP_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdEqualTo(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID =", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID <>", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdGreaterThan(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID >", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID >=", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdLessThan(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID <", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID <=", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdLike(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID like", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdNotLike(String value) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID not like", value, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdIn(List<String> values) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID in", values, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID not in", values, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID between", value1, value2, "customerBackupSysId");
            return (Criteria) this;
        }

        public Criteria andCustomerBackupSysIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BACKUP_SYS_ID not between", value1, value2, "customerBackupSysId");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFacebookIdIsNull() {
            addCriterion("FACEBOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andFacebookIdIsNotNull() {
            addCriterion("FACEBOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFacebookIdEqualTo(String value) {
            addCriterion("FACEBOOK_ID =", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotEqualTo(String value) {
            addCriterion("FACEBOOK_ID <>", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdGreaterThan(String value) {
            addCriterion("FACEBOOK_ID >", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACEBOOK_ID >=", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdLessThan(String value) {
            addCriterion("FACEBOOK_ID <", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdLessThanOrEqualTo(String value) {
            addCriterion("FACEBOOK_ID <=", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdLike(String value) {
            addCriterion("FACEBOOK_ID like", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotLike(String value) {
            addCriterion("FACEBOOK_ID not like", value, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdIn(List<String> values) {
            addCriterion("FACEBOOK_ID in", values, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotIn(List<String> values) {
            addCriterion("FACEBOOK_ID not in", values, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdBetween(String value1, String value2) {
            addCriterion("FACEBOOK_ID between", value1, value2, "facebookId");
            return (Criteria) this;
        }

        public Criteria andFacebookIdNotBetween(String value1, String value2) {
            addCriterion("FACEBOOK_ID not between", value1, value2, "facebookId");
            return (Criteria) this;
        }

        public Criteria andPswdIsNull() {
            addCriterion("PSWD is null");
            return (Criteria) this;
        }

        public Criteria andPswdIsNotNull() {
            addCriterion("PSWD is not null");
            return (Criteria) this;
        }

        public Criteria andPswdEqualTo(String value) {
            addCriterion("PSWD =", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotEqualTo(String value) {
            addCriterion("PSWD <>", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdGreaterThan(String value) {
            addCriterion("PSWD >", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdGreaterThanOrEqualTo(String value) {
            addCriterion("PSWD >=", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdLessThan(String value) {
            addCriterion("PSWD <", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdLessThanOrEqualTo(String value) {
            addCriterion("PSWD <=", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdLike(String value) {
            addCriterion("PSWD like", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotLike(String value) {
            addCriterion("PSWD not like", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdIn(List<String> values) {
            addCriterion("PSWD in", values, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotIn(List<String> values) {
            addCriterion("PSWD not in", values, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdBetween(String value1, String value2) {
            addCriterion("PSWD between", value1, value2, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotBetween(String value1, String value2) {
            addCriterion("PSWD not between", value1, value2, "pswd");
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

        public Criteria andBackupCreationTimeIsNull() {
            addCriterion("BACKUP_CREATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeIsNotNull() {
            addCriterion("BACKUP_CREATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeEqualTo(Date value) {
            addCriterion("BACKUP_CREATION_TIME =", value, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeNotEqualTo(Date value) {
            addCriterion("BACKUP_CREATION_TIME <>", value, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeGreaterThan(Date value) {
            addCriterion("BACKUP_CREATION_TIME >", value, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BACKUP_CREATION_TIME >=", value, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeLessThan(Date value) {
            addCriterion("BACKUP_CREATION_TIME <", value, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("BACKUP_CREATION_TIME <=", value, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeIn(List<Date> values) {
            addCriterion("BACKUP_CREATION_TIME in", values, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeNotIn(List<Date> values) {
            addCriterion("BACKUP_CREATION_TIME not in", values, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeBetween(Date value1, Date value2) {
            addCriterion("BACKUP_CREATION_TIME between", value1, value2, "backupCreationTime");
            return (Criteria) this;
        }

        public Criteria andBackupCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("BACKUP_CREATION_TIME not between", value1, value2, "backupCreationTime");
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