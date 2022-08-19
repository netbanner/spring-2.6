package com.zwh.spring.bean;



public class MyBean {


	private HeBean heBean;

	private String myName;

	private int myAge;


	public void setHeBean(HeBean heBean){
		this.heBean = heBean;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	/**
	 * 业务方法
	 */
	public void sayHello(String name) {
		System.out.println("MyBean-->sayHello......," + name);
	}
}