package com.ifeng.alw.spy.service;

import com.ifeng.alw.spy.Model.User;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class UserService extends BaseService{
	private static final User dao = new User();
	//查询用户是否存在
	public boolean isExist(String name){
		Record one=Db.findFirst("select * from user where uName = '"+name+"'");
		return null!=one;
	}
	//添加用户
	public User add(User user){
		try {
			if(dao.set("uName",user.getuName())
					   .set("uPassword",user.getuPassword())
					   .save()){
						return dao.findFirst("select * from user where uName = '"+user.getuName()+"'");
					}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return null;
	}
	//修改用户信息(现在只是提供修改用户密码)
	public boolean edit(User user){
		Record one=Db.findFirst("select * from user where uName = "+user.getuName())
					 .set("uPassword",user.getuPassword());
		return Db.update("user",one);
	}
}
