package com.ifeng.alw.spy.service;

import org.apache.log4j.Logger;

import com.ifeng.alw.spy.Model.User;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class UserService extends BaseService{
	private static final User dao = new User();
	static Logger log = Logger.getLogger(UserService.class);
	//��ѯ�û��Ƿ����
	public boolean isExist(String name){
		Record one=Db.findFirst("select * from user where uName = '"+name+"'");
		return null!=one;
	}
	//����û�
	public User add(User user){
		try {
			if(dao.set("uName",user.getuName())
					   .set("uPassword",user.getuPassword())
					   .save()){
				log.info("Insert successful");
						return dao.findFirst("select * from user where uName = '"+user.getuName()+"'");
					}
		} catch (Exception e) {
			// TODO: handle exception
			log.info(e.toString());
			return null;
		}
		return null;
	}
	//�޸��û���Ϣ(����ֻ���ṩ�޸��û�����)
	public boolean edit(User user){
		Record one=Db.findFirst("select * from user where uName = "+user.getuName())
					 .set("uPassword",user.getuPassword());
		return Db.update("user",one);
	}
}
