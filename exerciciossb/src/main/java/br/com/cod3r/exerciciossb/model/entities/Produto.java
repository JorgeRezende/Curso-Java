package br.com.cod3r.exerciciossb.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Criando uma entidade
@Entity // anotação obrigatória
public class Produto {

	@Id // toda entidade tem que ter um @ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // o produto terá a sua propria sequencia de id única
	private int id;

	private String nome;

	// construtor padrão
	public Produto() {

	}
	
	
// Getters / Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// construtor baseado nos Fields
	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	
	
	
}
