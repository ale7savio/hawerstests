package com.kafka.tests.shopifyorderstests.controllers;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/tests-orders-shopify")
public class TestsOrdersShopifyController {
	
	private static final Logger logger = LogManager.getLogger(TestsOrdersShopifyController.class);

	@RequestMapping("/send-order")
	public String sendOrder(@RequestHeader Map<String, String> headers, HttpServletRequest req, @RequestParam Map<String, String> allRequestParams, WebRequest webRequest) {
		
//	    headers.forEach((key, value) -> {
//	    	logger.debug(String.format("Header '%s' = %s", key, value));
//	    });
	    
		
	    //WebRequest webRequest)
		    
		//String body = request.getBody();
		//String hmac = request.getHeader("HTTP_X_SHOPIFY_HMAC_SHA256");
	    logger.debug(req);
	    logger.debug(req.getHeader("HTTP_X_SHOPIFY_HMAC_SHA256"));
	    
	    logger.debug(allRequestParams.get("HTTP_X_SHOPIFY_HMAC_SHA256"));
	    logger.debug(webRequest.getHeader("HTTP_X_SHOPIFY_HMAC_SHA256"));
		System.out.println("Separacion:");
		
		getRequestInformation(req);
		
		
		// System.out.println(order);
		//logger.debug(order);
		return "header";
	}
	
	private void getRequestInformation(HttpServletRequest request) {
	    Map<String, String> map = new HashMap<String, String>();
	    Enumeration headerNames = request.getHeaderNames();
	    while (headerNames.hasMoreElements()) {
	        String key = (String) headerNames.nextElement();
	        String value = request.getHeader(key);
	        map.put("header: " + key, value);
	        logger.debug(String.format("1 Header '%s' = %s", key, value));
	    }
	    Enumeration parameterNames = request.getParameterNames();
	    while (parameterNames.hasMoreElements()) {
	        String key = (String) parameterNames.nextElement();
	        String value = request.getParameter(key);
	        map.put("parameter: " + key, value);
	        logger.debug(String.format("2 Header '%s' = %s", key, value));
	    }
	    
	    while (parameterNames.hasMoreElements()) {
	        String key = (String) parameterNames.nextElement();
	        String value = request.getParameter(key);
	        map.put("parameter: " + key, value);
	        logger.debug(String.format("3 Header '%s' = %s", key, value));
	    }
	    
	    
	    System.out.println(map.toString());
	}

}
