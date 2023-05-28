package com.arseny.kafka_processor.service;

import com.arseny.kafka_processor.dto.UserDto;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class KafkaProcessingService {


    @Bean
    public Function<UserDto, UserDto> processKafka() {
        return user -> {
            user.setName("Penis");
            return user;
        };
    }
}
