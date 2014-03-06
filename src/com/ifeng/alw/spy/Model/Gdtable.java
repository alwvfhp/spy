package com.ifeng.alw.spy.Model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 记录小组内的发言
 * */
public class Gdtable extends Model<Gdtable>{
	private Integer gdId;
	//发言人群组id
	private Integer gId;
	//发言人Id
	private Integer gduId;
	//发言人内容信息
	private String gdDes;
	public Gdtable(){
		
	}
}
