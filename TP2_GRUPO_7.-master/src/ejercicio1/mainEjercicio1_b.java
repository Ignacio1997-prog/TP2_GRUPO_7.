package ejercicio1;

import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		Profesor p1 = new Profesor("Dolina",25,"Prof. Matematica",20);
		Profesor p2 = new Profesor();
		Profesor p3 = new Profesor("Gilespi",34,"Drirectora",8);
		Profesor p4 = new Profesor("Schultz",43,"Preceptora",11); 
		Profesor p5 = new Profesor("Barton",92,"Prof. Historia, la vivió",16);
		
		
		TreeSet<Profesor> listaProfes = new TreeSet<Profesor>();
		
		listaProfes.add(p1);
		listaProfes.add(p2);
		listaProfes.add(p3);
		listaProfes.add(p4);
		listaProfes.add(p5);
		
		for(Profesor p : listaProfes) {
			System.out.println(p);
		}
		
		
		Profesor profeA = new Profesor(1001,"Guido",25,"Prof. Matematica",20);
		Profesor profeB = new Profesor(1001,"Guido",25,"Prof. Matematica",20);
		if(profeA.equals(profeB)) {
			System.out.println("Es el mismo profesor.");
		}else System.out.println("No son la misma profesor.");

		HashCode<Profesor> listP = new HashCode<Profesor>();
		
	}

}
