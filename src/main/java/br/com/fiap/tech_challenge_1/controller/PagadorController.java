package br.com.fiap.tech_challenge_1.controller;

import br.com.fiap.tech_challenge_1.entities.Pagador;
import br.com.fiap.tech_challenge_1.service.PagadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@RestController
@RequestMapping("/pagadores")
public class PagadorController {
    @Autowired
    private PagadorService pagadorService;

    @GetMapping
    public ResponseEntity<Collection<Pagador>> getAll() {
        var pagadores = pagadorService.getAll();
        return ResponseEntity.ok(pagadores);
    }

    @PostMapping
    public ResponseEntity<Pagador> setPagador(@RequestBody Pagador pagador) {
        pagador = pagadorService.setPagador(pagador);
        return ResponseEntity.status(201).body(pagador);
    }

}
