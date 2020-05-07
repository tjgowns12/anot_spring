package com.care.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	public TestDAO() {
		System.out.println("dao생성자 입니다!!!");
	}
	public void test() {
		System.out.println("dao test 입니다.");
	}
	public void test02() {
		System.out.println("dao test02 입니다.");
	}
}
