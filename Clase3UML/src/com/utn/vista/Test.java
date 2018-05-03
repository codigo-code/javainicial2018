package com.utn.vista;

import com.utn.modelo.ejemplo1.CaninoE1;
import com.utn.modelo.ejemplo1.HumanoE1;
import com.utn.modelo.ejemplo1.MamiferoE1;
import com.utn.modelo.ejemplo2.CaninoE2;
import com.utn.modelo.ejemplo2.HumanoE2;
import com.utn.modelo.ejemplo2.MamiferoE2;
import com.utn.modelo.ejemplo3.CaninoE3;
import com.utn.modelo.ejemplo3.HumanoE3;
import com.utn.modelo.ejemplo3.MamiferoE3;

public class Test {

	public static void main(String[] args) {

		
		//EJEMPLO UTILIZANDO CLASES NO ABSTRACTAS
		//creamos un mamifero de tipo humano
		/*
		 * Primer patron de diseño:
		 * 	FACTORIA ABSTRACTA --> LA COMPOSICION DE 
		 *  CLASE ABSTRACTA / INTERFAZ / CLASE NO ABSTRACTA
		 */
		MamiferoE1 m1 = new HumanoE1(); //obtiene el esqueleto del mamifero pero con
		                                //la funcionalidad del humano
		MamiferoE1 m2 = new CaninoE1();
		
		//MamiferoE1 m3 = new MamiferoE1();
		
		m1.dormir(8.5);
		m2.dormir(4.0);
		//m3.dormir(2.0);
		
		String[] alimentosHumano= {"cafe","galletitas","fideos con queso"};
		
		String[] alimentoCanino= {"dogui","hueso con carne","gatos","cucarachas"};
		
		m1.comer(alimentosHumano);
		
		m2.comer(alimentoCanino);
		
		System.out.println("=================EJEMPLO 2 CON CLASES ABSTRACTAS ================");
		
		//EJEMPLO UTILIZANDO CLASES ABSTRACTAS
		MamiferoE2 ma1 = new HumanoE2();
		MamiferoE2 ma2 = new CaninoE2();
		
		ma1.comer("Pizza");
		
		ma2.comer("Dogui");
		
		ma1.dormir(8.0);
		ma2.dormir(2.0);
		
		System.out.println("================= EJEMPLO 3 CON INTERFACES =================");
		MamiferoE3 mami1 = new HumanoE3();
		MamiferoE3 mami2 = new CaninoE3();
		
		mami1.comer(alimentosHumano);
		mami2.comer(alimentoCanino);

		//CASTEO ES LA TRANSFORMACION DE UN OBJETO EN OTRO
		// ejemplo : ((ObjA)ObjB)  == ObjB => ObjA
		
		
		mami1.comunicarse();
		((CaninoE3)mami2).setFuncionalidadInterfaz(true);
		mami2.comunicarse();		
		((CaninoE3)mami2).setFuncionalidadInterfaz(false);
		mami2.comunicarse();		
	}

}
