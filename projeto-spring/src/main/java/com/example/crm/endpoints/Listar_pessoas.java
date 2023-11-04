package com.example.crm.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.pessoas.PessoaRepository;
import com.example.crm.pessoas.Pessoas;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class Listar_pessoas {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoas> listarTodasAsPessoas() {
        return pessoaRepository.findAll();
    }
}
