package com.shopify.pruebas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConnectShopifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectShopifyApplication.class, args);
	}

}
