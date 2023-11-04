package com.example.crm.endpoins.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.Contato.Contato;
import com.example.crm.Contato.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class Atualiza_contato {
    @Autowired
    private ContatoRepository contatoRepository;

    @PutMapping("/{id}")
    public Contato atualizarContato(@PathVariable Long id, @RequestBody Contato dadosAtualizados) {
        Contato contatoExistente = contatoRepository.findById(id)
                .orElseThrow();

       
        contatoExistente.setTipo(dadosAtualizados.getTipo());
        contatoExistente.setValor(dadosAtualizados.getValor());

        return contatoRepository.save(contatoExistente);
    }
}
