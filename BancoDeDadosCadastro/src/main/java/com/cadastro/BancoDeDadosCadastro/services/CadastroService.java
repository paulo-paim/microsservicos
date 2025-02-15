package com.cadastro.BancoDeDadosCadastro.services;

import com.cadastro.BancoDeDadosCadastro.dtos.CadastroDTO;
import com.cadastro.BancoDeDadosCadastro.entities.CadastroEntity;
import com.cadastro.BancoDeDadosCadastro.models.CadastroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    @Autowired
    private CadastroEntity cadastroEntity;

    public CadastroModel salvar(CadastroDTO novoCadastro){
        CadastroModel model = new CadastroModel(novoCadastro);
        CadastroModel modelSalvo = this.cadastroEntity.save(model);
        return modelSalvo;
    }
}
