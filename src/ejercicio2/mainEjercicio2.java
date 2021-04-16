package ejercicio2;

import java.time.LocalDate;

public class mainEjercicio2 {

	public static void main(String[] args)  {
		
		LocalDate fecha1 = LocalDate.of(2021,4,6);
		LocalDate fecha2 = LocalDate.of(2021,8,18);
		ProductoFresco pFresco = new ProductoFresco(300, fecha1, fecha2, "China");
		System.out.println(pFresco);
		
		ProductoCongelado pCong = new ProductoCongelado(151, LocalDate.of(2021,2,4), -35);
		System.out.println(pCong);
		
		LocalDate fecha3 = LocalDate.of(2021,3,20);
		ProductoRefrigerado pRef = new ProductoRefrigerado(2780, fecha3, "AB4K640PD99");  
		System.out.println(pRef);
	}

}
