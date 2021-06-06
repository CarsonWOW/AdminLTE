package com.javacto.po;

import java.util.ArrayList;
import java.util.List;

public class TravellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TravellerExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("traveller.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("traveller.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("traveller.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("traveller.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("traveller.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("traveller.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("traveller.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("traveller.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("traveller.id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("traveller.id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("traveller.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("traveller.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("traveller.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("traveller.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("traveller.`NAME` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("traveller.`NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("traveller.`NAME` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("traveller.`NAME` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("traveller.`NAME` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("traveller.`NAME` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("traveller.`NAME` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("traveller.`NAME` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("traveller.`NAME` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("traveller.`NAME` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("traveller.`NAME` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("traveller.`NAME` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("traveller.`NAME` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("traveller.`NAME` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("traveller.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("traveller.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("traveller.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("traveller.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("traveller.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("traveller.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("traveller.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("traveller.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("traveller.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("traveller.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("traveller.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("traveller.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("traveller.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("traveller.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("traveller.phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("traveller.phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("traveller.phoneNum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("traveller.phoneNum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("traveller.phoneNum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("traveller.phoneNum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("traveller.phoneNum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("traveller.phoneNum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("traveller.phoneNum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("traveller.phoneNum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("traveller.phoneNum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("traveller.phoneNum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("traveller.phoneNum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("traveller.phoneNum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeIsNull() {
            addCriterion("traveller.credentialsType is null");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeIsNotNull() {
            addCriterion("traveller.credentialsType is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeEqualTo(Integer value) {
            addCriterion("traveller.credentialsType =", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeNotEqualTo(Integer value) {
            addCriterion("traveller.credentialsType <>", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeGreaterThan(Integer value) {
            addCriterion("traveller.credentialsType >", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("traveller.credentialsType >=", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeLessThan(Integer value) {
            addCriterion("traveller.credentialsType <", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeLessThanOrEqualTo(Integer value) {
            addCriterion("traveller.credentialsType <=", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeIn(List<Integer> values) {
            addCriterion("traveller.credentialsType in", values, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeNotIn(List<Integer> values) {
            addCriterion("traveller.credentialsType not in", values, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeBetween(Integer value1, Integer value2) {
            addCriterion("traveller.credentialsType between", value1, value2, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("traveller.credentialsType not between", value1, value2, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumIsNull() {
            addCriterion("traveller.credentialsNum is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumIsNotNull() {
            addCriterion("traveller.credentialsNum is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumEqualTo(String value) {
            addCriterion("traveller.credentialsNum =", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumNotEqualTo(String value) {
            addCriterion("traveller.credentialsNum <>", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumGreaterThan(String value) {
            addCriterion("traveller.credentialsNum >", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumGreaterThanOrEqualTo(String value) {
            addCriterion("traveller.credentialsNum >=", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumLessThan(String value) {
            addCriterion("traveller.credentialsNum <", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumLessThanOrEqualTo(String value) {
            addCriterion("traveller.credentialsNum <=", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumLike(String value) {
            addCriterion("traveller.credentialsNum like", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumNotLike(String value) {
            addCriterion("traveller.credentialsNum not like", value, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumIn(List<String> values) {
            addCriterion("traveller.credentialsNum in", values, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumNotIn(List<String> values) {
            addCriterion("traveller.credentialsNum not in", values, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumBetween(String value1, String value2) {
            addCriterion("traveller.credentialsNum between", value1, value2, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andCredentialsnumNotBetween(String value1, String value2) {
            addCriterion("traveller.credentialsNum not between", value1, value2, "credentialsnum");
            return (Criteria) this;
        }

        public Criteria andTravellertypeIsNull() {
            addCriterion("traveller.travellerType is null");
            return (Criteria) this;
        }

        public Criteria andTravellertypeIsNotNull() {
            addCriterion("traveller.travellerType is not null");
            return (Criteria) this;
        }

        public Criteria andTravellertypeEqualTo(Integer value) {
            addCriterion("traveller.travellerType =", value, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeNotEqualTo(Integer value) {
            addCriterion("traveller.travellerType <>", value, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeGreaterThan(Integer value) {
            addCriterion("traveller.travellerType >", value, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("traveller.travellerType >=", value, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeLessThan(Integer value) {
            addCriterion("traveller.travellerType <", value, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeLessThanOrEqualTo(Integer value) {
            addCriterion("traveller.travellerType <=", value, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeIn(List<Integer> values) {
            addCriterion("traveller.travellerType in", values, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeNotIn(List<Integer> values) {
            addCriterion("traveller.travellerType not in", values, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeBetween(Integer value1, Integer value2) {
            addCriterion("traveller.travellerType between", value1, value2, "travellertype");
            return (Criteria) this;
        }

        public Criteria andTravellertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("traveller.travellerType not between", value1, value2, "travellertype");
            return (Criteria) this;
        }
    }

    /**
     */
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