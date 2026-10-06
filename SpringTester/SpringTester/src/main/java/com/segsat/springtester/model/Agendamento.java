package com.segsat.springtester.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cliente;

    @Column(nullable = false)
    private String servico;

    @Column(nullable = false)
    private LocalDateTime dataHora;

    public Agendamento(){
    }

    public Agendamento(String cliente, String servico, LocalDateTime datahora){
        this.cliente = cliente;
        this.servico = servico;
        this.dataHora = dataHora;
    }
    public Long getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime datahora){
        this.dataHora = datahora;
    }


}
