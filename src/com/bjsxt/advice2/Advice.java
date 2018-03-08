package com.bjsxt.advice2;

import org.aspectj.lang.ProceedingJoinPoint;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class Advice {
	public void before(String name) {
		System.out.println("我是aspect前置通知"+name);
	}
	public void after(String name) {
		System.out.println("我是aspect后置通知"+name);
	}
	public void myThrow(Exception e) {
		System.out.println("我是aspect的异常通知"+e.getMessage());
	}
	public void afterReturning() {
		System.out.println("我是aspect后置通知afterReturning");
	}
	public Object round(ProceedingJoinPoint p) throws Throwable {
		System.out.println("我是aspect环绕通知的---前");
		Object proceed = p.proceed();
		System.out.println("我是aspect环绕通知的---后");
		return  proceed;
	}
}
