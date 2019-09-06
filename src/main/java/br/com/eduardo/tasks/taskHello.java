package br.com.eduardo.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class taskHello {

	@Scheduled(fixedRate = 3000)
	public void imprimirHello( ) {
		System.out.println("Olá Eduardoo..");
	}
	
}
