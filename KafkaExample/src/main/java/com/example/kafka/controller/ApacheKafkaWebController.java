package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkq.service.KafkaSender;

@RestController
@RequestMapping(value = "kafka/sample")
public class ApacheKafkaWebController {

	
	
	

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		System.out.println(message);
		KafkaSender kafkaSender=new KafkaSender();
		
		kafkaSender.send(message);

		return "Message sent to the Kafka Topic -->  sampleKafkatopic   Successfully";
	}

}