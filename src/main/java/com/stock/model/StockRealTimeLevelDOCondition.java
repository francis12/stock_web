package com.stock.model;

import java.util.ArrayList;
import java.util.List;

public class StockRealTimeLevelDOCondition {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockRealTimeLevelDOCondition() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdIsNull() {
            addCriterion("stock_realtime_id is null");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdIsNotNull() {
            addCriterion("stock_realtime_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdEqualTo(Long value) {
            addCriterion("stock_realtime_id =", value, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdNotEqualTo(Long value) {
            addCriterion("stock_realtime_id <>", value, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdGreaterThan(Long value) {
            addCriterion("stock_realtime_id >", value, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stock_realtime_id >=", value, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdLessThan(Long value) {
            addCriterion("stock_realtime_id <", value, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdLessThanOrEqualTo(Long value) {
            addCriterion("stock_realtime_id <=", value, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdIn(List<Long> values) {
            addCriterion("stock_realtime_id in", values, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdNotIn(List<Long> values) {
            addCriterion("stock_realtime_id not in", values, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdBetween(Long value1, Long value2) {
            addCriterion("stock_realtime_id between", value1, value2, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andStockRealtimeIdNotBetween(Long value1, Long value2) {
            addCriterion("stock_realtime_id not between", value1, value2, "stockRealtimeId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAmoutIsNull() {
            addCriterion("amout is null");
            return (Criteria) this;
        }

        public Criteria andAmoutIsNotNull() {
            addCriterion("amout is not null");
            return (Criteria) this;
        }

        public Criteria andAmoutEqualTo(Double value) {
            addCriterion("amout =", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutNotEqualTo(Double value) {
            addCriterion("amout <>", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutGreaterThan(Double value) {
            addCriterion("amout >", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutGreaterThanOrEqualTo(Double value) {
            addCriterion("amout >=", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutLessThan(Double value) {
            addCriterion("amout <", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutLessThanOrEqualTo(Double value) {
            addCriterion("amout <=", value, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutIn(List<Double> values) {
            addCriterion("amout in", values, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutNotIn(List<Double> values) {
            addCriterion("amout not in", values, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutBetween(Double value1, Double value2) {
            addCriterion("amout between", value1, value2, "amout");
            return (Criteria) this;
        }

        public Criteria andAmoutNotBetween(Double value1, Double value2) {
            addCriterion("amout not between", value1, value2, "amout");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLikeInsensitive(String value) {
            addCriterion("upper(trade_type) like", value.toUpperCase(), "tradeType");
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