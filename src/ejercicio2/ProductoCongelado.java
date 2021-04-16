package ejercicio2;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
	

	// temperatura de congelaci�n recomendada
	private int temperatura;
	
	//Constructor
	public ProductoCongelado(int numLote, LocalDate cad,int temperatura) {
			super(numLote, cad);
			this.temperatura = temperatura;
		}
	
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}


	@Override
	public String toString() {
		return "Productos Congelados, conservar a temperatura " + temperatura + "�C o m�s frio. Una vez descongelado, consumir dentro de los 7 d�as.";
	}
	
	
}
