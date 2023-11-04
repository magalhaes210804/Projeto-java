package com.example.crm.endpoins.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.Contato.Contato;
import com.example.crm.Contato.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class Retorna_contato {
    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/{id}")
    public Contato getContatoPorId(@PathVariable Long id) {
        return contatoRepository.findById(id)
                .orElseThrow();
    }
}
