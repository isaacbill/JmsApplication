package com.example.JmsApplication.controller;

import com.example.JmsApplication.model.SystemMessage;
import com.example.JmsApplication.service.ProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class PublisherController {

    private final ProducerService producerService;

    public PublisherController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody SystemMessage systemMessage) {
        try {
            producerService.send(systemMessage);
            return new ResponseEntity<>("Sent", HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


