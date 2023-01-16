package br.com.alura;

import br.com.alura.model.Conta;

public class Array {

	public static void main(String[] args) {
		//2 Formas de declarar um Array
		int[] idades = new int[5];
		idades[0] = 2;
		idades[1] = 5;
		idades[2] = 9;
		idades[3] = 1;
		idades[4] = 3;

		int[] idades2 = { 1, 6, 3, 10, 7 };

		Conta[] contas = new Conta[5];
		contas[0] = new Conta();
		contas[1] = new Conta();
		contas[2] = new Conta();
		contas[3] = new Conta();
		contas[4] = new Conta();

		System.out.println("Idades: ");
		for (int i : idades) {
			System.out.println(i);
		}
		
		System.out.println("\nIdades 2: ");
		for (int i : idades2) {
			System.out.println(i);
		}

		System.out.println("\nContas: ");
		for (Conta c : contas) {
			System.out.println(c.toString());
		}

		/*
		 * Para acessar a ref das filhas de um Array genérico, é necessário fazer cast
		 * para a mais específica
		 * 
		 */
		
		// O array args serve para passarmos parâmetros pelo prompt
		for (String a : args) {
			System.out.println(a);
		}
	}
}
