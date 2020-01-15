package com.kafka.consumerkafkaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics = "orders", groupId = "group_id")
	public void consume(String order) {
		
		logger.info(String.format("$$ -> Microservicio consumidor -> %s", order));
	}
}
