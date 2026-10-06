package com.segsat.springtester.controller;

import com.segsat.springtester.dto.AgendamentoRequest;
import com.segsat.springtester.model.Agendamento;
import com.segsat.springtester.service.AgendamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {
    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service){
        this.service = service;
    }

    @PostMapping
    public Agendamento novoAgendamento(@RequestBody AgendamentoRequest request){
        Agendamento agendamento = new Agendamento();
        agendamento.setCliente(request.getCliente());
        agendamento.setServico(request.getServico());
        agendamento.setDataHora(request.getDataHora());
        return service.novoAgendamento(agendamento);
    }

    @GetMapping
    public List<Agendamento> listarAgendamentos(){
        return service.listarAgendamentos();
    }

    @GetMapping("/{id}")
    public Agendamento buscarPeloId(@PathVariable Long id){
        return service.buscarPeloId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }


}
