package com.Json.Project.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="bet_detail",groupId="mygroup")
	public void ListenToTopic(String receivedMessage) {
		System.out.println("Consumed message received is "+receivedMessage);
	}
	
}
