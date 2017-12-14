package com.example.kafkq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	//String kafkaTopic = "sampleKafkatopic";
	
	public void send(String message) {
	    
	    kafkaTemplate.send("sampleKafkatopic", message);
	}
}