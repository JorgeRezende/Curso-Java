package br.com.cod3r.exerciciossb.model.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

// Repositorio de dados para abstrair o acesso aos dados
//  <Produto> que é o tipo de entidade  que o ProdutoRepository será responsável  por perssistir (inserir, consultar, altera etc)
// <Integer> é o tipo relacionado ao ID do Produto

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{ // extendendo a interface CrudRepository  

	
}
