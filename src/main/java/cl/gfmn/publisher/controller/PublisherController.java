package cl.gfmn.publisher.controller;

import cl.gfmn.publisher.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;

    @PostMapping(path = "/message")
    ResponseEntity<?> sendMessage(@RequestBody Map<String, String> message){

        publisherService.publishMessage(message);

        return ResponseEntity.ok("OK");
    }
}
