package com.cadastro.cadastro.controllers;

import com.cadastro.cadastro.dtos.CadastroDTO;
import com.cadastro.cadastro.services.CadastroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastrar")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping
    public String novoCadastro(@Valid @RequestBody CadastroDTO cadastroDTO){
        System.out.println(cadastroDTO.celular());
        this.cadastroService.postMessage(cadastroDTO);
        return "Solicitação de cadastro realizada com sucesso!";
    }
}
