package ejercicio2;

public class ProductosRefrigerados extends Producto {
	//c�digo del organismo de supervisi�n alimentaria
	
	private String codOrganismoDeSupervisionA;
	
	
	//Constructor
	public ProductosRefrigerados(String fecha, int num,String codOSA) {
			super(fecha, num);
			codOrganismoDeSupervisionA = codOSA;
		}
	
	
	public String getCodOrganismoDeSupervisionA() {
		return codOrganismoDeSupervisionA;
	}

	public void setCodOrganismoDeSupervisionA(String codOrganismoDeSupervisionA) {
		this.codOrganismoDeSupervisionA = codOrganismoDeSupervisionA;
	}
	
	
	
}
