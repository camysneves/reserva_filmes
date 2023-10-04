package main.java.com.br.reservafilmes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/selecao-ator")
public class AtorController {

    @Autowired
    AtorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<SelecaoAtor> create(@RequestBody SelacaoAtor SelecaoAtor) {
        SelecaoAtor SelecaoAtorCreated = service.create(SelecaoAtor);

        return ResponseEntity.status(201).body(SelecaoAtorCreated);
    }

    @PatchMapping("/buscar-ator/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void patchStatus(@PathVariable Long id) throws Exception {
        service.buscarAtor(id);
    }

    @GetMapping("/ator/media/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Double ordemAlfabetica() {

        return service.ordemAlfabetica();
    }

    @GetMapping(value = "/atores/status/{status}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<Ator> retornarAtoresStatus(@PathVariable String status) {

        return service.retonaAtoresStatus(status);
    }

}
