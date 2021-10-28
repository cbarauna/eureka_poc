package br.exemple.loja.service;

import br.exemple.loja.dto.CompraDTO;
import br.exemple.loja.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    @Autowired
    private RestTemplate restTemplate;

    public void realizaCompra(CompraDTO compra) {


        ResponseEntity<InfoFornecedorDTO> response = restTemplate.exchange("http://fornecedor/fornecedor/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(response.getBody().getEndereco());

    }
}
