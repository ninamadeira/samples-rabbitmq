package br.com.madeira.consumer.consumers;


import dtos.AddressDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constants.RabbitMQConstants.RK_ADDRESS_LOG;

@Log4j2
@Component
public class AddressConsumer {

    @RabbitListener(queues = {RK_ADDRESS_LOG})
    public void consumerLog(AddressDTO message) {
        log.info("Received message " + message.toString());
    }

}
