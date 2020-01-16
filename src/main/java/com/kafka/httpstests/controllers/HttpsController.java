package com.kafka.httpstests.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {
	
	@RequestMapping("/httpstest")
	public String httpsTest() {
		return "esto es https";
	}
}
