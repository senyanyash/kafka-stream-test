package com.arseny.kafka_consumer.service;

import com.arseny.kafka_consumer.dto.UserDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
@Component
@EnableScheduling
public class KafkaConsumerService {
    @Bean
    public Consumer<UserDto> fromKafka() {
        return (user) -> System.out.println(user);
    }
}
