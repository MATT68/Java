package es.everis;

public class TestClientes3 {

	public static void main(String[] args) {
		// Crear un objeto o instancia de Cliente
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente("Raúl",(byte)8,true,15);
		Cliente cliente3 = new Cliente("Rubén",4);
		Cliente cliente4 = new Cliente("Raúl",(byte)8,true,15);
		//En las líneas anteriores Cliente() es el "Constructor" del objeto

		
		cliente1.nombre 	 	= "John";
		cliente1.edad 			= 28;
		cliente1.vip 			= false;
		cliente1.facturacion 	= 55000;

		/* 
 		cliente2.nombre 		= "Jim";
		cliente2.edad 			= 44;
		cliente2.vip 			= true;
		cliente2.facturacion 	= 255000;

		cliente3.nombre 		= "Eva";
		cliente3.edad 			= 39;
		cliente3.vip 			= true;
		cliente3.facturacion 	= 444000;
	    */	
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		System.out.println(cliente3.toString());
		
		//Comprobar la igualdad de los objetos
		if (cliente2 == cliente4) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

	}

}
