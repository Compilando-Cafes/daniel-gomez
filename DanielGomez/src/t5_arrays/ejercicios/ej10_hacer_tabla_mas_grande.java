package t5_arrays.ejercicios;

public class ej10_hacer_tabla_mas_grande {

	public static void main(String[] args) {
		int longitud_inicial = 5;
		int longitud_final = 8;
		int tabla[] = {34,28,5,82,96};
		for (int i = 0; i<longitud_inicial; i++) {
			System.out.println("Tabla inicial: "+tabla[i]);
		}
		
		int tabla_final[] = new int [longitud_final];
		for(int i = 0; i< longitud_inicial;i++) {
			tabla_final[i] = tabla[i];
		}
		
		System.out.println();
		
		tabla_final[5]=15;
		tabla_final[6]=26;
		tabla_final[7]=61;
		
		for (int i = 0; i<longitud_final; i++) {
			System.out.println("Tabla final: "+tabla_final[i]);
		}

	}

}
