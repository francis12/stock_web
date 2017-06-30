package com.stock.service;

import java.util.List;

import com.stock.model.StockDO;

public interface IStockService {

	public List<StockDO> queryAllStockList();
	public StockDO queryStockDetailByStockCode(String stockCode);
}
