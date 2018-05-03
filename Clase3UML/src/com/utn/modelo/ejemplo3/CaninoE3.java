package com.utn.modelo.ejemplo3;

/*
 * PARA PODER TRABAJAR CON UNA INTERFAZ Y UTILIZARLA EN LA CLASE
 * SE DEBE IMPLEMENTAR CON LA PALABRA RESERVADA " implements " 
 */

public class CaninoE3  implements MamiferoE3{

	private boolean funcionalidadInterfaz;
	
	
	
	public boolean isFuncionalidadInterfaz() {
		return funcionalidadInterfaz;
	}

	public void setFuncionalidadInterfaz(boolean funcionalidadInterfaz) {
		this.funcionalidadInterfaz = funcionalidadInterfaz;
	}

	@Override
	public void comer(String[] alimentos) {


		System.out.println("el canino comio " + (alimentos.length) + " canitdad de alimentos");
		
	}

	@Override
	public void dormir(double horas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double caminar(String superficie, double distancia) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public void comunicarse() {
		//LA PALABRA SUPER HACER REFERENCIA A LA CLASE O INTERFAZ QUE SE 
		//IMPLEMENTA O EXTIENDE EN LA CLASE DONDE ESTOY PARAD@
		if(funcionalidadInterfaz)
			MamiferoE3.super.comunicarse();
		else
			System.out.println("Ejecuto la comunicacion de la clase CaninoE3");
		
	}
}
