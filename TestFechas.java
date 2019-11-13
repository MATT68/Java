package es.everis;

public class TestFechas {

	public static void main(String[] args) {
		
		Fecha fecha  = new Fecha();
		
		Fecha fecha2 = new Fecha(13,11,2019);
		
		fecha.dia  = 13;
		fecha.mes  = 11;
		fecha.anyo = 2019;
		
		// Mostrar por consola
		fecha.mostrarFecha();
		fecha2.mostrarFecha();
	} 
}
