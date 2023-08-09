package br.com.study.screenmatch.controller;

import br.com.study.screenmatch.domain.filmes.DadosCadastroFilmes;
import br.com.study.screenmatch.domain.filmes.Filme;
import br.com.study.screenmatch.domain.filmes.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeRepository repository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(){
    return "filmes/formulario";
    }
    @GetMapping
    public String carregaPaginaListagem(Model model){
        model.addAttribute("lista", repository.findAll());
        return "filmes/listagem";
    }
    @PostMapping
    public String cadastraFilme(DadosCadastroFilmes dados){
       var filme = new Filme(dados);
       repository.save(filme);


        return "redirect:/filmes";
    }
}

