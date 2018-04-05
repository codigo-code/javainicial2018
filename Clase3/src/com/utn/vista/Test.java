package com.utn.vista;

public class Test {

	public static void main(String[] args) {
		boolean usuario = true;
		String nombreUsuario = "Miguel";
		boolean mandoEmail = false;

		if (usuario == true) {
			System.out.println("el usuario esta registrado");
			if (nombreUsuario == "dante") {
				System.out.println("bienvenido " + nombreUsuario);
			} else {
				System.out.println("el usuario no registro su nombre");
			}
		} else if (mandoEmail) {
			System.out.println("Se envio el correo....");
		} else {
			System.out.println("el usuario no esta registrado");
		}
		
		int num1=2;
		int num2=5;
		
		// nos devolvera dos posibles resultados
		//o verdadero o falso
		if( comparoMayor(num1, num2)){
			System.out.println(num1+ " es mayor a " +num2);
		}else{
			System.out.println(num1+ " es menor a "+ num2 );
		}
		
	}
	
	public static boolean comparoMayor(int num1, int num2){
		
		return num1 > num2;
	}

}
