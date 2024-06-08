package cl.gfmn.publisher.service;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class PublisherService {

    private final JmsTemplate jmsTemplate;
    private final Gson gson = new Gson();

    public void publishMessage(Map<String, String> message) {

        jmsTemplate.convertAndSend("queue", gson.toJson(message));
    }
}
