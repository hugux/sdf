package com.bjsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.demo.Demo;
import com.bjsxt.demo.Demo2;

public class Test {
	public static void main(String[] args) {
		//获取spring容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		/*Demo d = ac.getBean("demo",Demo.class);
		d.demo1();
		d.demo1("牛逼");
		d.demo2();*/
		Demo2 d = ac.getBean("demo2",Demo2.class);
		d.demo("你猜");
	}
}
