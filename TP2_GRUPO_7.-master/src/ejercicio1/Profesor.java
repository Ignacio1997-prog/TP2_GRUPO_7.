package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {
	
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor()
	{
		super();
		cargo = "Sin cargo";
		antiguedadDocente=0;
	}
	
	public Profesor(String nombre,int edad, String cargo,int antiguedad)
	{
		super(nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente=antiguedad;
	}
	
	public Profesor(int id, String nombre,int edad, String cargo,int antiguedad)
	{
		super(id,nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente=antiguedad;
	}
	
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	
	@Override
	public String toString() {
		return "Profesor: "+super.toString()+", cargo: " + cargo + ", antiguedadDocente:" + antiguedadDocente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
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
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Profesor p) {
		if (p.getId() == this.getId()) {
			return 0;
		}
		if (p.getId() > this.getId()) {
			return -1;
		}
		return 1;
		
	}
	
	
	
	

}
