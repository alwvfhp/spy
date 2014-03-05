package com.ifeng.alw.spy.Model;

import com.jfinal.plugin.activerecord.Model;

public class Group extends Model<Group>{
	private Integer gid;
	
	//主持人
	private Integer guid0;
	
	//下面为参加游戏人Id,至少三个人
	private Integer guid1;
	private Integer guid2;
	private Integer guid3;
	private Integer guid4;
	private Integer guid5;
	
	public Group(){
		
	}
	/**
	 * 参数以逗号隔开,第一个作为主持人
	 * */
	public static Group createGroup(String guid){
		System.out.println(guid);
		String uId[]=guid.split(",");
		if(uId.length<4)return null;
		Group group = new Group();
		int len=uId.length;
		for(int i=0;i<len;i++){
			switch(i){
			case 0:group.setGuid0(Integer.valueOf(uId[i]));break;
			case 1:group.setGuid1(Integer.valueOf(uId[i]));break;
			case 2:group.guid2=Integer.valueOf(uId[i]);break;
			case 3:group.guid3=Integer.valueOf(uId[i]);break;
			case 4:group.guid4=Integer.valueOf(uId[i]);break;
			case 5:group.guid5=Integer.valueOf(uId[i]);break;
			default:break;
			}
		}
		return group;
	}
	public Integer getGuid0() {
		return guid0;
	}
	public void setGuid0(Integer guid0) {
		this.guid0 = guid0;
	}
	public Integer getGuid1() {
		return guid1;
	}
	public void setGuid1(Integer guid1) {
		this.guid1 = guid1;
	}
}
