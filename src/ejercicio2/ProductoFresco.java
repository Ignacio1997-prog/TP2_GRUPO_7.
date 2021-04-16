package ejercicio2;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
	//la fecha de envasado y el país de origen
	
	private LocalDate fechaEnv;
	private String paisDeOrigen;
	
	//Constructor
	public ProductoFresco(int numLote, LocalDate date,LocalDate date2,String paisDeOrigen) {
		super(numLote, date);
		this.paisDeOrigen = paisDeOrigen;
		this.fechaEnv = date2;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	public LocalDate getFechaEnv() {
		return fechaEnv;
	}

	public void setFechaEnv(LocalDate fechaEnv) {
		this.fechaEnv = fechaEnv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fechaEnv == null) ? 0 : fechaEnv.hashCode());
		result = prime * result + ((paisDeOrigen == null) ? 0 : paisDeOrigen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoFresco other = (ProductoFresco) obj;
		if (fechaEnv == null) {
			if (other.fechaEnv != null)
				return false;
		} else if (!fechaEnv.equals(other.fechaEnv))
			return false;
		if (paisDeOrigen == null) {
			if (other.paisDeOrigen != null)
				return false;
		} else if (!paisDeOrigen.equals(other.paisDeOrigen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Producto fresco envasado el " + fechaEnv + ", origen: " + paisDeOrigen + ".";
	}
	
		
	
	
}
