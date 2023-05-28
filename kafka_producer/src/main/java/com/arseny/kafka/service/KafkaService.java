package com.arseny.kafka.service;

import com.arseny.kafka.dto.UserDto;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class KafkaService {
    public static int counter = 0;

    @Bean
    public Supplier<UserDto> sendKafka() {
        return () -> {
            System.out.println("Message" + (counter + 1));
            return new UserDto(""+ counter++, "asdasdsa");
        };
    }
}
