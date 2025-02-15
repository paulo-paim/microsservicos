package com.cadastro.cadastro.services;

import com.cadastro.cadastro.dtos.CadastroDTO;
import com.cadastro.cadastro.producers.CadastroProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {


    private CadastroProducer cadastroProducer;

    public CadastroService(CadastroProducer cadastroProducer) {
        this.cadastroProducer = cadastroProducer;
    }

    public void postMessage(CadastroDTO cadastroDTO){
        cadastroProducer.publishMessage(cadastroDTO);
    }

}
