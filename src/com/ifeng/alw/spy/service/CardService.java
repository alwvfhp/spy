package com.ifeng.alw.spy.service;

import org.apache.log4j.Logger;

import com.ifeng.alw.spy.Model.Card;

public class CardService extends BaseService{
	private static Logger log = Logger.getLogger(CardService.class);
	/**
	 * ÃÌº”Ã÷¬€¥ 
	 * */
	public Object[] add(String cDes1,String cDes2){
		if(this.isEmpty(cDes2) || this.isEmpty(cDes1))return null;
		try {
			Card card=new Card();
			card.set("cDes1",cDes1)
				.set("cDes2",cDes2)
				.save();
			log.info("card add successful");
			return card.getAttrValues();
		} catch (Exception e) {
			// TODO: handle exception
			log.info(e.toString());
			return null;
		}
	}
}
