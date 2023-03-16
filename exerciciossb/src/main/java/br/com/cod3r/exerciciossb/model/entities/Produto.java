package br.com.cod3r.exerciciossb.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

// Criando uma entidade
@Entity // anotação obrigatória
public class Produto {

	@Id // toda entidade tem que ter um @ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // o produto terá a sua propria sequencia de id única
	private int id;
	
	@NotBlank // valida para que o valor não seja vazio
	private String nome;
	
	@Min(0)// obriga que o preço seja no minimo 0,00, não pode ser negativo
	private double preco;
	
	@Min(0) // desconto no minimo será 0
	@Max(1) // desconto no máximo será 1
	private double desconto;

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	// construtor baseado nos Fields
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

}
