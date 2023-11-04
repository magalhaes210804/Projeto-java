package com.example.crm.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.pessoas.MalaDiretaInfo;
import com.example.crm.pessoas.PessoaRepository;
import com.example.crm.pessoas.Pessoas;

@RestController
@RequestMapping("/mala-direta")
public class retorna_mala_direta {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/{id}")
    public MalaDiretaInfo getDadosParaMalaDireta(@PathVariable Long id) {
        Pessoas pessoa = pessoaRepository.findById(id)
                .orElseThrow();

       
        MalaDiretaInfo malaDiretaInfo = new MalaDiretaInfo();
        malaDiretaInfo.setNome(pessoa.getNome());
        malaDiretaInfo.setEndereco(pessoa.getEndereco());
        malaDiretaInfo.setCidade(pessoa.getCidade());
        malaDiretaInfo.setUf(pessoa.getUf());

        return malaDiretaInfo;
    }
}
