/**
 * @author sujian
 *保存系统注册用户名
 */
package com.ifeng.alw.spy.Model;

import com.jfinal.plugin.activerecord.Model;

public class User extends Model<User>{
	private Integer uId;
	//
	private String uName;
	private String uPassword;
	public User(){}
	public User(String name,String pass){
		this.uName=name;
		this.uPassword=pass;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
}