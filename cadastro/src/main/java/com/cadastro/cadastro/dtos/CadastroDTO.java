package com.cadastro.cadastro.dtos;

import jakarta.validation.constraints.NotBlank;

public record CadastroDTO(
        @NotBlank String nome,
        @NotBlank String cpf,
        @NotBlank String rg,
        @NotBlank String celular,
        @NotBlank String endereco
                          ) {
}
