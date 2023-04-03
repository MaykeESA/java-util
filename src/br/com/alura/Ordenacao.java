package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;

public class Ordenacao {
	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente("Mayke", 22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca("Erick", 22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente("Gabriel", 22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca("Devinho", 22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println(lista);
		
		//Ordenacao de acordo com numero da conta
		CompareListNumber cl = new CompareListNumber();
		lista.sort(cl);
		for(Conta c : lista) {
			System.out.println(c.getNumero());
		}

		System.out.println("X-------------------------X");
		
		CompareListName c2 = new CompareListName();
		lista.sort(c2);
		for(Conta c : lista) {
			System.out.println(c.getNome());
		}
	}
}

class CompareListNumber implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		return 1;
	}
	
}

class CompareListName implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getNome().compareTo(c2.getNome());
	}
	
}
