package com.kafka.tests.shopifyorderstests.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests-orders-shopify")
public class TestsOrdersShopifyController {
	
	private static final Logger logger = LogManager.getLogger(TestsOrdersShopifyController.class);

	@GetMapping("/send-order")
	public String sendOrder(@RequestBody String order) {

		System.out.println("Pedido:");
		// System.out.println(order);
		logger.debug(order);
		return order;
	}

}
