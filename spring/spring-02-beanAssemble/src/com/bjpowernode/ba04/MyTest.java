package com.bjpowernode.ba04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	@Test
	public void test01() {
		// 创建容器对象，加载Spring配置文件
		String resource = "com/bjpowernode/ba04/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		
		ISomeService service = (ISomeService) ac.getBean("myService");
		
		ISomeService service2 = (ISomeService) ac.getBean("myService");
		System.out.println("service == service2  " + (service == service2));
	}
	
}



















