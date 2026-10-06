package com.segsat.springtester.service;


import com.segsat.springtester.model.Agendamento;
import com.segsat.springtester.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {
    private final AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository){
        this.repository = repository;
    }
    public Agendamento novoAgendamento(Agendamento agendamento){
        return repository.save(agendamento);
    }
    public List<Agendamento> listarAgendamentos(){
        return repository.findAll();
    }
    public Agendamento buscarPeloId(long id){
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Agendamento não encontrado"));
    }
    public void deletar (Long id){
        try {
            repository.deleteById(id);
        }
        catch(RuntimeException e){
            System.out.println("ID não encontrado erro: " + e.getMessage()) ;
        }
    }


}
