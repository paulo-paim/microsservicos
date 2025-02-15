package com.cadastro.cadastro.producers;

import com.cadastro.cadastro.dtos.CadastroDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CadastroProducer {

    final RabbitTemplate rabbitTemplate;

    public CadastroProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value(value = "${broker.queue.cadastro.name}")
    private String routeKey;

    public void publishMessage(CadastroDTO cadastroDTO){
        rabbitTemplate.convertAndSend("",routeKey,cadastroDTO);
    }



}
