package com.ifeng.alw.controller;

import org.apache.log4j.Logger;

import com.ifeng.alw.spy.Model.Group;
import com.ifeng.alw.spy.service.GroupService;
import com.jfinal.core.Controller;

public class GroupController extends Controller{
	static Logger log = Logger.getLogger(GroupController.class);
	GroupService groupService = new GroupService();
	public void add(){
		Group group=new Group();
		int i;
		for(i=0;i<6;i++){
			String value=this.getPara("guid"+i);
			if(null==value)break;
			group.setGuid(i,Integer.valueOf(value));
		}
		if(i<4){
			log.info("建立组人数不够");
			this.renderJson("0","参数不够");
		}
		else{
			Object[] obj=groupService.add(group);
			if(null==obj)this.renderJson("0","加入数据库失败");
			else{
				log.info("create successful");;
				this.renderJson("1",obj);
			}
		}
	}
}
