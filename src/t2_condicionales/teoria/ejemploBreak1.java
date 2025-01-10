package t2_condicionales.teoria;

public class ejemploBreak1 {

	public static void main(String[] args) {
		int a = 10;
		switch (a-2) {
		case 1:
			System.out.println("Hola");
			break;
		case 5:
			System.out.println("Me");
			break;
		case 8:
			System.out.println("Alegro");
			
		case 9:
			System.out.println("De");
			break;
		case 11:
			System.out.println("Conocerte. ");
			break;
		default:
			System.out.println("Sin coincidencia");
		}
	}
}
