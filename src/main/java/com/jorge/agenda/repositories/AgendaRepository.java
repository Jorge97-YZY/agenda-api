package com.jorge.agenda.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jorge.agenda.domain.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {

	@Query("SELECT obj FROM Agenda obj WHERE obj.finalizado = false ORDER BY obj.dataParaFinalizar")
	List<Agenda> findAllOpen();

	@Query("SELECT obj FROM Agenda obj WHERE obj.finalizado = true ORDER BY obj.dataParaFinalizar")
	List<Agenda> findAllClose();

}
