package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;


public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor p1 = new Profesor("Carlos",51,"Prof. Matematica",20);
		Profesor p2 = new Profesor();
		Profesor p3 = new Profesor("Ana",34,"Drirectora",8);
		Profesor p4 = new Profesor("Maria",47,"Preceptora",11); 
		Profesor p5 = new Profesor("Horacio",41,"Prof. Historia",16);
		
		ArrayList<Profesor> listaProfesorxs = new ArrayList<Profesor>();
		
		listaProfesorxs.add(p1);
		listaProfesorxs.add(p2);
		listaProfesorxs.add(p3);
		listaProfesorxs.add(p4);
		listaProfesorxs.add(p5);
		
		ListIterator<Profesor> it = listaProfesorxs.listIterator();
		while (it.hasNext()) {
			Profesor profesor = it.next();
			System.out.println(profesor.toString());
		}
		

	}

}
