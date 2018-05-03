package com.utn.modelo.ejemplo1;

public class CaninoE1 extends MamiferoE1{

	//sobre-escritura del metodo
	@Override
	public void dormir(double horas) {
		System.out.println("El canino duerme en una cucha " + horas + " cantidad de horas");
	}
}
