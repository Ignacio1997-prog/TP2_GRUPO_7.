package ejercicio2;

public class Producto {
	
	private String fechaDeCaducidad;
	private int numeroDeLote;
	
	//Constructor
	public Producto(String fecha,int num)
	{
		fechaDeCaducidad = fecha;
		numeroDeLote = num;
	}
	
	public String getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}
	public void setFechaDeCaducidad(String fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}
	public int getNumeroDeLote() {
		return numeroDeLote;
	}
	public void setNumeroDeLote(int numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}
	
	
	
}
