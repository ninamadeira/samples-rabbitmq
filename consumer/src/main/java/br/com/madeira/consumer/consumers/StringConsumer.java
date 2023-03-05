package br.com.madeira.consumer.consumers;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constants.RabbitMQConstants.RK_ADDRESS_LOG;

@Log4j2
@Component
public class StringConsumer {

    @RabbitListener(queues = {RK_ADDRESS_LOG})
    public void consumerLog(String message) {
        log.info("Consumer received a message " + message);
    }

}
