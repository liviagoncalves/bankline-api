package com.lgm.santander.banklineapi.controller;

import com.lgm.santander.banklineapi.dto.NovaMovimentacao;
import com.lgm.santander.banklineapi.dto.NovoCorrentista;
import com.lgm.santander.banklineapi.model.Correntista;
import com.lgm.santander.banklineapi.model.Movimentacao;
import com.lgm.santander.banklineapi.repository.CorrentistaRepository;
import com.lgm.santander.banklineapi.repository.MovimentacaoRepository;
import com.lgm.santander.banklineapi.service.CorrentistaService;
import com.lgm.santander.banklineapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){

        service.save(movimentacao);
    }
}
