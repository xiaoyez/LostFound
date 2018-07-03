package com.lostfound.lost_found.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LostInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LostInformationExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("User_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLostIdIsNull() {
            addCriterion("Lost_ID is null");
            return (Criteria) this;
        }

        public Criteria andLostIdIsNotNull() {
            addCriterion("Lost_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLostIdEqualTo(Integer value) {
            addCriterion("Lost_ID =", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotEqualTo(Integer value) {
            addCriterion("Lost_ID <>", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThan(Integer value) {
            addCriterion("Lost_ID >", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Lost_ID >=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThan(Integer value) {
            addCriterion("Lost_ID <", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThanOrEqualTo(Integer value) {
            addCriterion("Lost_ID <=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdIn(List<Integer> values) {
            addCriterion("Lost_ID in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotIn(List<Integer> values) {
            addCriterion("Lost_ID not in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdBetween(Integer value1, Integer value2) {
            addCriterion("Lost_ID between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Lost_ID not between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostNameIsNull() {
            addCriterion("Lost_Name is null");
            return (Criteria) this;
        }

        public Criteria andLostNameIsNotNull() {
            addCriterion("Lost_Name is not null");
            return (Criteria) this;
        }

        public Criteria andLostNameEqualTo(String value) {
            addCriterion("Lost_Name =", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameNotEqualTo(String value) {
            addCriterion("Lost_Name <>", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameGreaterThan(String value) {
            addCriterion("Lost_Name >", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameGreaterThanOrEqualTo(String value) {
            addCriterion("Lost_Name >=", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameLessThan(String value) {
            addCriterion("Lost_Name <", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameLessThanOrEqualTo(String value) {
            addCriterion("Lost_Name <=", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameLike(String value) {
            addCriterion("Lost_Name like", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameNotLike(String value) {
            addCriterion("Lost_Name not like", value, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameIn(List<String> values) {
            addCriterion("Lost_Name in", values, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameNotIn(List<String> values) {
            addCriterion("Lost_Name not in", values, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameBetween(String value1, String value2) {
            addCriterion("Lost_Name between", value1, value2, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostNameNotBetween(String value1, String value2) {
            addCriterion("Lost_Name not between", value1, value2, "lostName");
            return (Criteria) this;
        }

        public Criteria andLostTypeIsNull() {
            addCriterion("Lost_Type is null");
            return (Criteria) this;
        }

        public Criteria andLostTypeIsNotNull() {
            addCriterion("Lost_Type is not null");
            return (Criteria) this;
        }

        public Criteria andLostTypeEqualTo(String value) {
            addCriterion("Lost_Type =", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeNotEqualTo(String value) {
            addCriterion("Lost_Type <>", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeGreaterThan(String value) {
            addCriterion("Lost_Type >", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Lost_Type >=", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeLessThan(String value) {
            addCriterion("Lost_Type <", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeLessThanOrEqualTo(String value) {
            addCriterion("Lost_Type <=", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeLike(String value) {
            addCriterion("Lost_Type like", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeNotLike(String value) {
            addCriterion("Lost_Type not like", value, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeIn(List<String> values) {
            addCriterion("Lost_Type in", values, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeNotIn(List<String> values) {
            addCriterion("Lost_Type not in", values, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeBetween(String value1, String value2) {
            addCriterion("Lost_Type between", value1, value2, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostTypeNotBetween(String value1, String value2) {
            addCriterion("Lost_Type not between", value1, value2, "lostType");
            return (Criteria) this;
        }

        public Criteria andLostDateIsNull() {
            addCriterion("Lost_Date is null");
            return (Criteria) this;
        }

        public Criteria andLostDateIsNotNull() {
            addCriterion("Lost_Date is not null");
            return (Criteria) this;
        }

        public Criteria andLostDateEqualTo(Date value) {
            addCriterion("Lost_Date =", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotEqualTo(Date value) {
            addCriterion("Lost_Date <>", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateGreaterThan(Date value) {
            addCriterion("Lost_Date >", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Lost_Date >=", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateLessThan(Date value) {
            addCriterion("Lost_Date <", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateLessThanOrEqualTo(Date value) {
            addCriterion("Lost_Date <=", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateIn(List<Date> values) {
            addCriterion("Lost_Date in", values, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotIn(List<Date> values) {
            addCriterion("Lost_Date not in", values, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateBetween(Date value1, Date value2) {
            addCriterion("Lost_Date between", value1, value2, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotBetween(Date value1, Date value2) {
            addCriterion("Lost_Date not between", value1, value2, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIsNull() {
            addCriterion("Lost_Place is null");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIsNotNull() {
            addCriterion("Lost_Place is not null");
            return (Criteria) this;
        }

        public Criteria andLostPlaceEqualTo(String value) {
            addCriterion("Lost_Place =", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotEqualTo(String value) {
            addCriterion("Lost_Place <>", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceGreaterThan(String value) {
            addCriterion("Lost_Place >", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("Lost_Place >=", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLessThan(String value) {
            addCriterion("Lost_Place <", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLessThanOrEqualTo(String value) {
            addCriterion("Lost_Place <=", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLike(String value) {
            addCriterion("Lost_Place like", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotLike(String value) {
            addCriterion("Lost_Place not like", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIn(List<String> values) {
            addCriterion("Lost_Place in", values, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotIn(List<String> values) {
            addCriterion("Lost_Place not in", values, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceBetween(String value1, String value2) {
            addCriterion("Lost_Place between", value1, value2, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotBetween(String value1, String value2) {
            addCriterion("Lost_Place not between", value1, value2, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPhoneIsNull() {
            addCriterion("Lost_Phone is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneIsNotNull() {
            addCriterion("Lost_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneEqualTo(String value) {
            addCriterion("Lost_Phone =", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNotEqualTo(String value) {
            addCriterion("Lost_Phone <>", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneGreaterThan(String value) {
            addCriterion("Lost_Phone >", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Lost_Phone >=", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneLessThan(String value) {
            addCriterion("Lost_Phone <", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneLessThanOrEqualTo(String value) {
            addCriterion("Lost_Phone <=", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneLike(String value) {
            addCriterion("Lost_Phone like", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNotLike(String value) {
            addCriterion("Lost_Phone not like", value, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneIn(List<String> values) {
            addCriterion("Lost_Phone in", values, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNotIn(List<String> values) {
            addCriterion("Lost_Phone not in", values, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBetween(String value1, String value2) {
            addCriterion("Lost_Phone between", value1, value2, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNotBetween(String value1, String value2) {
            addCriterion("Lost_Phone not between", value1, value2, "lostPhone");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("Report_Date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("Report_Date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Date value) {
            addCriterion("Report_Date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Date value) {
            addCriterion("Report_Date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Date value) {
            addCriterion("Report_Date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Report_Date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Date value) {
            addCriterion("Report_Date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Date value) {
            addCriterion("Report_Date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Date> values) {
            addCriterion("Report_Date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Date> values) {
            addCriterion("Report_Date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Date value1, Date value2) {
            addCriterion("Report_Date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Date value1, Date value2) {
            addCriterion("Report_Date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andLostTraitIsNull() {
            addCriterion("Lost_Trait is null");
            return (Criteria) this;
        }

        public Criteria andLostTraitIsNotNull() {
            addCriterion("Lost_Trait is not null");
            return (Criteria) this;
        }

        public Criteria andLostTraitEqualTo(String value) {
            addCriterion("Lost_Trait =", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitNotEqualTo(String value) {
            addCriterion("Lost_Trait <>", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitGreaterThan(String value) {
            addCriterion("Lost_Trait >", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitGreaterThanOrEqualTo(String value) {
            addCriterion("Lost_Trait >=", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitLessThan(String value) {
            addCriterion("Lost_Trait <", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitLessThanOrEqualTo(String value) {
            addCriterion("Lost_Trait <=", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitLike(String value) {
            addCriterion("Lost_Trait like", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitNotLike(String value) {
            addCriterion("Lost_Trait not like", value, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitIn(List<String> values) {
            addCriterion("Lost_Trait in", values, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitNotIn(List<String> values) {
            addCriterion("Lost_Trait not in", values, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitBetween(String value1, String value2) {
            addCriterion("Lost_Trait between", value1, value2, "lostTrait");
            return (Criteria) this;
        }

        public Criteria andLostTraitNotBetween(String value1, String value2) {
            addCriterion("Lost_Trait not between", value1, value2, "lostTrait");
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