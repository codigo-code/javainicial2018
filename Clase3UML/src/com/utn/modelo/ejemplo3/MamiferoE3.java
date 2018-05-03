package com.utn.modelo.ejemplo3;
/*
 * LA INTERFAZ TIENE METODOS ABSTRACTOS HASTA LA VERSION 1.7
 * TAMBIEN PUEDE TENER ATRIBUTOS FINALES ( CONSTANTES) Y DEFINIDAS
 * A PARTIR DE LA VERSION 1.8 EXISTEN LOS METODOS DEFAULT
 */

public interface MamiferoE3 {

	//A PARTIR DE LA VERSION 1.5 DE JAVA QUEDO OBSOLETO ESCRIBIR ABSTRACT DELANTE DEL METODO
	public abstract void comer(String[] alimentos);
	
	public void dormir(double horas);
	
	public double caminar(String superficie, double distancia);
	
	default public void comunicarse() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Estoy hablando desde la interfaz");
	}
	
	
}
