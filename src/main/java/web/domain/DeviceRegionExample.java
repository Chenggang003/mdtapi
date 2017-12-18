package web.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceRegionExample() {
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

        public Criteria andDeviceRegionSysIdIsNull() {
            addCriterion("DEVICE_REGION_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdIsNotNull() {
            addCriterion("DEVICE_REGION_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdEqualTo(String value) {
            addCriterion("DEVICE_REGION_SYS_ID =", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdNotEqualTo(String value) {
            addCriterion("DEVICE_REGION_SYS_ID <>", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdGreaterThan(String value) {
            addCriterion("DEVICE_REGION_SYS_ID >", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_REGION_SYS_ID >=", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdLessThan(String value) {
            addCriterion("DEVICE_REGION_SYS_ID <", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_REGION_SYS_ID <=", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdLike(String value) {
            addCriterion("DEVICE_REGION_SYS_ID like", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdNotLike(String value) {
            addCriterion("DEVICE_REGION_SYS_ID not like", value, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdIn(List<String> values) {
            addCriterion("DEVICE_REGION_SYS_ID in", values, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdNotIn(List<String> values) {
            addCriterion("DEVICE_REGION_SYS_ID not in", values, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdBetween(String value1, String value2) {
            addCriterion("DEVICE_REGION_SYS_ID between", value1, value2, "deviceRegionSysId");
            return (Criteria) this;
        }

        public Criteria andDeviceRegionSysIdNotBetween(String value1, String value2) {
            addCriterion("DEVICE_REGION_SYS_ID not between", value1, value2, "deviceRegionSysId");
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