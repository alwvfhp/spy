package com.ifeng.alw.controller;

import org.apache.log4j.Logger;

import com.ifeng.alw.spy.Model.User;
import com.ifeng.alw.spy.service.UserService;
import com.jfinal.core.Controller;

public class UserController extends Controller{
	static Logger log = Logger.getLogger(UserController.class);
	private UserService userService=new UserService();
	//�û�ע��
	public void register(){
		String name=this.getPara("name");
		String pass=this.getPara("pass");
		System.out.println(name+","+pass);
		User user=new User(name,pass);
		user=userService.add(user);
		if(null==user)this.renderJson("0","error");
		else{
			log.info("register successful");
			this.renderJson("1",user);
		}
	}
	//jQuery��ѯ�û����Ƿ����
	public void check(){
		String name=this.getPara("name");
		this.renderHtml(String.valueOf(userService.isExist(name)));
	}
}
