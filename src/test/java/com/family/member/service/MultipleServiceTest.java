package com.family.member.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MultipleServiceTest {
	
	@Autowired
	MultipleService m;
	
	@Test
	public void ad(){
		System.out.println("hi2");
		System.out.println(m.add(2, 3));
	}

}
