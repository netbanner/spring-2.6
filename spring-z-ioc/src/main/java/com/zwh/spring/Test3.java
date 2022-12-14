package com.zwh.spring;



import com.zwh.spring.bean.HeBean;

import java.lang.reflect.Method;

public class Test3 {

	public static void main(String[] args) throws Exception {

		Class<?> clazz = Class.forName("com.bjpowernode.bean.MyBean");

		Method method = clazz.getDeclaredMethod("setheBean", clazz.getDeclaredField("heBean").getType());
		method.setAccessible(true);

		Object object = clazz.getDeclaredConstructor().newInstance();

		HeBean heBean = new HeBean();
		heBean.setHeAge(11);
		heBean.setHeName("23424");

		method.invoke(object, heBean);

		System.out.println(object);
	}
}