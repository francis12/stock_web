package com.stock.model;

import java.util.Date;

public class StockDateDO {
    private String stockCode;

    private Date tradeDate;

    private Double open;

    private Double close;

    private Double high;

    private Double low;

    private Double limitUpPrice;

    private Double limitDownPrice;

    private Double dealAmount;

    private Double dealMoney;

    private String creator;

    private String modifier;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getLimitUpPrice() {
        return limitUpPrice;
    }

    public void setLimitUpPrice(Double limitUpPrice) {
        this.limitUpPrice = limitUpPrice;
    }

    public Double getLimitDownPrice() {
        return limitDownPrice;
    }

    public void setLimitDownPrice(Double limitDownPrice) {
        this.limitDownPrice = limitDownPrice;
    }

    public Double getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Double dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Double getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(Double dealMoney) {
        this.dealMoney = dealMoney;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }
}