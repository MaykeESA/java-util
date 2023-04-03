package br.com.alura.model;

public class Conta extends Object implements Comparable<Conta>{

	private String nome;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
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
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Nome: " + this.nome + ", Saldo: " + this.saldo;
	}

	@Override
	public int compareTo(Conta c) {
		return Double.compare(this.saldo, c.saldo);
	}
}
