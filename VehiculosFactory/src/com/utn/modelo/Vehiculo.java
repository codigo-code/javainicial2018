package com.utn.modelo;

public class Vehiculo {
	// visibilidad
	// > private
	// > protected
	// > public

	/*
	 * Todo atributo privado es accedido por medio de un metodo publico
	 */

	private String marca;
	private String modelo;
	private String color;
	private Motor motor;

	// creamos el get y set por cada atributo

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	// set para poder asignar un valor al atributo privado
	public void setModelo(String modelo) {
		// this
		// crean un metodo y definen un valor como parametro
		// lo pueden utilizar directamente en su metodo

		this.modelo = modelo;
	}

	// get es para retornar o devolver el valor del atributo privado
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + "]";
	}



	
	

}
