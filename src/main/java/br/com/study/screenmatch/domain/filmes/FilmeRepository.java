package br.com.study.screenmatch.domain.filmes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository   extends JpaRepository<Filme, Long> {
}// encapsulamento com herença e interface vazia, mas tem metodos herdados aqui da para usar todos os metodos getbyid, get all, delete crud completo
