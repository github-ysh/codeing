package com.example.demo.test;

import org.springframework.stereotype.Component;

import com.example.demo.config.CustomAnnotation;

@Component
public class Test2 {
	
	@CustomAnnotation
	public void test(String name) {
		System.out.println(name);
	}
	
	public void test2(String name) {
		System.out.println(name);
	}
}
