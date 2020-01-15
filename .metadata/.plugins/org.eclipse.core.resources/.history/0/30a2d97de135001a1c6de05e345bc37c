package com.shopify.pruebas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignClientConfiguration {
	@Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
         return new BasicAuthRequestInterceptor("d17acae2d1551ccb3e54b10ff61ba4c4", "5dc9bbe9f8bb98498de6b9a606e369e0");
    }
}
