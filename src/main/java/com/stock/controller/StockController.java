package com.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stock.model.StockDO;
import com.stock.service.IStockService;

@Controller
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private IStockService stockService;
	@RequestMapping
	private ModelAndView init(ModelMap map){
		ModelAndView mv = new ModelAndView("stockList");
		return mv;
	}
	@RequestMapping("/stockList")
	private ModelAndView getStockList() {
		ModelAndView mv = new ModelAndView("stockList");
		StockDO stock = stockService.queryStockDetailByStockCode("002751");
		mv.addObject(stock);
		return mv;
	}
}
