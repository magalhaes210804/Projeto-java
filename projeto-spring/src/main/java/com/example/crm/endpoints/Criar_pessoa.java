package com.example.crm.endpoints;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.pessoas.Pessoas;

@RestController
public class Criar_pessoa {
    private List<Pessoas> pessoas = new ArrayList<>();

    @PostMapping("/pessoas")
    public Pessoas adicionarPessoa(@RequestBody Pessoas pessoa) {
        pessoa.setId(UUID.randomUUID().toString()); 
        pessoas.add(pessoa);
        return pessoa;
    }
}
