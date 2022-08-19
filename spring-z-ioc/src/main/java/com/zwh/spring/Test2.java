package com.zwh.spring;

import com.zwh.spring.bean.MyBean;
import org.springframework.context.ApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		//bootstrap classloader --> ext classloader -> app classloader
		System.out.println(String.class.getClassLoader());

		//AppClassLoader
		System.out.println(MyBean.class.getClassLoader().getParent());
		System.out.println(ApplicationContext.class.getClassLoader().getParent());
	}
}