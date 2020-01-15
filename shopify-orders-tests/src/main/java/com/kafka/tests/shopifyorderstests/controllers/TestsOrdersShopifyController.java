package com.kafka.tests.shopifyorderstests.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests-orders-shopify")
public class TestsOrdersShopifyController {

	@GetMapping("/send-order")
	public String sendOrder(@RequestBody String order) {

		System.out.println("Pedido:");
		// System.out.println(order);
		return "prueba";
	}

}
