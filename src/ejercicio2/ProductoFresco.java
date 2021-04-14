package ejercicio2;

public class ProductoFresco extends Producto {
	//la fecha de envasado y el país de origen
	
	private String fechaDeEnvasado;
	private String paisDeOrigen;
	
	//Constructor
	public ProductoFresco(String fecha, int num,String fechaDeEnvasado,String paisDeOrigen) {
		super(fecha, num);
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.paisDeOrigen = paisDeOrigen;
	}
	
	
	public String getFechaDeEnvasado() {
		return fechaDeEnvasado;
	}
	public void setFechaDeEnvasado(String fechaDeEnvasado) {
		this.fechaDeEnvasado = fechaDeEnvasado;
	}
	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}
	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}
	
	
	
}
