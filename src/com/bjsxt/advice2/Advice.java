package com.bjsxt.advice2;

import org.aspectj.lang.ProceedingJoinPoint;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class Advice {
	public void before(String name) {
		System.out.println("����aspectǰ��֪ͨ"+name);
	}
	public void after(String name) {
		System.out.println("����aspect����֪ͨ"+name);
	}
	public void myThrow(Exception e) {
		System.out.println("����aspect���쳣֪ͨ"+e.getMessage());
	}
	public void afterReturning() {
		System.out.println("����aspect����֪ͨafterReturning");
	}
	public Object round(ProceedingJoinPoint p) throws Throwable {
		System.out.println("����aspect����֪ͨ��---ǰ");
		Object proceed = p.proceed();
		System.out.println("����aspect����֪ͨ��---��");
		return  proceed;
	}
}
