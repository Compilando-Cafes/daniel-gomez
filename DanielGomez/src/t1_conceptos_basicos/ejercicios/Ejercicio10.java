package t1_conceptos_basicos.ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int categoria = 0;
		String resultado = (categoria == 0) ? "EMPLEADO" :
			(categoria == 1) ? "ENCARGADO" :
				(categoria == 2) ? "DIRECTIVO" :
					(categoria == 3) ? "TÉCNICO" : "CATEGORÍA ERRÓNEA";
		
		System.out.println(resultado);
		
		int categoria2 = 0;
		String resultado2 = "CATEGORÍA ERRONEA";
		resultado2 = (categoria == 0) ? "EMPLEADO" : resultado2;
		resultado2 = (categoria == 1) ? "ENCARGADO" : resultado2;
		resultado2 = (categoria == 2) ? "DIRECTIVO" : resultado2;
		resultado2 = (categoria == 3) ? "TÉCNICO" : resultado2;
		
		System.out.println(resultado2);

	}

}
