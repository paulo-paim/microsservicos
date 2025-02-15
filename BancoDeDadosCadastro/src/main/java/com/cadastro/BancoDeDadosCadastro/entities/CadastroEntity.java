package com.cadastro.BancoDeDadosCadastro.entities;

import com.cadastro.BancoDeDadosCadastro.models.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CadastroEntity extends JpaRepository<CadastroModel, UUID> {
}
