package com.eventhub.app.controller;

import com.eventhub.app.service.EvenetPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProducerController {
	//@Autowired
	//MessageProducer producerService;
	@Autowired
	EvenetPublisher evenetPublisher;

	@GetMapping("/publish")
	public String sendMessageToKafkaTopic() {
		evenetPublisher.getTheEvent("Yohannes");
		//this.producerService.sendMessage(message);
		return "Second deployment successfully ";
	}
}
