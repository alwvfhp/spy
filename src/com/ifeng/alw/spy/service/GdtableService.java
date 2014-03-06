package com.ifeng.alw.spy.service;

import org.apache.log4j.Logger;

import com.ifeng.alw.spy.Model.Gdtable;
import com.jfinal.plugin.activerecord.Page;

public class GdtableService extends BaseService {
	private static final Gdtable gdt= new Gdtable();
	private static Logger log = Logger.getLogger(Gdtable.class);
	public Object[] add(Integer gid,Integer uid,String des){
		if(this.isEmpty(des))return null;
		Gdtable td=new Gdtable();
		try {
			td.set("gduId", uid)
			  .set("gdDes", des)
			  .set("gId", gid)
			  .save();
			log.info("gdtable add successful");
			return td.getAttrValues();
		} catch (Exception e) {
			// TODO: handle exception
			log.info(e.toString());
			return null;
		}
	}
	//��ѯĳһ������
	public Gdtable getDesById(Integer gdId){
		return gdt.findById(gdId,"gdId");
	}
	//��ѯһ����ķ���
	public Page<Gdtable> getDesBygid(Integer gId,int page,int number){
		return gdt.paginate(page,number, "select *", "from gdtable where gId = ?",gId);
	}
}
