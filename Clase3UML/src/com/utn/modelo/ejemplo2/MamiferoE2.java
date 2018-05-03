package com.utn.modelo.ejemplo2;

/*
 * UNA CLASE ABSTRACTA NO SE PUEDE INSTANCIAR
 * PUEDE TENER METODOS ABSTRACTOS COMO NO ABSTRACTOS
 */
public abstract class MamiferoE2 {

	//atributos
	private String nombre;
	private String raza;
	private int edad;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//es un metodo definido donde escribimos su implementacion
	public void dormir(double cantHoras) {
		
		System.out.println("El "+this.getClass().getSimpleName() + " duerme " + cantHoras + " cantidad de horas");
	}	
	
	//tambien puede tener metodos abstractos
	public abstract void comer(String alimentos);
	
	
	
	
}
