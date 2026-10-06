package com.segsat.springtester.repository;

import com.segsat.springtester.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    

}
