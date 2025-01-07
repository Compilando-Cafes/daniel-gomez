package t1_conceptos_basicos.teoria.operadores;
/**
 * Demostracion del operador condicional A. Garcia-Beltran - Abril, 2006
 */
public class opCondicional {
	public static void main(String[] args) {
		int i, j, k;
		i = 1;
		j = 2;
		k = i > j ? 2 * i : 3 * j + 1;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		i = 2;
		j = 1;
		k = i > j ? 2 * i : 3 * j + 1;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		
		String cad1="Hola";
		String cad2="Adios";		
		String cad3=cad1 + cad2;
		
		System.out.println("Cad3:" + cad3);
		
		
		
		
		
	}
}