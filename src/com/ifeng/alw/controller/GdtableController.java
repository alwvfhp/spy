package com.ifeng.alw.controller;

import org.apache.log4j.Logger;

import com.ifeng.alw.spy.service.GdtableService;
import com.jfinal.core.Controller;

public class GdtableController extends Controller {
	private static Logger log = Logger.getLogger(GdtableController.class);
	private GdtableService gdt = new GdtableService();
	public void add(){
		String gid=this.getPara("gid");
		String gduid=this.getPara("gduid");
		String gddes=this.getPara("gddes");
		try {
			Object[] obj = gdt.add(Integer.valueOf(gid),
					Integer.valueOf(gduid),gddes);
			if(null==obj)this.renderJson("0","error");
			else{
				this.renderJson("1",obj);
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.info(e.toString());
			this.renderJson("0","param is wrong");
		}
	}
}
