package ejercicio2;

public class ProductosCongelados extends Producto{
	

	// temperatura de congelación recomendada
	private int temperatura;
	
	//Constructor
	public ProductosCongelados(String fecha, int num,int temperatura) {
			super(fecha, num);
			this.temperatura = temperatura;
		}
	
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	
}
