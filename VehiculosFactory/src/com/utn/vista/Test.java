package com.utn.vista;

import com.utn.modelo.Motor;
import com.utn.modelo.Vehiculo;

public class Test {

	public static void main(String[] args) {
		
		Vehiculo  v = new Vehiculo();
		
		v.setModelo("Corola");
		v.setMarca("Toyota");
		v.setColor("Blanco");
		
		//creo un  motor
		Motor m = new Motor();
		m.setTipoCombustible("Nafta");
		m.setCaballoFuerza(100.0);
		
		//le asigno al vehiculo un motro
		v.setMotor(m);
		
		
		//posicion de memoria , por medio del metodo toString()
		System.out.println(v);
		
		
		
	}
}
