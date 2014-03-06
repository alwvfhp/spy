package com.ifeng.alw.spy.Model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 系统名词保存
 * 
 * */
public class Card extends Model<Card>{
	private Integer cId;
	//两个相近的名词，cDes1为卧底牌
	private String cDes1;
	private String cDes2;
	public Card(){
		
	}
}
