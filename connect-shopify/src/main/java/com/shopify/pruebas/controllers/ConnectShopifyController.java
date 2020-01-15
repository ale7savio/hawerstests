package com.shopify.pruebas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopify.pruebas.clients.ConnectShopifyFeignClient;

@RestController
@RequestMapping("/tests-shopify")
public class ConnectShopifyController {
	
	@Autowired
	private ConnectShopifyFeignClient client;
	
	@GetMapping("/get-shop")
	public String getShop() {
		return client.getShop();
	}
	
	@PostMapping("/get-order")
	public String sendOrder(@RequestBody String order) {
		System.out.println("Pedido:");
		System.out.println(order);
		return order;
	}
}
