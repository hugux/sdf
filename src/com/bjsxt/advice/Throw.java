package com.bjsxt.advice;

import org.springframework.aop.ThrowsAdvice;

public class Throw implements ThrowsAdvice{
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("�����쳣֪ͨ"+ex.getMessage());
	}
}
