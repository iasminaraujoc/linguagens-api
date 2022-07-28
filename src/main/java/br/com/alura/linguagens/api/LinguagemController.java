package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping(value = "/linguagem-preferida")
    public String processaLinguagemPreferida(){
        return "Oi, Java!";
    }

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }

    @PostMapping("/linguagens")
    //converte um tipo no outro
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
        return repositorio.save(linguagem);
    }
}
