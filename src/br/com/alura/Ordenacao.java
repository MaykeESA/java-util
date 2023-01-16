package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;

public class Ordenacao {
	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println(lista);
		
		//Ordenacao de acordo com numero da conta
		compareList cl = new compareList();
		lista.sort(cl);
		System.out.println(lista);

	}
}

class compareList implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		return 1;
	}
	
}
