package com.ifeng.alw.controller;

import org.apache.log4j.Logger;

import com.ifeng.alw.spy.service.CardService;
import com.jfinal.core.Controller;

public class CardController extends Controller {
	private static Logger log = Logger.getLogger(CardController.class);
	private static CardService cardService = new CardService();
	public void add(){
		String card1 = this.getPara("cDes1");
		String card2 = this.getPara("cDes2");
		log.info("card:"+"["+card1+","+card2+"]");
		Object[] obj = cardService.add(card1, card2);
		if(null==obj){
			this.renderJson("0","add fail");
		}
		else{
			this.renderJson("1",obj);
		}
	}
}
