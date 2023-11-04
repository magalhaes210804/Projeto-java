package com.example.crm.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.pessoas.PessoaRepository;
import com.example.crm.pessoas.Pessoas;

@RestController
@RequestMapping("/pessoas")
public class retorna_pessoas {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/{id}")
    public Pessoas getPessoaPorId(@PathVariable Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow();
    }
}
