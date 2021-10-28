package br.exemple.fornecedor.controller;

import br.exemple.fornecedor.dto.InfoFornecedorDTO;
import br.exemple.fornecedor.service.InforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "fornecedor/info")
public class InfoController {

    @Autowired
    private InforService service;

    @GetMapping
    @RequestMapping("/{estado}")
    public InfoFornecedorDTO getInfoEstado(@PathVariable String estado) {

       return service.getInfoEstado(estado);

    }

}
