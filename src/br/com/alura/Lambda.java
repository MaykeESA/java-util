package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;

public class Lambda {
	public static void main(String[] args) {

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

		/*
		 * Com Lambda é possível diminuir muito o código, por que, já fica implícito
		 * algumas propriedades de acordo com a função que utilizamos.
		 * 
		 * Ex:
		 * 
		 * lista.sort(meuComparador) -> Eu sei que é necessário um Comparator<Conta>,
		 * em vez de criarmos uma classe para esse comparador, ou declarar uma classe
		 * anônima de forma explícita, com Lambda só é necessário passar os argumentos
		 * da função, que é implementado do Comparator<Conta>, vulgo, "compare", e declarar
		 * a lógica do retorno.
		 */
		
		System.out.println("X-------------------------X\nNumero:\n");

		//Lambda mais específica
		lista.sort((Conta c1, Conta c2) -> {
			return Integer.compare(c1.getNumero(), c2.getNumero());
		});

		lista.forEach(new Consumer<Conta>() {
			@Override
			public void accept(Conta c) {
				System.out.println(c.getNumero());
			}
		});

		System.out.println("X-------------------------X\nNome:\n");

		//Lambda mais enxuto
		lista.sort((c1, c2) -> c1.getNome().compareTo(c2.getNome()));
		lista.forEach(conta -> System.out.println(conta.getNome()));
		
		System.out.println("X-------------------------X\nSaldo:\n");

		//Outra forma de declarar Classe anônima

		Comparator<Conta> comp = new Comparator<Conta>() {

			@Override
			public int compare(Conta c1, Conta c2) {
				if (c1.getSaldo() > c2.getSaldo()) {
					return 1;
				}

				return -1;
			}
		};

		lista.sort(comp);

		for (Conta c : lista) {
			System.out.println(c.getSaldo());
		}

		System.out.println("X-------------------------X");
	}
}
