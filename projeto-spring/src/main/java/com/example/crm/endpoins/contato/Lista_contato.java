package com.example.crm.endpoins.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.Contato.Contato;
import com.example.crm.pessoas.PessoaRepository;
import com.example.crm.pessoas.Pessoas;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class Lista_contato {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/{pessoaId}/contatos")
    public List<Contato> listarContatosDaPessoa(@PathVariable Long pessoaId) {
        Pessoas pessoa = pessoaRepository.findById(pessoaId)
                .orElseThrow();

        return pessoa.getContatos();
    }
}
