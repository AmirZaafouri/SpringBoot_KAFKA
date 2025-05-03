package com.springkafka.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "amir",groupId = "groupId")
    void listener(String data){
        System.out.println("Listener Recive Data: "+ data + " 👌🎶");
    }
}
