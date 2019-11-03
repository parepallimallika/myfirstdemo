package com.family.member.service;

import javax.validation.constraints.AssertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MultipleServiceTest {
	
	@Autowired
	MultipleService ms;
	
	@Test
	public void testAdd(){
		System.out.println(ms.add(2, 4));
	}

}
