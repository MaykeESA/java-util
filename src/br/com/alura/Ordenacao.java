package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;

public class Ordenacao {
	public static void main(String[] args) {

		/*
		 * Qual o melhor tipo de ordenação?
		 * 
		 * - Classe anônima: o problema dela é que o código fica muito mais ruim de ler.
		 * - Function Object: ficamos criando classes apenas para atender uma única função.
		 * - Lambda: melhor forma, só é um pouco difícil de ler para quem não tem prática.
		 */
		
		Conta cc1 = new ContaCorrente("Mayke", 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca("Erick", 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente("Gabriel", 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca("Devinho", 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println("X-------------------------X\nNumero:\n");
		
		/*
		 * Classe anônima, não estamos instaciando a interface, por baixo dos panos existe 
		 * uma classe
		 */
		
		lista.sort(new Comparator<Conta>() {
			@Override
			public int compare(Conta c1, Conta c2) {
				if (c1.getNumero() < c2.getNumero()) {
					return -1;
				}
				return 1;
			}
		}
	);

		for (Conta c : lista) {
			System.out.println(c.getNumero());
		}
		
		System.out.println("X-------------------------X\nSaldo:\n");
		
		/*
		 * - Comparable<T> na classe da Lista:
		 * Antes do Java 8 era usado esse tipo de ordenação, interface Comparable<T>,
		 * é uma forma de ter uma ordenção Default para uma classe.
		 */
		
		//Collections.sort(lista, new CompareListNumber());
		Collections.sort(lista);
		for (Conta c : lista) {
			System.out.println(c.getSaldo());
		}

		System.out.println("X-------------------------X\nNome:\n");

		//Já esse tipo de ordenação foi implementado no Java 8
		
		lista.sort(new CompareListName());
		for (Conta c : lista) {
			System.out.println(c.getNome());
		}

	}
}

//Function Object, a classe só existe com finalidade de implementar ou extender algo.
class CompareListName implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getNome().compareTo(c2.getNome());
	}

}
