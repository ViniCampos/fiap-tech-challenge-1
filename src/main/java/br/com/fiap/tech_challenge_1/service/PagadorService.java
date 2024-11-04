package br.com.fiap.tech_challenge_1.service;

import br.com.fiap.tech_challenge_1.entities.Pagador;
import br.com.fiap.tech_challenge_1.repository.PagadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PagadorService {
    @Autowired
    private PagadorRepository pagadorRepository;

    public Collection<Pagador> getAll() {
        var pagadores = pagadorRepository.findAll();
        return pagadores;
    }

    public Pagador setPagador(Pagador pagador) {
        pagador = pagadorRepository.save(pagador);
        return pagador;
    }
}
