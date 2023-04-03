package br.com.alura;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.model.Conta;

public class ListAula {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * - ArrayList - Lista Normal
		 * - LinkedList - Lista duplamente encadeada
		 * - Vector - Não lembro, mas é usado em casos muito específicos
		 */

		//Generics, é essa tipificação do retorno da ArrayList
		List<Conta> listaConta = new ArrayList<>();
		Conta c1 = new Conta();
		Conta c2 = new Conta();

		listaConta.add(c1);
		listaConta.add(c2);
		listaConta.remove(0);
		listaConta.clear();
		listaConta.add(0, c2);
		boolean x = listaConta.isEmpty(); //False
		int size = listaConta.size(); //1
		listaConta.contains(c2); //True

		// List guarda referências de objetos, mas como ele guarda primitivos??
		// Wrapper - Ele é quem faz conversão de primitivo para objeto, ou vice-versa
		Integer a = new Integer(10);
		int b = 10;

		Integer c = Integer.valueOf(10);
		int d = c.intValue();

		Boolean e = new Boolean(x);
		boolean f = x;

		Double g = new Double(20);
		double h = 20;

		String i = "10";
		Integer j = Integer.valueOf(i); //String -> Integer
		int k = Integer.parseInt(i); //String -> int
		
		float l = 10;
		Float m = Float.valueOf(10);

		/*
		 * Primitivo ----> Obejto    | Autoboxing
		 * Objeto -------> Primitivo | Unboxing
		 */

		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(Integer.valueOf(10)); //Autoboxing | É exatamente isso que Java faz quando recebe um primitivo no lugar de uma ref
	}
}
