package com.arseny.kafka.controller;

import com.arseny.kafka.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class KafkaController {
    private StreamBridge bridge;


    @GetMapping("/send")
    public ResponseEntity<String> penis(@RequestParam(name = "name") String name) {
        try {
            bridge.send("sendKafka-out", new UserDto("100", name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("user with name " + name + " sent.");
    }

}
