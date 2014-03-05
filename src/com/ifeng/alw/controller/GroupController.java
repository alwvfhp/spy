package com.ifeng.alw.controller;

import java.util.Enumeration;

import com.ifeng.alw.spy.Model.Group;
import com.ifeng.alw.spy.service.GroupService;
import com.jfinal.core.Controller;

public class GroupController extends Controller{
	GroupService groupService = new GroupService();
	public void add(){
		String guid="guid";
		String mid="";
		StringBuffer buf=new StringBuffer();
		for(int i=0;i<6;i++){
			String value=this.getPara(guid+i);
			if(null==value)break;
			buf.append(mid+value);
			mid=",";
		}
		Group group=Group.createGroup(new String(buf));
		group=groupService.add(group);
		if(null==group)this.renderJson("0","error");
		else this.renderJson("1",group);
	}
}
