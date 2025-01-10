package t1_conceptos_basicos.ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		int dia = 5;
		String nombreDia = dia == 1 ? "lunes" : 
			dia == 2 ? "martes" : 
				dia == 3 ? "miércoles": 
					dia == 4 ? "jueves" :
						dia == 5 ? "viernes" :
							dia == 6 ? "sábado" :
								dia == 7 ? "domingo" : "incorrecto";
		
		int dia2 = 5;
		String resul = "incorrecto";
		resul = dia2 == 1 ? "lunes" : resul;
		resul = dia2 == 2 ? "martes" : resul;
		resul = dia2 == 3 ? "miercoles" : resul;
		resul = dia2 == 4 ? "jueves" : resul;
		resul = dia2 == 5 ? "viernes" : resul;
		resul = dia2 == 6 ? "sabado" : resul;
		resul = dia2 == 7 ? "domingo" : resul;
	
		System.out.println(nombreDia);
		System.out.println(resul);
	
	}
}
