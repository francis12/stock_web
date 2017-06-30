package com.stock.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stock.dao.StockDAO;
import com.stock.model.StockDO;
import com.stock.model.StockDOCondition;
import com.stock.service.IStockService;

@Service
public class StockServiceImpl implements IStockService {

	@Resource
	private StockDAO stockDao;
	public List<StockDO> queryAllStockList() {
		StockDOCondition example = new StockDOCondition();
		stockDao.selectByCondition(example);
		return stockDao.selectByCondition(example);
	}
	public StockDO queryStockDetailByStockCode(String stockCode) {
		StockDO result = null;
		StockDOCondition example = new StockDOCondition();
		example.createCriteria().andStockCodeEqualTo(stockCode);
		List<StockDO> stockList  = stockDao.selectByCondition(example);
		if (null != stockList && stockList.size() > 0) {
			result =  stockList.get(0);
		}
		return result;
	}
}
