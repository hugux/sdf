package com.bjsxt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Myround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("���ǻ���֪ͨ---ǰ��");
		Object proceed = arg0.proceed();
		System.out.println("���ǻ���֪ͨ---��");
		return proceed;
	}

}
