package com.utn.vista;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test {

	// Que es el punto de inicio de la aplicacion
	public static void main(String[] args) {
		int sumo = sumoDosNumeros(2, 2);
		
		System.out.println(sumo);

		datosPersonales("Dante", 36, "Villa del Parque");
		
		int resultado =  restoDosNumeros(sumo, 2);
		
		System.out.println(restoDosNumeros(sumoDosNumeros(2, 2), restoDosNumeros(3, 1)));
		
		System.out.println(resultado);
	}

	// Metodo de tipo funcion que suma 2 numeros y retorna el resultado
	public static int sumoDosNumeros(int num1, int num2) {
		return num1 + num2;
	}

	public static void datosPersonales(String nombre, int edad, String barrio) {
		// concatenacion de variables con cadenas
		String informacion = "nombre: " + nombre +
				" edad: " + edad + 
				" Barrio donde vive: " + barrio;
		System.out.println(informacion);
	}
	
	//funcion que devuelve el resultado de la 
	//resta de dos numeros
	public static int restoDosNumeros(int num1, 
			                          int num2){
		return num1 - num2;
	}
	
	
	
	
	

}
