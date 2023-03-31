package com.kafka.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    KafkaTemplate<String, Car> kafkaTemplate;

    private static final String TOPIC = "FirstTopic";

    @PostMapping("/publish")
    public String publishMessage(Car car){
        kafkaTemplate.send(TOPIC, car);
        return "Published Successfully!";
    }
}
