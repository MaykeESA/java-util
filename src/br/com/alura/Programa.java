package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		//O array args serve para passarmos parâmetros pelo prompt
		for(String a: args) {
			System.out.println(a);
		}
		
		/*
		 * - ArrayList
		 * - LinkedList
		 * - Vector
		 */
		
		//Generics, ArrayList retorna algo genérico, mas conseguimos tipificá 
 		List<Conta> listaConta = new ArrayList<>();
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		listaConta.add(c1);
		listaConta.add(c2);
		listaConta.remove(0);
		listaConta.clear();
		listaConta.add(3, c2);
		boolean x = listaConta.isEmpty();
		int size = listaConta.size();
		System.out.println(listaConta.contains(c2));
		
		//List guarda referências de objetos, mas como ele guarda primitivos??
		//Wrapper
		Integer a = new Integer(10);
		int b = 10;
		
		Integer c = Integer.valueOf(10);
		int d = c.intValue();
		
		Boolean e = new Boolean(x);
		boolean f = x;
		
		Double g = new Double(20);
		double h = 20;
		
		String i = "10";
		Integer j = Integer.valueOf(i);
		int k = Integer.parseInt(i);
		
		/*
		 *    		    Autoboxing
		 *           ---------------->
		 *  Primitivo                 Objeto
		 *           <----------------
		 *               Unboxing
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b); 
	}
}
