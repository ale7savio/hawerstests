package com.kafka.tests.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductorKafka {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private final String kafkaTopicHawkers = "topicoHawkers";
	
	public void send(String message) {
        kafkaTemplate.send(kafkaTopicHawkers, message);
    }
}
