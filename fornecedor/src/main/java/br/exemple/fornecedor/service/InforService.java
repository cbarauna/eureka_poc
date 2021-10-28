package br.exemple.fornecedor.service;

import br.exemple.fornecedor.dto.InfoFornecedorDTO;
import org.springframework.stereotype.Service;

@Service
public class InforService {
    public InfoFornecedorDTO getInfoEstado(String estado) {


        return new InfoFornecedorDTO();
    }
}
