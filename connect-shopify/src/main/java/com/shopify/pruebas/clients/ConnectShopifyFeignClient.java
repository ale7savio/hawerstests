package com.shopify.pruebas.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="connect-shopify", url = "https://hawkers-back-dev.myshopify.com")
public interface ConnectShopifyFeignClient {
	
	@GetMapping("/admin/api/2020-01/shop.json")
	public String getShop();
	
	
	
	
}
