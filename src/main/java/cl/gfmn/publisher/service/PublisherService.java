package cl.gfmn.publisher.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class PublisherService {

    private final JmsTemplate jmsTemplate;

    public void publishMessage(Map<String, String> message) {

        jmsTemplate.convertAndSend("queue", message);
    }
}
