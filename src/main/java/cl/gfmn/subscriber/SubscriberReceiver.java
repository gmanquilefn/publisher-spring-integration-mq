package cl.gfmn.subscriber;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SubscriberReceiver {

    private static final Logger logger = LoggerFactory.getLogger(SubscriberReceiver.class);

    @JmsListener(destination = "queue")
    public void receiveMessage(Map<String, String> message) {
        logger.info(new Gson().toJson(message));
    }
}
