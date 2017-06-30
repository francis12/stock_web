package com.stock.model;

//十档行情
public class StockRealTimeLevelDO {
    private Long id;

    private Long stockRealtimeId;

    private String tradeType;

    private Double price;

    private Double amout;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStockRealtimeId() {
        return stockRealtimeId;
    }

    public void setStockRealtimeId(Long stockRealtimeId) {
        this.stockRealtimeId = stockRealtimeId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmout() {
        return amout;
    }

    public void setAmout(Double amout) {
        this.amout = amout;
    }
}