package com.cadastro.BancoDeDadosCadastro.controllers;

import com.cadastro.BancoDeDadosCadastro.dtos.CadastroDTO;
import com.cadastro.BancoDeDadosCadastro.models.CadastroModel;
import com.cadastro.BancoDeDadosCadastro.services.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastro")
public class CadastroController {

    @Autowired
    private CadastroService service;

    @PostMapping
    public ResponseEntity novoCadastro(@RequestBody CadastroDTO cadastroDto){
        return new ResponseEntity(this.service.salvar(cadastroDto), HttpStatus.CREATED);
    }
}
