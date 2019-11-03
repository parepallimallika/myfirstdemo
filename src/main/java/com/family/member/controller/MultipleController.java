package com.family.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.family.member.service.MultipleService;

@RestController
public class MultipleController {
	@Autowired 
	MultipleService ms;
	
	@RequestMapping(value="/add/{a}/{b}", method=RequestMethod.GET, produces="text/plain")
	public String add(@PathVariable("a")Integer a,@PathVariable("b")Integer b){
		return ms.add(a, b);
	}
}



	
	