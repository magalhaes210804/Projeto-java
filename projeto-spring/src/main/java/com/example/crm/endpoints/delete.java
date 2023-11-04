package com.example.crm.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.pessoas.PessoaRepository;
import com.example.crm.pessoas.Pessoas;

@RestController
@RequestMapping("/pessoas")
public class delete {
    @Autowired
    private PessoaRepository pessoaRepository;

    @DeleteMapping("/{id}")
    public void removerPessoa(@PathVariable Long id) {
        Pessoas pessoaExistente = pessoaRepository.findById(id)
                .orElseThrow();

        pessoaRepository.delete(pessoaExistente);
    }
}
