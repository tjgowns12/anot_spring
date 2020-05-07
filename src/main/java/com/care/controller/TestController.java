package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.service.ServiceA;
import com.care.service.ServiceB;
import com.care.service.TestService;

@Controller
public class TestController {
	ApplicationContext ac=App.ac;
	//@Autowired
	private TestService ser;
	//service가 하나일 땐 문제없이 돌아간다 
	///////////////////////////
	
	//@Autowired private ServiceA a;
	//@Autowired private ServiceB b;
	//2개 이상의 서비스가 존재할 시 각각의 service를 만들어 넣어준다.
	@RequestMapping("test")
	public void test() {
		//ser=new ServiceA();
		ser=ac.getBean("serviceA",ServiceA.class);
		//bean으로 만들어진 객체의 첫번째 알파벳은 소문자다 그래서 serviceA다 
		ser.execute();
		//a.execute();
		
	}
	@RequestMapping("test02")
	public void test02() {
		ser=ac.getBean("serviceB",ServiceB.class);
		ser.execute();
		//b.execute();
	}
	
}
