package web.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiRequestHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiRequestHistoryExample() {
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

        public Criteria andApiRequestHistorySysIdIsNull() {
            addCriterion("API_REQUEST_HISTORY_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdIsNotNull() {
            addCriterion("API_REQUEST_HISTORY_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdEqualTo(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID =", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdNotEqualTo(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID <>", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdGreaterThan(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID >", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdGreaterThanOrEqualTo(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID >=", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdLessThan(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID <", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdLessThanOrEqualTo(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID <=", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdLike(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID like", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdNotLike(String value) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID not like", value, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdIn(List<String> values) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID in", values, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdNotIn(List<String> values) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID not in", values, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdBetween(String value1, String value2) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID between", value1, value2, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andApiRequestHistorySysIdNotBetween(String value1, String value2) {
            addCriterion("API_REQUEST_HISTORY_SYS_ID not between", value1, value2, "apiRequestHistorySysId");
            return (Criteria) this;
        }

        public Criteria andClientInfoIsNull() {
            addCriterion("CLIENT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andClientInfoIsNotNull() {
            addCriterion("CLIENT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andClientInfoEqualTo(String value) {
            addCriterion("CLIENT_INFO =", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoNotEqualTo(String value) {
            addCriterion("CLIENT_INFO <>", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoGreaterThan(String value) {
            addCriterion("CLIENT_INFO >", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_INFO >=", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoLessThan(String value) {
            addCriterion("CLIENT_INFO <", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_INFO <=", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoLike(String value) {
            addCriterion("CLIENT_INFO like", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoNotLike(String value) {
            addCriterion("CLIENT_INFO not like", value, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoIn(List<String> values) {
            addCriterion("CLIENT_INFO in", values, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoNotIn(List<String> values) {
            addCriterion("CLIENT_INFO not in", values, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoBetween(String value1, String value2) {
            addCriterion("CLIENT_INFO between", value1, value2, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andClientInfoNotBetween(String value1, String value2) {
            addCriterion("CLIENT_INFO not between", value1, value2, "clientInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoIsNull() {
            addCriterion("REQUEST_INFO is null");
            return (Criteria) this;
        }

        public Criteria andRequestInfoIsNotNull() {
            addCriterion("REQUEST_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andRequestInfoEqualTo(String value) {
            addCriterion("REQUEST_INFO =", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoNotEqualTo(String value) {
            addCriterion("REQUEST_INFO <>", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoGreaterThan(String value) {
            addCriterion("REQUEST_INFO >", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_INFO >=", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoLessThan(String value) {
            addCriterion("REQUEST_INFO <", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_INFO <=", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoLike(String value) {
            addCriterion("REQUEST_INFO like", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoNotLike(String value) {
            addCriterion("REQUEST_INFO not like", value, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoIn(List<String> values) {
            addCriterion("REQUEST_INFO in", values, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoNotIn(List<String> values) {
            addCriterion("REQUEST_INFO not in", values, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoBetween(String value1, String value2) {
            addCriterion("REQUEST_INFO between", value1, value2, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andRequestInfoNotBetween(String value1, String value2) {
            addCriterion("REQUEST_INFO not between", value1, value2, "requestInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoIsNull() {
            addCriterion("RETURN_INFO is null");
            return (Criteria) this;
        }

        public Criteria andReturnInfoIsNotNull() {
            addCriterion("RETURN_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andReturnInfoEqualTo(String value) {
            addCriterion("RETURN_INFO =", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoNotEqualTo(String value) {
            addCriterion("RETURN_INFO <>", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoGreaterThan(String value) {
            addCriterion("RETURN_INFO >", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_INFO >=", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoLessThan(String value) {
            addCriterion("RETURN_INFO <", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoLessThanOrEqualTo(String value) {
            addCriterion("RETURN_INFO <=", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoLike(String value) {
            addCriterion("RETURN_INFO like", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoNotLike(String value) {
            addCriterion("RETURN_INFO not like", value, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoIn(List<String> values) {
            addCriterion("RETURN_INFO in", values, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoNotIn(List<String> values) {
            addCriterion("RETURN_INFO not in", values, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoBetween(String value1, String value2) {
            addCriterion("RETURN_INFO between", value1, value2, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andReturnInfoNotBetween(String value1, String value2) {
            addCriterion("RETURN_INFO not between", value1, value2, "returnInfo");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNull() {
            addCriterion("REQUEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNotNull() {
            addCriterion("REQUEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeEqualTo(Date value) {
            addCriterion("REQUEST_TIME =", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotEqualTo(Date value) {
            addCriterion("REQUEST_TIME <>", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThan(Date value) {
            addCriterion("REQUEST_TIME >", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REQUEST_TIME >=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThan(Date value) {
            addCriterion("REQUEST_TIME <", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("REQUEST_TIME <=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIn(List<Date> values) {
            addCriterion("REQUEST_TIME in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotIn(List<Date> values) {
            addCriterion("REQUEST_TIME not in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeBetween(Date value1, Date value2) {
            addCriterion("REQUEST_TIME between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("REQUEST_TIME not between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIsNull() {
            addCriterion("REQUEST_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIsNotNull() {
            addCriterion("REQUEST_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andRequestMethodEqualTo(String value) {
            addCriterion("REQUEST_METHOD =", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotEqualTo(String value) {
            addCriterion("REQUEST_METHOD <>", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodGreaterThan(String value) {
            addCriterion("REQUEST_METHOD >", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_METHOD >=", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLessThan(String value) {
            addCriterion("REQUEST_METHOD <", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_METHOD <=", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodLike(String value) {
            addCriterion("REQUEST_METHOD like", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotLike(String value) {
            addCriterion("REQUEST_METHOD not like", value, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodIn(List<String> values) {
            addCriterion("REQUEST_METHOD in", values, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotIn(List<String> values) {
            addCriterion("REQUEST_METHOD not in", values, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodBetween(String value1, String value2) {
            addCriterion("REQUEST_METHOD between", value1, value2, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andRequestMethodNotBetween(String value1, String value2) {
            addCriterion("REQUEST_METHOD not between", value1, value2, "requestMethod");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNull() {
            addCriterion("EXEC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNotNull() {
            addCriterion("EXEC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExecTimeEqualTo(String value) {
            addCriterion("EXEC_TIME =", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotEqualTo(String value) {
            addCriterion("EXEC_TIME <>", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThan(String value) {
            addCriterion("EXEC_TIME >", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_TIME >=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThan(String value) {
            addCriterion("EXEC_TIME <", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThanOrEqualTo(String value) {
            addCriterion("EXEC_TIME <=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLike(String value) {
            addCriterion("EXEC_TIME like", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotLike(String value) {
            addCriterion("EXEC_TIME not like", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIn(List<String> values) {
            addCriterion("EXEC_TIME in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotIn(List<String> values) {
            addCriterion("EXEC_TIME not in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeBetween(String value1, String value2) {
            addCriterion("EXEC_TIME between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotBetween(String value1, String value2) {
            addCriterion("EXEC_TIME not between", value1, value2, "execTime");
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