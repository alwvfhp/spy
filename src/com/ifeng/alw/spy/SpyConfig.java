/**
 * 
 */
/**
 * @author sujian
 *
 */
package com.ifeng.alw.spy;

import com.ifeng.alw.controller.GroupController;
import com.ifeng.alw.controller.UserController;
import com.ifeng.alw.spy.Model.Group;
import com.ifeng.alw.spy.Model.User;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;

public class SpyConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants arg0) {
		// TODO Auto-generated method stub
		arg0.setDevMode(true);
		
	}

	@Override
	public void configHandler(Handlers arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins arg0) {
		// TODO Auto-generated method stub
		C3p0Plugin cp = new C3p0Plugin(
				"jdbc:mysql://localhost:3306/freemaker","root","sujian");
		arg0.add(cp);
		ActiveRecordPlugin acp =  new ActiveRecordPlugin(cp);
		arg0.add(acp);
		acp.addMapping("user","uId",User.class);
		acp.addMapping("group","gid", Group.class);
	}

	@Override
	public void configRoute(Routes arg0) {
		// TODO Auto-generated method stub
		arg0.add("/user",UserController.class);
		arg0.add("/group",GroupController.class);
	}
}