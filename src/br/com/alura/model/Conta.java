package br.com.alura.model;

public class Conta extends Object{

	private String nome;
	private int numero;
	private int agencia;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String no, int a, int n) {
		this.nome = no;
		this.numero = n;
		this.agencia = a;
	}

	public void deposita(double d) {
		this.saldo += d;
		
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "| Numero: " + this.numero + " | Nome: " + this.nome + " | ";
	}
}
