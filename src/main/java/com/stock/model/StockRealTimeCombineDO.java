package com.stock.model;

import java.util.ArrayList;
import java.util.List;

public class StockRealTimeCombineDO {

	private StockRealTimeDO stockRealTimeDO;
	private List<StockRealTimeDOCondition> stockRealTimeDOConditionList;
	
	public StockRealTimeCombineDO() {
		this.stockRealTimeDOConditionList = new ArrayList<StockRealTimeDOCondition>();
	}
	public StockRealTimeDO getStockRealTimeDO() {
		return stockRealTimeDO;
	}
	public void setStockRealTimeDO(StockRealTimeDO stockRealTimeDO) {
		this.stockRealTimeDO = stockRealTimeDO;
	}
	public List<StockRealTimeDOCondition> getStockRealTimeDOConditionList() {
		return stockRealTimeDOConditionList;
	}
	public void setStockRealTimeDOConditionList(List<StockRealTimeDOCondition> stockRealTimeDOConditionList) {
		this.stockRealTimeDOConditionList = stockRealTimeDOConditionList;
	}
}
