package es.everis;

public class Cliente {

	// Las características del cliente son 
	// Propiedades de la clase
	String 	nombre;
	byte 	edad;
	boolean	vip;
	double	facturacion;
	
	// Las propiedades definen el tipo de información, y los métodos procesan esa información
	
	//Constructor por defecto
	public Cliente() {
		// TODO Auto-generated constructor stub	
	}
    
	//Sobrecarga de constructores
	public Cliente(String nombre, byte edad, boolean vip, double facturacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.vip = vip;
		this.facturacion = facturacion;
	}
	
	public Cliente(String nombre, double facturacion) {
		super();
		this.nombre = nombre;
		this.facturacion = facturacion;
	}

	// Métodos
	// El método ToString() muestra la información textual de un objeto....
	// Sobreescribimos el método ToString()
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", vip=" + vip + ", facturacion=" + facturacion + "]";
	}
	
	
	
	
}
