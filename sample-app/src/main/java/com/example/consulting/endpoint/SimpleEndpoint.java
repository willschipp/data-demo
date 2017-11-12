package com.example.consulting.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleEndpoint {

	@RequestMapping(method=RequestMethod.GET)
	public String hello() throws Exception {
		return "Hello";
	}
	
}
