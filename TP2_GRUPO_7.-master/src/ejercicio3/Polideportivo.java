package ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva{
	
	private String Nombre;
	private int TipoDeInstalacion;

	public Polideportivo(double superficie, String nombre, int tipoInstalacion) {
		super(superficie);
		Nombre = nombre;
		TipoDeInstalacion = tipoInstalacion;
	}

	public String getNombre() {
		return Nombre;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo " + Nombre + ", Tipo de Instalacion Nº " + TipoDeInstalacion + ".";
	}
	
	
	

}
