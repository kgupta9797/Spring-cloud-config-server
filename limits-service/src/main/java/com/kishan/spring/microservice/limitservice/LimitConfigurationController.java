package com.kishan.spring.microservice.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kishan.spring.microservice.limitservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {

		@Autowired
	private Configuration congiguration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguration()
	{
		//return new LimitConfiguration(1000,10); this for hardcoded value
		//next line is about getting value from application.properties files
		return new LimitConfiguration(congiguration.getMaximum(),congiguration.getMinimum());
	}
}
