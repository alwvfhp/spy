package com.ifeng.alw.spy.Model;

import com.jfinal.plugin.activerecord.Model;

public class Group extends Model<Group>{
	private Integer gid;
	
	//������
	private Integer guid0;
	
	//����Ϊ�μ���Ϸ��Id,����������
	private Integer guid1;
	private Integer guid2;
	private Integer guid3;
	private Integer guid4;
	private Integer guid5;
	
	public Group(){
		
	}
	/**
	 * �����Զ��Ÿ���,��һ����Ϊ������
	 * */
	public static Group createGroup(String guid){
		Group group = new Group();
		return group;
	}
	public void setGuid(int id,Integer value){
		switch(id){
		case 0:this.set("guid0",value);break;
		case 1:this.set("guid1",value);break;
		case 2:this.set("guid2",value);break;
		case 3:this.set("guid3",value);break;
		case 4:this.set("guid4",value);break;
		case 5:this.set("guid5",value);break;
		default:break;
		}
	}
}
