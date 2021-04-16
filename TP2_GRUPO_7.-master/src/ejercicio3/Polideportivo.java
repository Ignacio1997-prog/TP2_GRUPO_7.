package ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva{
	
	IInstalacionDeportiva Tipo;

	public Polideportivo(double superficie, int tipoInstalacion) {
		super(superficie);
		Tipo = new InstalacionDeportiva(tipoInstalacion);
	}

	public IInstalacionDeportiva getTipo() {
		return Tipo;
	}

	public void setTipo(IInstalacionDeportiva tipo) {
		Tipo = tipo;
	}
	
	

}
