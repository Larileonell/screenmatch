package br.com.study.screenmatch.controller;

import br.com.study.screenmatch.domain.filmes.DadosCadastroFilmes;
import br.com.study.screenmatch.domain.filmes.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>();

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(){
    return "filmes/formulario";
    }
    @GetMapping
    public String carregaPaginaListagem(){
        return "filmes/listagem";
    }
    @PostMapping
    public String cadastraFilme(DadosCadastroFilmes dados){
       var filme = new Filme(dados);
       filmes.add(filme);
        return "filmes/formulario";
    }
}

