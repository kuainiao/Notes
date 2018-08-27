package com.lijia.aop.aspectj_xml;

// 目标类
public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst()方法");
	}

	@Override
	public String doSecond() {
		System.out.println("执行doSecond()方法");
	
		return "abcde";
	}
	
	@Override
	public void doThird() {
		System.out.println("执行doThird()方法");
		int i = 3/0;
	}
}















