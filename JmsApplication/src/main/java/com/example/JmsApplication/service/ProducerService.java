package com.example.JmsApplication.service;

import com.example.JmsApplication.model.SystemMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final JmsTemplate jmsTemplate;
    private final ObjectMapper mapper;

    @Value("${spring.artemis.embedded.queues}")
    private String queueDestination;

    public ProducerService(JmsTemplate jmsTemplate, ObjectMapper mapper) {
        this.jmsTemplate = jmsTemplate;
        this.mapper = mapper;
    }

    public void send(SystemMessage systemMessage) throws JsonProcessingException {
        jmsTemplate.convertAndSend(queueDestination, mapper.writeValueAsString(systemMessage));
    }




}
