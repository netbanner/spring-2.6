package com.zwh.spring.config;


import com.zwh.spring.bean.HeBean;
import com.zwh.spring.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // == xml文件  springConfig
public class SpringConfig {

	/**
	 * <bean id="myBean" class="com.bjpowernode.bean.MyBean">
	 *
	 * </bean>
	 * @return
	 */
	@Bean
	public MyBean myBean() {
		return new MyBean();
	}

	/**
	 * <bean id="heBean" class="com.bjpowernode.bean.HeBean">
	 *
	 * </bean>
	 * @return
	 */
	@Bean
	public HeBean heBean() {
		return new HeBean();
	}
}