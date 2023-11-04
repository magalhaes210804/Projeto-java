package com.example.crm.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.pessoas.PessoaRepository;
import com.example.crm.pessoas.Pessoas;

@RestController
@RequestMapping("/pessoas")
public class Atualizar_pessoa {
    @Autowired
    private PessoaRepository pessoaRepository;

    @PutMapping("/{id}")
    public Pessoas atualizarPessoa(@RequestParam Long id, @RequestBody Pessoas dadosAtualizados) {
        Pessoas pessoaExistente = pessoaRepository.findById(id)
                .orElseThrow();

        pessoaExistente.setNome(dadosAtualizados.getNome());
        pessoaExistente.setEndereco(dadosAtualizados.getEndereco());
        pessoaExistente.setCep(dadosAtualizados.getCep());
        pessoaExistente.setCidade(dadosAtualizados.getCidade());
        pessoaExistente.setUf(dadosAtualizados.getUf());

        return pessoaRepository.save(pessoaExistente);
    }
}
