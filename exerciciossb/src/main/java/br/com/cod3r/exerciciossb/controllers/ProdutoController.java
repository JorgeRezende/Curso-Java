package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

//	@PostMapping //-- cadastrando um produto
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) // em um único método usamos as duas funçlões de cadastrar e alterar
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) { // @Valid => vai aplicar as validações definidas no Produto.java @NotBlank, @Min. @Max etc

		// esse método sempre será chamado quando for chamada uma requisição do tipo Post

		produtoRepository.save(produto);
		return produto;
	}
	
	// esse método sempre será chamado quando for chamada uma requisição de consulta
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll(); // findAll() => retorna todos os prudutos do banco de dados
	}

	// consultando por nome	
	@GetMapping(path="/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
	//	return produtoRepository.findByNomeContainingIgnoreCase(parteNome); // findAll() => retorna todos os prudutos do banco de dados
		return produtoRepository.searchByNameLike(parteNome); // findAll() => retorna todos os prudutos do banco de dados		
	}
	
	// consulta paginada
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(
			@PathVariable int numeroPagina, @PathVariable int qtdePagina){ // @PathVariable => variável do nosso caminho // Iterable<Produto> => Lista de produtos
		if(qtdePagina >= 5) qtdePagina = 5; // limitando a quantidade máxima de elementos em 5
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}
	
	// consultando por ID - quando for passado um ID cairá nesse método
	@GetMapping(path="/{id}") // informando que o tipo de parametro que vai receber no final da url será um id => /api/produtos/id
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) { // esperando receber um id como parâmetro
		return produtoRepository.findById(id);
	}
	
	
	// Alterando de produto -- quando for feita uma requisição do tipo Put, chamará esse método
//	@PutMapping 
//	public Produto alterarProduto(@Valid Produto produto) { // (Protudo produto) => recebendo o proprio poduto
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	// Excluindo um produto -- quando for feita uma requisição do tipo Delete, chamará esse método
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	

}
