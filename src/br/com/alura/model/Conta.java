package br.com.alura.model;

public class Conta extends Object{

	private int numero;
	private int agencia;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int a, int n) {
		this.numero = n;
		this.agencia = a;
	}

	public void deposita(double d) {
		this.saldo += d;
		
	}
	
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return "N Conta: " + this.numero;
	}
}
