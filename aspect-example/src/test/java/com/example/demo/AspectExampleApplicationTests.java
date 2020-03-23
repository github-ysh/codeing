package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.test.Test2;

@SpringBootTest
class AspectExampleApplicationTests {

	@Autowired
	com.example.demo.test.Test test;
	@Autowired
	Test2 Test2;
	
	@Test
	void contextLoads() {
		test.test("ysh");
		test.test2("ysh2");
		Test2.test("wl");
		Test2.test2("wl2");
	}

}
