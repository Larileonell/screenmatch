package br.com.study.screenmatch.controller;

import br.com.study.screenmatch.domain.filmes.DadosCadastroFilmes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping
    public String carregaPaginaFormulario(){
    return "filmes/formulario";
    }
    @PostMapping
    public String cadastraFilme(DadosCadastroFilmes dados){
        System.out.println(dados);

        return "filmes/formulario";
    }
}

