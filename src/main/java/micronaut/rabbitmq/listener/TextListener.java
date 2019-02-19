package micronaut.rabbitmq.listener;

import io.micronaut.configuration.rabbitmq.annotation.Queue;
import io.micronaut.configuration.rabbitmq.annotation.RabbitListener;

@RabbitListener
public class TextListener {

    @Queue("text")
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }
}