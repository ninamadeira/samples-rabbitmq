package br.com.madeira.producer.services;

import dtos.AddressDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import static constants.RabbitMQConstants.EXG_NAME_LOGISTICS;
import static constants.RabbitMQConstants.RK_ADDRESS_LOG;

@Log4j2
@Service
@RequiredArgsConstructor
public class AddressService {

    private final RabbitTemplate rabbitTemplate;

    public void createAddress(AddressDTO dto) {
        log.info("Sending a message to exchange " + dto.toString());
        rabbitTemplate.convertAndSend(EXG_NAME_LOGISTICS, RK_ADDRESS_LOG, dto);
    }
}
