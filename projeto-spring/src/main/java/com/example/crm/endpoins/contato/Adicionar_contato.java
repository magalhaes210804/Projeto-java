package com.example.crm.endpoins.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.Contato.Contato;
import com.example.crm.Contato.ContatoRepository;
import com.example.crm.pessoas.PessoaRepository;
import com.example.crm.pessoas.Pessoas;

@RestController
@RequestMapping("/pessoas")
public class Adicionar_contato {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    @PostMapping("/{pessoaId}/contatos")
    public Pessoas adicionarContato(@PathVariable Long pessoaId, @RequestBody Contato novoContato) {
        Pessoas pessoa = pessoaRepository.findById(pessoaId)
                .orElseThrow();

        novoContato.setPessoa(pessoa);
        pessoa.getContatos().add(novoContato);

        pessoaRepository.save(pessoa);

        return pessoa;
    }
}
