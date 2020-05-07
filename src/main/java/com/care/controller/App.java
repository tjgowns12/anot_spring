package com.care.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class App implements ApplicationContextAware{
	public static ApplicationContext ac;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("application 실행됩니다");
		ac=applicationContext;//bean들이 저장된 공간을 가져옴 
		
		
	}

}
