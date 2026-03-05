package com.senai.olamundo.mapper;

import com.senai.olamundo.dto.ContatoRequisicaoDto;
import com.senai.olamundo.dto.ContatoRespostaDto;
import com.senai.olamundo.model.Contato;
import org.springframework.stereotype.Component;

@Component
public class ContatoMapper {
    public Contato paraEntidade(ContatoRequisicaoDto contatoRequisicaoDto){
        return new Contato(contatoRequisicaoDto.nome(),
                contatoRequisicaoDto.numero());
    }

    public ContatoRespostaDto paraRespostaDto(Contato contato) {
        return new ContatoRespostaDto(contato.getId(),
                contato.getNome(),
                contato.getNumero());
    }
}
