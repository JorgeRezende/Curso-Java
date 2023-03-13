package br.com.cod3r.exerciciossb.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) // incluído para sanar um erro de compilação ao startar o servidor, solução encontrada na internet
@RestController
public class PrimeiroController {

	@GetMapping(path = {"/ola", "/saudacao"}) // duas URLs que atendem para o emsmo método => {"/ola", "/saudacao"}
	public String ola() {
		return "Olá Sprting Boot!";
	}
	

	
}
