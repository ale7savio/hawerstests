package com.kafka.producerkafkaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
public class Producer {

	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "orders";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	

	public void sendMessage(String message){
		
		//Ejemplo sencillo
		/*
		try {
			logger.info(String.format("$$ -> Producing message --> %s",message));
			kafkaTemplate.send(TOPIC, message);
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		
		//Ejemplo por si falla el envio
		ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(TOPIC, message);
		future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
			@Override
			public void onSuccess(SendResult<String, String> result) {
				System.out.println("Sent message=[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]");
			}

			@Override
			public void onFailure(Throwable ex) {
				System.out.println("Fallo al enviar: " + ex.getMessage().toString());
			}
		});
		
	}
	
}
