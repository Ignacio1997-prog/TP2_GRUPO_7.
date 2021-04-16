package ejercicio2;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
	//código del organismo de supervisión alimentaria

	private String codOrganismoDeSupervisionA;
	
	
	//Constructor
	public ProductoRefrigerado(int numLote, LocalDate cad, String codOSA) {
			super(numLote, cad);
			codOrganismoDeSupervisionA = codOSA;
		}
	
	
	public String getCodOrganismoDeSupervisionA() {
		return codOrganismoDeSupervisionA;
	}

	public void setCodOrganismoDeSupervisionA(String codOrganismoDeSupervisionA) {
		this.codOrganismoDeSupervisionA = codOrganismoDeSupervisionA;
	}

	
	@Override
	public String toString() {
		return "Producto Refrigerads evaluado por Organismo supervisor cod. #" + codOrganismoDeSupervisionA + ".";
	}
	
	
}
