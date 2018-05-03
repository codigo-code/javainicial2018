package com.utn.modelo.ejemplo1;

public class MamiferoE1 {

	//atributos de la clase
	private String raza;
	private String nombre;
	
	
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
	
	public void dormir(double horas) {
		System.out.println("duerme " + horas + " horas");
	}
	
	public void comer(String[] alimentos) {
		System.out.println("==== " + this.getClass().getSimpleName() +"==== " );
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println("hoy comio : " + alimentos[i]);
		}
		
		System.out.println("======================");
	}
	
	
}
