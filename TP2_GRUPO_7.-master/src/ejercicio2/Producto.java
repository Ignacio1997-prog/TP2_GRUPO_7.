package ejercicio2;

import java.time.LocalDate;

public class Producto {
	
	private int NumLote;
	private LocalDate FechaCaducidad;
	
	//Constructor
	public Producto(int numLote,LocalDate date)
	{
		this.NumLote = numLote;
		this.FechaCaducidad = date;
	}

	public int getNumLote() {
		return NumLote;
	}

	public void setNumLote(int numLote) {
		NumLote = numLote;
	}

	public LocalDate getFechaCaducidad() {
		return FechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FechaCaducidad == null) ? 0 : FechaCaducidad.hashCode());
		result = prime * result + NumLote;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (FechaCaducidad == null) {
			if (other.FechaCaducidad != null)
				return false;
		} else if (!FechaCaducidad.equals(other.FechaCaducidad))
			return false;
		if (NumLote != other.NumLote)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lote nº: " + NumLote + ", vencimiento: " + FechaCaducidad + ". ";
	}
	
	
	
	
	
}
