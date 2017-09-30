package com.lottery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lottery.service.ILotteryService;
import com.lottery.strategy.ILotteryStrategy;

@Controller
@RequestMapping("/ds")
public class DsController {

	@Autowired
	@Qualifier("Last1LotteryStrategy")
	private ILotteryStrategy lotteryStrategy;

	@RequestMapping(value="/random", method= {RequestMethod.GET})
	private ModelAndView init(ModelMap map) {
		ModelAndView mv = new ModelAndView("random");
		return mv;
	}

	@ResponseBody
	@RequestMapping(value="/data", method= {RequestMethod.POST})
	public String lotterdata() {
		String result = "";
		try {
			result = "{\"ret\":0,\"caipiao\":\"chongqing\",\"prizes\":[{\"peroid\":\"20170919086\",\"prize\":\"55530\"},{\"peroid\":\"20170919087\",\"prize\":\"68006\"},{\"peroid\":\"20170919088\",\"prize\":\"53607\"},{\"peroid\":\"20170919089\",\"prize\":\"22044\"},{\"peroid\":\"20170919090\",\"prize\":\"10328\"},{\"peroid\":\"20170919091\",\"prize\":\"40112\"},{\"peroid\":\"20170919092\",\"prize\":\"77897\"},{\"peroid\":\"20170919093\",\"prize\":\"97088\"},{\"peroid\":\"20170919094\",\"prize\":\"93836\"},{\"peroid\":\"20170919095\",\"prize\":\"99832\"},{\"peroid\":\"20170919096\",\"prize\":\"59481\"},{\"peroid\":\"20170919097\",\"prize\":\"79115\"},{\"peroid\":\"20170919098\",\"prize\":\"73861\"},{\"peroid\":\"20170919099\",\"prize\":\"41643\"},{\"peroid\":\"20170919100\",\"prize\":\"71092\"},{\"peroid\":\"20170919101\",\"prize\":\"13194\"},{\"peroid\":\"20170919102\",\"prize\":\"41899\"},{\"peroid\":\"20170919103\",\"prize\":\"15866\"},{\"peroid\":\"20170919104\",\"prize\":\"80284\"},{\"peroid\":\"20170919105\",\"prize\":\"40796\"},{\"peroid\":\"20170919106\",\"prize\":\"48781\"},{\"peroid\":\"20170919107\",\"prize\":\"92688\"},{\"peroid\":\"20170919108\",\"prize\":\"99864\"},{\"peroid\":\"20170919109\",\"prize\":\"19749\"},{\"peroid\":\"20170919110\",\"prize\":\"94753\"},{\"peroid\":\"20170919111\",\"prize\":\"06872\"},{\"peroid\":\"20170919112\",\"prize\":\"22628\"},{\"peroid\":\"20170919113\",\"prize\":\"34621\"},{\"peroid\":\"20170919114\",\"prize\":\"05788\"},{\"peroid\":\"20170919115\",\"prize\":\"09622\"},{\"peroid\":\"20170919116\",\"prize\":\"11315\"},{\"peroid\":\"20170919117\",\"prize\":\"13328\"},{\"peroid\":\"20170919118\",\"prize\":\"27310\"},{\"peroid\":\"20170919119\",\"prize\":\"22482\"},{\"peroid\":\"20170919120\",\"prize\":\"67492\"},{\"peroid\":\"20170920001\",\"prize\":\"57157\"},{\"peroid\":\"20170920002\",\"prize\":\"05740\"},{\"peroid\":\"20170920003\",\"prize\":\"90868\"},{\"peroid\":\"20170920004\",\"prize\":\"50779\"},{\"peroid\":\"20170920005\",\"prize\":\"58414\"},{\"peroid\":\"20170920006\",\"prize\":\"29747\"},{\"peroid\":\"20170920007\",\"prize\":\"31430\"},{\"peroid\":\"20170920008\",\"prize\":\"61108\"},{\"peroid\":\"20170920009\",\"prize\":\"95126\"},{\"peroid\":\"20170920010\",\"prize\":\"07120\"},{\"peroid\":\"20170920011\",\"prize\":\"45602\"},{\"peroid\":\"20170920012\",\"prize\":\"46938\"},{\"peroid\":\"20170920013\",\"prize\":\"39628\"},{\"peroid\":\"20170920014\",\"prize\":\"60600\"},{\"peroid\":\"20170920015\",\"prize\":\"38760\"},{\"peroid\":\"20170920016\",\"prize\":\"06023\"},{\"peroid\":\"20170920017\",\"prize\":\"54468\"},{\"peroid\":\"20170920018\",\"prize\":\"26060\"},{\"peroid\":\"20170920019\",\"prize\":\"95306\"},{\"peroid\":\"20170920020\",\"prize\":\"55824\"},{\"peroid\":\"20170920021\",\"prize\":\"25732\"},{\"peroid\":\"20170920022\",\"prize\":\"22214\"},{\"peroid\":\"20170920023\",\"prize\":\"54214\"},{\"peroid\":\"20170920024\",\"prize\":\"47975\"},{\"peroid\":\"20170920025\",\"prize\":\"23560\"},{\"peroid\":\"20170920026\",\"prize\":\"68813\"},{\"peroid\":\"20170920027\",\"prize\":\"86668\"},{\"peroid\":\"20170920028\",\"prize\":\"47572\"},{\"peroid\":\"20170920029\",\"prize\":\"65977\"},{\"peroid\":\"20170920030\",\"prize\":\"55728\"},{\"peroid\":\"20170920031\",\"prize\":\"53241\"},{\"peroid\":\"20170920032\",\"prize\":\"03970\"},{\"peroid\":\"20170920033\",\"prize\":\"26787\"},{\"peroid\":\"20170920034\",\"prize\":\"08925\"},{\"peroid\":\"20170920035\",\"prize\":\"71958\"},{\"peroid\":\"20170920036\",\"prize\":\"38770\"},{\"peroid\":\"20170920037\",\"prize\":\"09743\"},{\"peroid\":\"20170920038\",\"prize\":\"93950\"},{\"peroid\":\"20170920039\",\"prize\":\"38209\"},{\"peroid\":\"20170920040\",\"prize\":\"18844\"},{\"peroid\":\"20170920041\",\"prize\":\"25632\"},{\"peroid\":\"20170920042\",\"prize\":\"49025\"},{\"peroid\":\"20170920043\",\"prize\":\"65776\"},{\"peroid\":\"20170920044\",\"prize\":\"81921\"},{\"peroid\":\"20170920045\",\"prize\":\"46986\"},{\"peroid\":\"20170920046\",\"prize\":\"44899\"},{\"peroid\":\"20170920047\",\"prize\":\"68562\"},{\"peroid\":\"20170920048\",\"prize\":\"83267\"},{\"peroid\":\"20170920049\",\"prize\":\"16924\"},{\"peroid\":\"20170920050\",\"prize\":\"03078\"},{\"peroid\":\"20170920051\",\"prize\":\"18056\"},{\"peroid\":\"20170920052\",\"prize\":\"14750\"},{\"peroid\":\"20170920053\",\"prize\":\"36354\"},{\"peroid\":\"20170920054\",\"prize\":\"54773\"},{\"peroid\":\"20170920055\",\"prize\":\"41740\"},{\"peroid\":\"20170920056\",\"prize\":\"00028\"},{\"peroid\":\"20170920057\",\"prize\":\"43748\"},{\"peroid\":\"20170920058\",\"prize\":\"09575\"},{\"peroid\":\"20170920059\",\"prize\":\"43632\"},{\"peroid\":\"20170920060\",\"prize\":\"78254\"},{\"peroid\":\"20170920061\",\"prize\":\"88878\"},{\"peroid\":\"20170920062\",\"prize\":\"83593\"},{\"peroid\":\"20170920063\",\"prize\":\"73491\"},{\"peroid\":\"20170920064\",\"prize\":\"71155\"},{\"peroid\":\"20170920065\",\"prize\":\"62571\"}],\"recentid\":20170920065}";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/init", method= {RequestMethod.POST})
	public String initdata() {
		String result = "";
		try {
			result = "{\"ret\":0,\"caipiao\":\"chongqing\",\"prizes\":[{\"peroid\":\"20170919086\",\"prize\":\"55530\"},{\"peroid\":\"20170919087\",\"prize\":\"68006\"},{\"peroid\":\"20170919088\",\"prize\":\"53607\"},{\"peroid\":\"20170919089\",\"prize\":\"22044\"},{\"peroid\":\"20170919090\",\"prize\":\"10328\"},{\"peroid\":\"20170919091\",\"prize\":\"40112\"},{\"peroid\":\"20170919092\",\"prize\":\"77897\"},{\"peroid\":\"20170919093\",\"prize\":\"97088\"},{\"peroid\":\"20170919094\",\"prize\":\"93836\"},{\"peroid\":\"20170919095\",\"prize\":\"99832\"},{\"peroid\":\"20170919096\",\"prize\":\"59481\"},{\"peroid\":\"20170919097\",\"prize\":\"79115\"},{\"peroid\":\"20170919098\",\"prize\":\"73861\"},{\"peroid\":\"20170919099\",\"prize\":\"41643\"},{\"peroid\":\"20170919100\",\"prize\":\"71092\"},{\"peroid\":\"20170919101\",\"prize\":\"13194\"},{\"peroid\":\"20170919102\",\"prize\":\"41899\"},{\"peroid\":\"20170919103\",\"prize\":\"15866\"},{\"peroid\":\"20170919104\",\"prize\":\"80284\"},{\"peroid\":\"20170919105\",\"prize\":\"40796\"},{\"peroid\":\"20170919106\",\"prize\":\"48781\"},{\"peroid\":\"20170919107\",\"prize\":\"92688\"},{\"peroid\":\"20170919108\",\"prize\":\"99864\"},{\"peroid\":\"20170919109\",\"prize\":\"19749\"},{\"peroid\":\"20170919110\",\"prize\":\"94753\"},{\"peroid\":\"20170919111\",\"prize\":\"06872\"},{\"peroid\":\"20170919112\",\"prize\":\"22628\"},{\"peroid\":\"20170919113\",\"prize\":\"34621\"},{\"peroid\":\"20170919114\",\"prize\":\"05788\"},{\"peroid\":\"20170919115\",\"prize\":\"09622\"},{\"peroid\":\"20170919116\",\"prize\":\"11315\"},{\"peroid\":\"20170919117\",\"prize\":\"13328\"},{\"peroid\":\"20170919118\",\"prize\":\"27310\"},{\"peroid\":\"20170919119\",\"prize\":\"22482\"},{\"peroid\":\"20170919120\",\"prize\":\"67492\"},{\"peroid\":\"20170920001\",\"prize\":\"57157\"},{\"peroid\":\"20170920002\",\"prize\":\"05740\"},{\"peroid\":\"20170920003\",\"prize\":\"90868\"},{\"peroid\":\"20170920004\",\"prize\":\"50779\"},{\"peroid\":\"20170920005\",\"prize\":\"58414\"},{\"peroid\":\"20170920006\",\"prize\":\"29747\"},{\"peroid\":\"20170920007\",\"prize\":\"31430\"},{\"peroid\":\"20170920008\",\"prize\":\"61108\"},{\"peroid\":\"20170920009\",\"prize\":\"95126\"},{\"peroid\":\"20170920010\",\"prize\":\"07120\"},{\"peroid\":\"20170920011\",\"prize\":\"45602\"},{\"peroid\":\"20170920012\",\"prize\":\"46938\"},{\"peroid\":\"20170920013\",\"prize\":\"39628\"},{\"peroid\":\"20170920014\",\"prize\":\"60600\"},{\"peroid\":\"20170920015\",\"prize\":\"38760\"},{\"peroid\":\"20170920016\",\"prize\":\"06023\"},{\"peroid\":\"20170920017\",\"prize\":\"54468\"},{\"peroid\":\"20170920018\",\"prize\":\"26060\"},{\"peroid\":\"20170920019\",\"prize\":\"95306\"},{\"peroid\":\"20170920020\",\"prize\":\"55824\"},{\"peroid\":\"20170920021\",\"prize\":\"25732\"},{\"peroid\":\"20170920022\",\"prize\":\"22214\"},{\"peroid\":\"20170920023\",\"prize\":\"54214\"},{\"peroid\":\"20170920024\",\"prize\":\"47975\"},{\"peroid\":\"20170920025\",\"prize\":\"23560\"},{\"peroid\":\"20170920026\",\"prize\":\"68813\"},{\"peroid\":\"20170920027\",\"prize\":\"86668\"},{\"peroid\":\"20170920028\",\"prize\":\"47572\"},{\"peroid\":\"20170920029\",\"prize\":\"65977\"},{\"peroid\":\"20170920030\",\"prize\":\"55728\"},{\"peroid\":\"20170920031\",\"prize\":\"53241\"},{\"peroid\":\"20170920032\",\"prize\":\"03970\"},{\"peroid\":\"20170920033\",\"prize\":\"26787\"},{\"peroid\":\"20170920034\",\"prize\":\"08925\"},{\"peroid\":\"20170920035\",\"prize\":\"71958\"},{\"peroid\":\"20170920036\",\"prize\":\"38770\"},{\"peroid\":\"20170920037\",\"prize\":\"09743\"},{\"peroid\":\"20170920038\",\"prize\":\"93950\"},{\"peroid\":\"20170920039\",\"prize\":\"38209\"},{\"peroid\":\"20170920040\",\"prize\":\"18844\"},{\"peroid\":\"20170920041\",\"prize\":\"25632\"},{\"peroid\":\"20170920042\",\"prize\":\"49025\"},{\"peroid\":\"20170920043\",\"prize\":\"65776\"},{\"peroid\":\"20170920044\",\"prize\":\"81921\"},{\"peroid\":\"20170920045\",\"prize\":\"46986\"},{\"peroid\":\"20170920046\",\"prize\":\"44899\"},{\"peroid\":\"20170920047\",\"prize\":\"68562\"},{\"peroid\":\"20170920048\",\"prize\":\"83267\"},{\"peroid\":\"20170920049\",\"prize\":\"16924\"},{\"peroid\":\"20170920050\",\"prize\":\"03078\"},{\"peroid\":\"20170920051\",\"prize\":\"18056\"},{\"peroid\":\"20170920052\",\"prize\":\"14750\"},{\"peroid\":\"20170920053\",\"prize\":\"36354\"},{\"peroid\":\"20170920054\",\"prize\":\"54773\"},{\"peroid\":\"20170920055\",\"prize\":\"41740\"},{\"peroid\":\"20170920056\",\"prize\":\"00028\"},{\"peroid\":\"20170920057\",\"prize\":\"43748\"},{\"peroid\":\"20170920058\",\"prize\":\"09575\"},{\"peroid\":\"20170920059\",\"prize\":\"43632\"},{\"peroid\":\"20170920060\",\"prize\":\"78254\"},{\"peroid\":\"20170920061\",\"prize\":\"88878\"},{\"peroid\":\"20170920062\",\"prize\":\"83593\"},{\"peroid\":\"20170920063\",\"prize\":\"73491\"},{\"peroid\":\"20170920064\",\"prize\":\"71155\"},{\"peroid\":\"20170920065\",\"prize\":\"62571\"}],\"recentid\":20170920065}";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
