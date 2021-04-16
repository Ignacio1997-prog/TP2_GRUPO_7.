package ejercicio3;

public class Oficina extends Edificio {
	
	private String Nombre;
	private int CantOficinas;

	public Oficina(Double superficie, int cant) {
		super(superficie);
		CantOficinas = cant;
	}

	@Override
	public String toString() {
		return "Edificio " + Nombre + ", posee " + CantOficinas + " oficinas.";
	}
	
	

}
