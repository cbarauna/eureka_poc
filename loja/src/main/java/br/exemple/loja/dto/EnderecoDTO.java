package br.exemple.loja.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EnderecoDTO {
    private String rua;
    private String numero;
    private String estado;
}
