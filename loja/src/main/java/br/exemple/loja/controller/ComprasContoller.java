package br.exemple.loja.controller;

import br.exemple.loja.dto.CompraDTO;
import br.exemple.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/compra")
public class ComprasContoller {

    @Autowired
    private CompraService service;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra) {

      service.realizaCompra(compra);
    }
}
