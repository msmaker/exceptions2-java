package entities;

import model.exceptions.DomainException;

public class Account {

	private Integer numero;
	private String nome;
	private Double saldo;
	private Double saqueLimite;

	public Account() {
	}

	public Account(Integer numero, String nome, Double saldo, Double saqueLimite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.saqueLimite = saqueLimite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getSaqueLimite() {
		return saqueLimite;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		if (this.saldo < valor) {
			throw new DomainException("Saldo insuficiente");
		} else if (this.saqueLimite < valor) {
			throw new DomainException("Limite de saque excedido");
		} else {
			this.saldo -= valor;
		}

	}

}
