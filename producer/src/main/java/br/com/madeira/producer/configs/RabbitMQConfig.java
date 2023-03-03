package br.com.madeira.producer.configs;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static br.com.madeira.producer.constants.RabbitMQConstante.EXG_NAME_LOGISTICS;
import static br.com.madeira.producer.constants.RabbitMQConstante.QUEUE_ADDRESS_LOG;
import static br.com.madeira.producer.constants.RabbitMQConstante.RK_ADDRESS_LOG;

@Configuration
public class RabbitMQConfig {

        @Bean
        public Queue queue() {
            return new Queue(QUEUE_ADDRESS_LOG, false, false, false);
        }

        @Bean
        public DirectExchange directExchange() {
            return new DirectExchange(EXG_NAME_LOGISTICS, false, false);
        }

        @Bean
        public Binding binding() {
            return BindingBuilder
                    .bind(queue())
                    .to(directExchange())
                    .with(RK_ADDRESS_LOG);}
}