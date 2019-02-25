package com.icss.helloConsumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.service.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	        context.start();
	        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
	        String hello = demoService.sayHello("world"); // 执行远程方法
	        System.out.println( hello ); // 显示调用结果
	 }
}
