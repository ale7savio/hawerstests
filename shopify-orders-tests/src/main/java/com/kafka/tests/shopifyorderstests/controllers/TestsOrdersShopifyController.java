package com.kafka.tests.shopifyorderstests.controllers;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests-orders-shopify")
public class TestsOrdersShopifyController {
	
	private static final Logger logger = LogManager.getLogger(TestsOrdersShopifyController.class);

	@GetMapping("/send-order")
	public String sendOrder(@RequestHeader Map<String, String> headers) {
		
	    headers.forEach((key, value) -> {
	    	logger.debug(String.format("Header '%s' = %s", key, value));
	    });
		    
		//String body = request.getBody();
		//String hmac = request.getHeader("HTTP_X_SHOPIFY_HMAC_SHA256");

		System.out.println("Pedido:");
		// System.out.println(order);
		//logger.debug(order);
		return "header";
	}

}
