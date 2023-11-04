package com.example.crm.endpoins.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.Contato.Contato;
import com.example.crm.Contato.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class Remove_Contato {
    @Autowired
    private ContatoRepository contatoRepository;

    @DeleteMapping("/{id}")
    public void removerContato(@PathVariable Long id) {
        Contato contatoExistente = contatoRepository.findById(id)
                .orElseThrow();

        contatoRepository.delete(contatoExistente);
    }
}
