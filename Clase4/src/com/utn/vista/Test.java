package com.utn.vista;

public class Test {

	public static void main(String[] args) {
		
		String[] nombres = { "Dante", "Magui", "Ana", "Javier", "Aldo" };

		System.out.println("Decremento el vector");
		//decrementacion!
		for (int i = nombres.length-1; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
		System.out.println("================");
		System.out.println("Incremento el vector");
		//incrementacion
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
	
	

}
