package com.utn.modelo;

public class Motor {

	@Override
	public String toString() {
		return "Motor [tipoCombustible=" + tipoCombustible + ", caballoFuerza=" + caballoFuerza + "]";
	}

	private String tipoCombustible;
	private double caballoFuerza;

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public double getCaballoFuerza() {
		return caballoFuerza;
	}

	public void setCaballoFuerza(double caballoFuerza) {
		this.caballoFuerza = caballoFuerza;
	}

}
