package br.exemple.loja.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompraDTO {
    private List<IntensDTO> itens;
    private EnderecoDTO endereco;


}
