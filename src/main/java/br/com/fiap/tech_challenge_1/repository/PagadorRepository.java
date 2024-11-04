package br.com.fiap.tech_challenge_1.repository;

import br.com.fiap.tech_challenge_1.entities.Pagador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PagadorRepository extends JpaRepository<Pagador, UUID> {
}
