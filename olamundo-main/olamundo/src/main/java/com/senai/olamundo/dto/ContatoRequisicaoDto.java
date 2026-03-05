package com.senai.olamundo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ContatoRequisicaoDto(
        @NotBlank(message = "[THE NAME CANNOT BE EMPTY]")
        String name,
        @NotBlank(message = "[THE PHONE NUMBER CANNOT BE EMPTY]")
        String numero
) {
}
