package com.utn.controlador;

import com.utn.modelo.Persona;

public class PersonaControlador {

	// Daremos vida a las personas muejeje!!!!

	// metodo que crea una persona con su comportamiento
	// duro en el codigo o hard-code ( harcodeado españolos! :-) )
	public void creoPersona() {

		// Creamos una instancia de la clase Persona
		// el objeto de la clase persona se llama per1
		Persona per1 = new Persona();

		per1.nombre = "Sergio";
		per1.apellido = "Goicochea";
		per1.edad = 46;

		per1.cantidadHorasDormir(10);

		checoIMC(per1.IMC(80, 1.90));
	}

	public void creoPersonaConAtributos(String nombre, String apellido, int edad, int cantHorasDormir, double peso,
			double altura) {

		Persona per2 = new Persona();
		per2.nombre = nombre;
		per2.apellido = apellido;
		per2.edad = edad;
		per2.cantidadHorasDormir(cantHorasDormir);
		checoIMC(per2.IMC(peso, altura));

	}

	public void checoIMC(double resultado) {

		if (resultado < 16.0) {
			System.out.println("Flaco Escuálido...");
		} else if (resultado == 16.0 || resultado < 18.49) {
			System.out.println("flaco safable...");
		} else if (resultado == 18.50 || resultado < 24.99) {
			System.out.println("Peso ideal!..");

		} else if (resultado == 25.0 || resultado < 29.99) {
			System.out.println("Gordo aflojale a los postres...");
		} else {
			System.out.println("Homero simpsom con camison de mujer!");
		}

	}
	
	public Persona creoObjPersona(String nombre, 
									String apellido, 
									int edad, 
									int cantHorasDormir, 
									double peso,
									double altura) {
		Persona p = new Persona();
		p.nombre=nombre;
		p.apellido=apellido;
		p.edad=edad;
		p.cantidadHorasDormir(cantHorasDormir);
		p.IMC(peso, altura);
		
		return p;
	}

}
