package com.Json.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Producer {
//
//	@Autowired
//	private BetsRepository betsRepository;
//	
	public static final String topic="bet_detail";
//
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplete;
//	
//	public void publishToTopic(String message) {
//	
//		this.kafkaTemplete.send(topic,message);
//		
//		}
	
	 public void send(String message){
	        System.out.println("Payload message: {}"+message);
	        kafkaTemplete.send(topic, message);
	    }
	
	}
	
	
	
	

