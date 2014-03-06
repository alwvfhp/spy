package com.ifeng.alw.spy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jfinal.aop.Before;

public class UserServiceTest{

	@Test
	public void test() {
		int a=6;
		int b=6;
		assertEquals("a isn't b",a,b);
	}
	
}
