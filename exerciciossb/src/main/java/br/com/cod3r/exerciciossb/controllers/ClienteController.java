package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

// anotação para ser chamado por uma url
@RestController
@RequestMapping("/clientes") // toda a classe estará mapeada para o /clientes, pode não usar a palavra  path = "/clientes"
public class ClienteController {

	// método para retornar um cliente
	@GetMapping("/qualquer") // não precisa colocar o /clientes pq já foi mapeada na classe @RequestMapping(path = "/clientes"), pode não usar a palavra path = "/qualquer"  
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}

	// 1º forma de passar parâmetro
	// passando o valor da variavel id para ULR como valor do parâmetro ID do cliente => /clientes/123
	// entre {} que dizer que é uma variável
	@GetMapping("/{id}") 
	public Cliente ObterClientePorId1(@PathVariable int id) { // @PathVariable quer dizer que a variável está dentro do Path da sua URL, vai pegar o valor que foi passado e colocar no int id
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	// 2º forma de passar parâmetro
	// http://localhost/clientes?id=123
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1")  int id) { // se não informar valor na URL assum o 1 como favor padrão => defaultValue = "1")
		return new Cliente(id, "João Augusto","111.222.333-44");
	}
	
}
