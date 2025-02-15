package com.cadastro.BancoDeDadosCadastro.consumers;

import com.cadastro.BancoDeDadosCadastro.dtos.CadastroDTO;
import com.cadastro.BancoDeDadosCadastro.models.CadastroModel;
import com.cadastro.BancoDeDadosCadastro.services.CadastroService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CadastroConsumer {

    final CadastroService cadastroService;

    public CadastroConsumer(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @RabbitListener(queues = "${broker.queue.cadastro.name}")
    public void listenEmailQueue(@Payload CadastroDTO dto){
        System.out.println(dto.cpf());
        var cadastroModel = new CadastroModel();
        BeanUtils.copyProperties(dto, cadastroModel);

        //salvar
        CadastroModel salvo = this.cadastroService.salvar(dto);

    }
}
