package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos") // URL metodos
public class MatodosHttpController {

	
	// ** Métodos HTML **
	// Get => Obter 
	// Post => Inserir 
	// Put => Alterar 
	// Patch => Alterar parcial 
	// Delete => Excluir 
	// Options => Verifica quais métodos http que a URL supota (Get / Post)
	// Trace => Usado para fazer uma requisição de teste
	// Head => Muito pareceido com o Get, só que o Get(como resposta recebe um corpo) 
  	    // e o Head recebe  a mesma resposta só que sem conteúdo, pode ser usado quando queremos saber 
	    // se uma determinada URL está funcionando 
	
	@GetMapping // como não colocamos um path, ele vai assumir o /metodos declarado no @RequestMapping("/metodos")
	public String get() {
		return "Requisição GET";
	}
	
	@PostMapping
	public String post() {
		return "Requisição POST";
	}
	
	@PutMapping
	public String put() {
		return "Requisição PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisição PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";
	}
}
