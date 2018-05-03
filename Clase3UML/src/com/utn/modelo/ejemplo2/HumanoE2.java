package com.utn.modelo.ejemplo2;

/*
 * Cuando se extiende una clase abstracta en una no abstracta
 * estoy obligad@ a definir la funcionalidad de los metodos abstractos
 */

public class HumanoE2 extends MamiferoE2 {

	@Override
	public void comer(String alimentos) {
		System.out.println("comio " +  alimentos + " en un plato");
		
	}

}
