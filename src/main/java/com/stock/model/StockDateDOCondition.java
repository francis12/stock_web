package com.stock.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockDateDOCondition {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockDateDOCondition() {
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

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterionForJDBCDate("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(Double value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(Double value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(Double value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(Double value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(Double value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(Double value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<Double> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<Double> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(Double value1, Double value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(Double value1, Double value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andCloseIsNull() {
            addCriterion("close is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("close is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(Double value) {
            addCriterion("close =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(Double value) {
            addCriterion("close <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(Double value) {
            addCriterion("close >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(Double value) {
            addCriterion("close >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(Double value) {
            addCriterion("close <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(Double value) {
            addCriterion("close <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<Double> values) {
            addCriterion("close in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<Double> values) {
            addCriterion("close not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(Double value1, Double value2) {
            addCriterion("close between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(Double value1, Double value2) {
            addCriterion("close not between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(Double value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(Double value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(Double value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(Double value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(Double value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(Double value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<Double> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<Double> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(Double value1, Double value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(Double value1, Double value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(Double value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(Double value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(Double value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(Double value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(Double value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(Double value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<Double> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<Double> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(Double value1, Double value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(Double value1, Double value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceIsNull() {
            addCriterion("limit_up_price is null");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceIsNotNull() {
            addCriterion("limit_up_price is not null");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceEqualTo(Double value) {
            addCriterion("limit_up_price =", value, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceNotEqualTo(Double value) {
            addCriterion("limit_up_price <>", value, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceGreaterThan(Double value) {
            addCriterion("limit_up_price >", value, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("limit_up_price >=", value, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceLessThan(Double value) {
            addCriterion("limit_up_price <", value, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceLessThanOrEqualTo(Double value) {
            addCriterion("limit_up_price <=", value, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceIn(List<Double> values) {
            addCriterion("limit_up_price in", values, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceNotIn(List<Double> values) {
            addCriterion("limit_up_price not in", values, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceBetween(Double value1, Double value2) {
            addCriterion("limit_up_price between", value1, value2, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitUpPriceNotBetween(Double value1, Double value2) {
            addCriterion("limit_up_price not between", value1, value2, "limitUpPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceIsNull() {
            addCriterion("limit_down_price is null");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceIsNotNull() {
            addCriterion("limit_down_price is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceEqualTo(Double value) {
            addCriterion("limit_down_price =", value, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceNotEqualTo(Double value) {
            addCriterion("limit_down_price <>", value, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceGreaterThan(Double value) {
            addCriterion("limit_down_price >", value, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("limit_down_price >=", value, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceLessThan(Double value) {
            addCriterion("limit_down_price <", value, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceLessThanOrEqualTo(Double value) {
            addCriterion("limit_down_price <=", value, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceIn(List<Double> values) {
            addCriterion("limit_down_price in", values, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceNotIn(List<Double> values) {
            addCriterion("limit_down_price not in", values, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceBetween(Double value1, Double value2) {
            addCriterion("limit_down_price between", value1, value2, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andLimitDownPriceNotBetween(Double value1, Double value2) {
            addCriterion("limit_down_price not between", value1, value2, "limitDownPrice");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNull() {
            addCriterion("deal_amount is null");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNotNull() {
            addCriterion("deal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDealAmountEqualTo(Double value) {
            addCriterion("deal_amount =", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotEqualTo(Double value) {
            addCriterion("deal_amount <>", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThan(Double value) {
            addCriterion("deal_amount >", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("deal_amount >=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThan(Double value) {
            addCriterion("deal_amount <", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThanOrEqualTo(Double value) {
            addCriterion("deal_amount <=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountIn(List<Double> values) {
            addCriterion("deal_amount in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotIn(List<Double> values) {
            addCriterion("deal_amount not in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountBetween(Double value1, Double value2) {
            addCriterion("deal_amount between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotBetween(Double value1, Double value2) {
            addCriterion("deal_amount not between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealMoneyIsNull() {
            addCriterion("deal_money is null");
            return (Criteria) this;
        }

        public Criteria andDealMoneyIsNotNull() {
            addCriterion("deal_money is not null");
            return (Criteria) this;
        }

        public Criteria andDealMoneyEqualTo(Double value) {
            addCriterion("deal_money =", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyNotEqualTo(Double value) {
            addCriterion("deal_money <>", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyGreaterThan(Double value) {
            addCriterion("deal_money >", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("deal_money >=", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyLessThan(Double value) {
            addCriterion("deal_money <", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyLessThanOrEqualTo(Double value) {
            addCriterion("deal_money <=", value, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyIn(List<Double> values) {
            addCriterion("deal_money in", values, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyNotIn(List<Double> values) {
            addCriterion("deal_money not in", values, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyBetween(Double value1, Double value2) {
            addCriterion("deal_money between", value1, value2, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andDealMoneyNotBetween(Double value1, Double value2) {
            addCriterion("deal_money not between", value1, value2, "dealMoney");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andStockCodeLikeInsensitive(String value) {
            addCriterion("upper(stock_code) like", value.toUpperCase(), "stockCode");
            return (Criteria) this;
        }

        public Criteria andCreatorLikeInsensitive(String value) {
            addCriterion("upper(creator) like", value.toUpperCase(), "creator");
            return (Criteria) this;
        }

        public Criteria andModifierLikeInsensitive(String value) {
            addCriterion("upper(modifier) like", value.toUpperCase(), "modifier");
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