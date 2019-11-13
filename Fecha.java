package es.everis;

public class Fecha {

      public int dia;
      public int mes;
      public int anyo;
      
      public void mostrarFecha() {
    	  System.out.println(dia + "/" + mes + "/" + anyo);    	      	  
      }
   
    public Fecha() {
    	// 
    }
    
	public Fecha(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
}
