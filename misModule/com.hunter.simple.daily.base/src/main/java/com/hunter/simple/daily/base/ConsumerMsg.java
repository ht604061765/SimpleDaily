package com.hunter.simple.daily.base;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerMsg {

    @KafkaListener(topics = "hunter-topic")
    public void listenMsg (ConsumerRecord<?,String> record) {
        String value = record.value();
        System.out.println(value);
    }
}
