package br.com.cod3r.exerciciossb.model.entities;

public class Cliente {

	// retornando um objeto
	
	private int id;
	private String mome;
	private String cpf;
	
	// construtor usando fields
	public Cliente(int id, String mome, String cpf) {
		super();
		this.id = id;
		this.mome = mome;
		this.cpf = cpf;
	}

	// metodos getters/setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMome() {
		return mome;
	}

	public void setMome(String mome) {
		this.mome = mome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}
