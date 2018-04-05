package com.utn.vista;

import java.util.Locale;
import java.util.Scanner;

import com.utn.controlador.PersonaControlador;
import com.utn.modelo.Persona;

public class Test {

	//nuestro punto de inicio de la aplicacion!
	public static void main(String[] args) {

		PersonaControlador pc = new PersonaControlador();
		
		pc.creoPersona();
		pc.creoPersonaConAtributos("Francisco", "Isco", 30, 8, 40, 1.70);
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Ingrese el nombre");
		String nombre = input.nextLine();
		System.out.println("Ingrese el apellido");
		String apellido = input.nextLine(); //String
		System.out.println("Ingrese la edad, recuerde que es numerico");
		int edad = input.nextInt(); // es para enteros
		System.out.println("Ingrese la cantidad de horas que duerme la persona");
		int cantHoras = input.nextInt();
		System.out.println("Ingrese el peso de la persona");
		double peso = input.nextDouble();
		System.out.println("Ingrese la altura de la persona");
		double altura = input.nextDouble();
		
		pc.creoPersonaConAtributos(nombre, 
								apellido, edad, 
								cantHoras,peso,altura);
		
		Persona pipo1 = pc.creoObjPersona("pipo", "Mengano", 40, 12, 200, 1.40);
		
		Persona pipo2 = pipo1;
		
		pipo2.nombre="chau nos vemos!";
		
		System.out.println(pipo1.nombre);
		
		System.out.println(pipo2.nombre);
		
	}

}
