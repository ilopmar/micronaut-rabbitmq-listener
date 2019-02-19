package micronaut.rabbitmq.listener;

import com.rabbitmq.client.Channel;
import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer;

import java.io.IOException;

public class ChannelPoolListener extends ChannelInitializer {

    @Override
    public void initialize(Channel channel) throws IOException {
        channel.queueDeclare("text", true, false, false, null);
    }
}
