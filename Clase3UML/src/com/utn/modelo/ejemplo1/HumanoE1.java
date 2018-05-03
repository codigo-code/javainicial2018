package com.utn.modelo.ejemplo1;

public class HumanoE1 extends MamiferoE1 {

	// sobre-escribir un metodos para obtener una funcionalidad distinta

	/*
	 * Concepto de polimorfismo
	 */

	//override --> hace referencia a que el metodo se sobre-escribio en la clase
	//donde se esta extendiendo
	@Override
	public void dormir(double horas) {

		System.out.println("el humano duerme en un cama " + horas + " cantidad de horas");

	}

}
