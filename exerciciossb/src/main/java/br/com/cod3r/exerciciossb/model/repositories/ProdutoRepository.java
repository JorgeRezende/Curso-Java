package br.com.cod3r.exerciciossb.model.repositories;




//antes estava usando o CRUDRepository , foi subistuido pelo PagingAndSortingRepository para tambem poder usar a paginação no ProdutoController.java
//import org.springframework.data.repository.CrudRepository;  

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

// Repositorio de dados para abstrair o acesso aos dados
//  <Produto> que é o tipo de entidade  que o ProdutoRepository será responsável  por perssistir (inserir, consultar, altera etc)
// <Integer> é o tipo relacionado ao ID do Produto


@Repository
public interface ProdutoRepository 
      extends PagingAndSortingRepository<Produto, Integer>{ // extendendo a interface PagingAndSortingRepository  

	// implementação para pesquisar por nome do produto
	// quem vai implementar será o proprio Spring Boot, por isso temos que seguir as convenções padrões de nomenclatura  propostas por eles => findBy ... ContainingIgnoreCase ...
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

	// Outras convenções
// findByNomeContaining
// findByNomeIsContaining
// findByNomeContains
	
// findByNomeStartsWith
// findByNomeEndsWith

// findByNomeNotContaining
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
