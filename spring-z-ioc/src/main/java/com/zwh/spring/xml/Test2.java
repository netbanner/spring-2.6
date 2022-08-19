package com.zwh.spring.xml;


import com.zwh.spring.aware.MySpringAware;
import com.zwh.spring.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;


public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		//1、ClassPathXmlApplicationContext
		//2、DefaultListableBeanFactory
		//3、GenericBeanDefinition

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyBean myBean = context.getBean("myBean", MyBean.class);
		System.out.println(myBean.getMyName() + "---" + myBean.getMyAge());
		myBean.sayHello("zhangsanfeng");

		MySpringAware mySpringAware = context.getBean("mySpringAware", MySpringAware.class);
		mySpringAware.display();

		StandardEnvironment standardEnvironment = context.getBean("environment", StandardEnvironment.class);
		System.out.println("获取spring自己的一个环境的bean，不是我们配置的：" + standardEnvironment);
	}
}