package com.ifeng.alw.spy.service;

import com.ifeng.alw.spy.Model.Group;
import com.jfinal.plugin.activerecord.Record;

public class GroupService extends BaseService {
	private Group group=new Group();
	public Object[] add(Group group1){
		try {
			group1.save();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return group1.getAttrValues();
	}
}
