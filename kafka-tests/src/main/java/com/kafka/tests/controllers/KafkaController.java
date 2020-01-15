package com.kafka.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.tests.helpers.ProductorKafka;

@RestController
@RequestMapping("KafkaController")
public class KafkaController {
	
	@Autowired
    private ProductorKafka productorKafka;
	
	@GetMapping("/{mensaje}")
	public String enviarMensaje(@PathVariable String mensaje) {
		
		String respuesta = "Proceso exitoso";
		try {
            productorKafka.send(mensaje);
        } catch (Exception e) {
            respuesta = "Error desconocido";
        }
		
		
		return respuesta;
	}
	
}
