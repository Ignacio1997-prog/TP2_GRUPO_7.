package ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static final int firstId = 1000;
	private static int contId = 0;
	
	//Constructores
	
	public Empleado() {
		contId++;
		id = firstId + contId;
		nombre = "sin nombre";
		edad = 99;
		
	}
	
	public Empleado(String nombre, int edad) {
		contId++;
		id = firstId + contId;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
	

	//Metodo
	public static void devuelveProximoID()
	{
		int idsiguiente = firstId + contId+1;
		System.out.println("El próximo ID será el " + idsiguiente);
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Id:" + id + ", nombre:" + nombre + ", edad:" + edad;
	}
	
	
	
	
	
}
