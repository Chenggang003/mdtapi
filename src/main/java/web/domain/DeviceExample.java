package web.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
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

        public Criteria andCategorySysIdIsNull() {
            addCriterion("CATEGORY_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdIsNotNull() {
            addCriterion("CATEGORY_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdEqualTo(String value) {
            addCriterion("CATEGORY_SYS_ID =", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdNotEqualTo(String value) {
            addCriterion("CATEGORY_SYS_ID <>", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdGreaterThan(String value) {
            addCriterion("CATEGORY_SYS_ID >", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_SYS_ID >=", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdLessThan(String value) {
            addCriterion("CATEGORY_SYS_ID <", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_SYS_ID <=", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdLike(String value) {
            addCriterion("CATEGORY_SYS_ID like", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdNotLike(String value) {
            addCriterion("CATEGORY_SYS_ID not like", value, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdIn(List<String> values) {
            addCriterion("CATEGORY_SYS_ID in", values, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdNotIn(List<String> values) {
            addCriterion("CATEGORY_SYS_ID not in", values, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdBetween(String value1, String value2) {
            addCriterion("CATEGORY_SYS_ID between", value1, value2, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCategorySysIdNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_SYS_ID not between", value1, value2, "categorySysId");
            return (Criteria) this;
        }

        public Criteria andCateidMiccIsNull() {
            addCriterion("CATEID_MICC is null");
            return (Criteria) this;
        }

        public Criteria andCateidMiccIsNotNull() {
            addCriterion("CATEID_MICC is not null");
            return (Criteria) this;
        }

        public Criteria andCateidMiccEqualTo(String value) {
            addCriterion("CATEID_MICC =", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccNotEqualTo(String value) {
            addCriterion("CATEID_MICC <>", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccGreaterThan(String value) {
            addCriterion("CATEID_MICC >", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccGreaterThanOrEqualTo(String value) {
            addCriterion("CATEID_MICC >=", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccLessThan(String value) {
            addCriterion("CATEID_MICC <", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccLessThanOrEqualTo(String value) {
            addCriterion("CATEID_MICC <=", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccLike(String value) {
            addCriterion("CATEID_MICC like", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccNotLike(String value) {
            addCriterion("CATEID_MICC not like", value, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccIn(List<String> values) {
            addCriterion("CATEID_MICC in", values, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccNotIn(List<String> values) {
            addCriterion("CATEID_MICC not in", values, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccBetween(String value1, String value2) {
            addCriterion("CATEID_MICC between", value1, value2, "cateidMicc");
            return (Criteria) this;
        }

        public Criteria andCateidMiccNotBetween(String value1, String value2) {
            addCriterion("CATEID_MICC not between", value1, value2, "cateidMicc");
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