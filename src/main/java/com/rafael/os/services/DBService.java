package com.rafael.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.rafael.os.domain.Cliente;
import com.rafael.os.domain.OS;
import com.rafael.os.domain.Tecnico;
import com.rafael.os.domain.enuns.Prioridade;
import com.rafael.os.domain.enuns.Status;
import com.rafael.os.repositories.ClienteRepository;
import com.rafael.os.repositories.OSRepository;
import com.rafael.os.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Valdir Cezar", "793.850.270-77", "(88) 98888-8888");
		Tecnico t2 = new Tecnico(null, "Linus Torvalds", "641.760.040-88", "(88) 97777-7777");
		Cliente c1 = new Cliente(null, "Betina Campos", "817.250.590-61", "(88) 99999-7777");
		
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);
		
		t1.getList().add(os1);
		c1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
		
	}
}
