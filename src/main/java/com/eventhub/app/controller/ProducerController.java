package com.eventhub.app.controller;

import com.eventhub.app.service.EvenetPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducerController {
	//@Autowired
	//MessageProducer producerService;
	@Autowired
	EvenetPublisher evenetPublisher;

	@PostMapping("/publish")
	public String sendMessageToKafkaTopic(@RequestBody String message) {
		evenetPublisher.getTheEvent("Yohannes");
		//this.producerService.sendMessage(message);
		return "Yor app deploy successfully ";
	}
}
