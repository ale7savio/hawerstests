package com.kafka.producerkafkaexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hawkersco.shopifycommons.entities.Order;
import com.hawkersco.shopifycommons.entities.OrderSend;

@RestController
@RequestMapping(value = "/producer-kafka")
public class ProducerController {
	
	@Autowired
	private Producer producer;
	
	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message){
		this.producer.sendMessage(message);
	}
	
	
}
