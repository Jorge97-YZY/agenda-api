package com.jorge.agenda.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorge.agenda.domain.Agenda;
import com.jorge.agenda.repositories.AgendaRepository;

@Service
public class DBService {

	@Autowired
	private AgendaRepository agendaRepository;

	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Agenda a1 = new Agenda(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2022"), false);
		
		Agenda a2 = new Agenda(null, "Ler", "Ler livro de desenvolvimento pessoal",
				sdf.parse("02/03/2021"), true);
		
		Agenda a3 = new Agenda(null, "Exercicios", "Praticar Exercicios Fisicos",
				sdf.parse("15/03/2022"), false);
		
		Agenda a4 = new Agenda(null, "Meditar", "Meditar Durante 30 minutos pela manhã",
				sdf.parse("25/03/2022"), true);

		agendaRepository.saveAll(Arrays.asList(a1, a2, a3, a4));

	}
}
