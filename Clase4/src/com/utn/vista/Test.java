package com.utn.vista;

public class Test {
	
	//variables globales
	static String nom1 ="Dante";
	static String nom2 ="Magui";
	
	//inicio del metodo main
	public static void main(String[] args) {
		
		String[] nombres = { nom1, nom2, "Ana", "Javier", "Aldo" };

		System.out.println("Decremento el vector");
		// decrementacion!
		for (int i = nombres.length - 1; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
		System.out.println("================");
		System.out.println("Incremento el vector");
		// incrementacion
		for (int i = 0; i < nombres.length; i++) {
			
			saludar(nombres[i]);  
		}
		//utilizo el metodo SaludoReturn
		System.out.println(saludoReturn("King Kong")); 
		
		
		recorroVectorVehiculo(asignoVehiculos("Camioneta","moto","ciclomotor"));
		
	}
	//fin del metodo main
	
	//inicio del metodo saludar
	public static void saludar(String nombre){
		System.out.println("Hola sr/a " + nombre);
	}//fin del metodo saludar
	
	
	//inicio del metodo SaludoReturn
	public static String saludoReturn(String apellidos){
		switch (apellidos) {
		case "Gomez":
			return "El apellido es Español";
		case "Panella":
			return "El apellido es Italiano";
		case "Makusas":
			return "El apellido es Lituano";
		default:
			return "No conozco la nacionalidad del apellido";
		}
	}//findel metodo saludoReturn
	
	
	public static String[] asignoVehiculos(String vehiculo1, 
							String vehiculo2, 
							String vechiculo3){
		
		String[] vecVehiculos ={vehiculo1,
								vehiculo2,
								vechiculo3};
		return vecVehiculos;
	}
	
	public static void tipoVehiculo(String tipoVehiculo){
		switch (tipoVehiculo) {
		case "moto":
			System.out.println("solo pueden viajar 2 personas maximo en el vehiculo de tipo: " + tipoVehiculo);
			break;
		case "auto":
			System.out.println("solo pueden viajar 4 personas maximo en el vehiculo de tipo: " + tipoVehiculo);
			break;
		case "bus":
			System.out.println("solo pueden viajar 30 personas maximo en el vehiculo de tipo: "+ tipoVehiculo);
			break;
		default:
			System.out.println("no conozco el tipo de vehiculo");
			break;
		}
	}
	
	public static void recorroVectorVehiculo(String[] vector){
		for (int i = 0; i < vector.length; i++) {
			tipoVehiculo(vector[i]);
		}
	}
	

}





