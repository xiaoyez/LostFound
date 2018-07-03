package com.lostfound.lost_found.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PickInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PickInformationExample() {
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

        public Criteria andPickIdIsNull() {
            addCriterion("Pick_ID is null");
            return (Criteria) this;
        }

        public Criteria andPickIdIsNotNull() {
            addCriterion("Pick_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPickIdEqualTo(Integer value) {
            addCriterion("Pick_ID =", value, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdNotEqualTo(Integer value) {
            addCriterion("Pick_ID <>", value, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdGreaterThan(Integer value) {
            addCriterion("Pick_ID >", value, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pick_ID >=", value, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdLessThan(Integer value) {
            addCriterion("Pick_ID <", value, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdLessThanOrEqualTo(Integer value) {
            addCriterion("Pick_ID <=", value, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdIn(List<Integer> values) {
            addCriterion("Pick_ID in", values, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdNotIn(List<Integer> values) {
            addCriterion("Pick_ID not in", values, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdBetween(Integer value1, Integer value2) {
            addCriterion("Pick_ID between", value1, value2, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Pick_ID not between", value1, value2, "pickId");
            return (Criteria) this;
        }

        public Criteria andPickNameIsNull() {
            addCriterion("Pick_Name is null");
            return (Criteria) this;
        }

        public Criteria andPickNameIsNotNull() {
            addCriterion("Pick_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPickNameEqualTo(String value) {
            addCriterion("Pick_Name =", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameNotEqualTo(String value) {
            addCriterion("Pick_Name <>", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameGreaterThan(String value) {
            addCriterion("Pick_Name >", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameGreaterThanOrEqualTo(String value) {
            addCriterion("Pick_Name >=", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameLessThan(String value) {
            addCriterion("Pick_Name <", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameLessThanOrEqualTo(String value) {
            addCriterion("Pick_Name <=", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameLike(String value) {
            addCriterion("Pick_Name like", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameNotLike(String value) {
            addCriterion("Pick_Name not like", value, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameIn(List<String> values) {
            addCriterion("Pick_Name in", values, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameNotIn(List<String> values) {
            addCriterion("Pick_Name not in", values, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameBetween(String value1, String value2) {
            addCriterion("Pick_Name between", value1, value2, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickNameNotBetween(String value1, String value2) {
            addCriterion("Pick_Name not between", value1, value2, "pickName");
            return (Criteria) this;
        }

        public Criteria andPickTypeIsNull() {
            addCriterion("Pick_Type is null");
            return (Criteria) this;
        }

        public Criteria andPickTypeIsNotNull() {
            addCriterion("Pick_Type is not null");
            return (Criteria) this;
        }

        public Criteria andPickTypeEqualTo(String value) {
            addCriterion("Pick_Type =", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeNotEqualTo(String value) {
            addCriterion("Pick_Type <>", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeGreaterThan(String value) {
            addCriterion("Pick_Type >", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Pick_Type >=", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeLessThan(String value) {
            addCriterion("Pick_Type <", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeLessThanOrEqualTo(String value) {
            addCriterion("Pick_Type <=", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeLike(String value) {
            addCriterion("Pick_Type like", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeNotLike(String value) {
            addCriterion("Pick_Type not like", value, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeIn(List<String> values) {
            addCriterion("Pick_Type in", values, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeNotIn(List<String> values) {
            addCriterion("Pick_Type not in", values, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeBetween(String value1, String value2) {
            addCriterion("Pick_Type between", value1, value2, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickTypeNotBetween(String value1, String value2) {
            addCriterion("Pick_Type not between", value1, value2, "pickType");
            return (Criteria) this;
        }

        public Criteria andPickDateIsNull() {
            addCriterion("Pick_Date is null");
            return (Criteria) this;
        }

        public Criteria andPickDateIsNotNull() {
            addCriterion("Pick_Date is not null");
            return (Criteria) this;
        }

        public Criteria andPickDateEqualTo(Date value) {
            addCriterion("Pick_Date =", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateNotEqualTo(Date value) {
            addCriterion("Pick_Date <>", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateGreaterThan(Date value) {
            addCriterion("Pick_Date >", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Pick_Date >=", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateLessThan(Date value) {
            addCriterion("Pick_Date <", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateLessThanOrEqualTo(Date value) {
            addCriterion("Pick_Date <=", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateIn(List<Date> values) {
            addCriterion("Pick_Date in", values, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateNotIn(List<Date> values) {
            addCriterion("Pick_Date not in", values, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateBetween(Date value1, Date value2) {
            addCriterion("Pick_Date between", value1, value2, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateNotBetween(Date value1, Date value2) {
            addCriterion("Pick_Date not between", value1, value2, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickPlaceIsNull() {
            addCriterion("Pick_Place is null");
            return (Criteria) this;
        }

        public Criteria andPickPlaceIsNotNull() {
            addCriterion("Pick_Place is not null");
            return (Criteria) this;
        }

        public Criteria andPickPlaceEqualTo(String value) {
            addCriterion("Pick_Place =", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotEqualTo(String value) {
            addCriterion("Pick_Place <>", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceGreaterThan(String value) {
            addCriterion("Pick_Place >", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("Pick_Place >=", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceLessThan(String value) {
            addCriterion("Pick_Place <", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceLessThanOrEqualTo(String value) {
            addCriterion("Pick_Place <=", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceLike(String value) {
            addCriterion("Pick_Place like", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotLike(String value) {
            addCriterion("Pick_Place not like", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceIn(List<String> values) {
            addCriterion("Pick_Place in", values, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotIn(List<String> values) {
            addCriterion("Pick_Place not in", values, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceBetween(String value1, String value2) {
            addCriterion("Pick_Place between", value1, value2, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotBetween(String value1, String value2) {
            addCriterion("Pick_Place not between", value1, value2, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPhoneIsNull() {
            addCriterion("Pick_Phone is null");
            return (Criteria) this;
        }

        public Criteria andPickPhoneIsNotNull() {
            addCriterion("Pick_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPickPhoneEqualTo(String value) {
            addCriterion("Pick_Phone =", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneNotEqualTo(String value) {
            addCriterion("Pick_Phone <>", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneGreaterThan(String value) {
            addCriterion("Pick_Phone >", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Pick_Phone >=", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneLessThan(String value) {
            addCriterion("Pick_Phone <", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneLessThanOrEqualTo(String value) {
            addCriterion("Pick_Phone <=", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneLike(String value) {
            addCriterion("Pick_Phone like", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneNotLike(String value) {
            addCriterion("Pick_Phone not like", value, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneIn(List<String> values) {
            addCriterion("Pick_Phone in", values, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneNotIn(List<String> values) {
            addCriterion("Pick_Phone not in", values, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneBetween(String value1, String value2) {
            addCriterion("Pick_Phone between", value1, value2, "pickPhone");
            return (Criteria) this;
        }

        public Criteria andPickPhoneNotBetween(String value1, String value2) {
            addCriterion("Pick_Phone not between", value1, value2, "pickPhone");
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

        public Criteria andPickTraitIsNull() {
            addCriterion("Pick_Trait is null");
            return (Criteria) this;
        }

        public Criteria andPickTraitIsNotNull() {
            addCriterion("Pick_Trait is not null");
            return (Criteria) this;
        }

        public Criteria andPickTraitEqualTo(String value) {
            addCriterion("Pick_Trait =", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitNotEqualTo(String value) {
            addCriterion("Pick_Trait <>", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitGreaterThan(String value) {
            addCriterion("Pick_Trait >", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitGreaterThanOrEqualTo(String value) {
            addCriterion("Pick_Trait >=", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitLessThan(String value) {
            addCriterion("Pick_Trait <", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitLessThanOrEqualTo(String value) {
            addCriterion("Pick_Trait <=", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitLike(String value) {
            addCriterion("Pick_Trait like", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitNotLike(String value) {
            addCriterion("Pick_Trait not like", value, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitIn(List<String> values) {
            addCriterion("Pick_Trait in", values, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitNotIn(List<String> values) {
            addCriterion("Pick_Trait not in", values, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitBetween(String value1, String value2) {
            addCriterion("Pick_Trait between", value1, value2, "pickTrait");
            return (Criteria) this;
        }

        public Criteria andPickTraitNotBetween(String value1, String value2) {
            addCriterion("Pick_Trait not between", value1, value2, "pickTrait");
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