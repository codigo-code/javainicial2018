package com.utn.modelo;

public class Persona { // INICIO CLASE

	// acceso publico entre objetos
	// atributos
	public String nombre;
	public String apellido;
	public int edad; 

	// Metodos
	// procedimiento
	public void cantidadHorasDormir(int cantHoras) {
		System.out.println("La persona " + nombre + " durmio " + cantHoras + " hs");
	}

	// funcion
	public double IMC(double peso, double altura) {

		return peso / (altura * altura);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	

}// FIN CLASE
