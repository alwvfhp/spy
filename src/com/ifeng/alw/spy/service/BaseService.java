package com.ifeng.alw.spy.service;

public class BaseService {
	protected boolean isEmpty(String str){
		if(null==str || "".equals(str))return true;
		return false;
	}
}
