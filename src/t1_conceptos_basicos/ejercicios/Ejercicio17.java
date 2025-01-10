package t1_conceptos_basicos.ejercicios;

public class Ejercicio17 {

	public static void main(String[] args) {
		// 17) Expresión que indica si una hora es válida o no. La hora viene dada en HH:MM:SS
		int horas = 2, minutos = 40, segundos = 4;
		
		String horaValida = (horas >= 0 && horas < 24)
				&& (minutos >= 0 && minutos < 60)
				&& (segundos >= 0 && segundos < 60)
				? "Hora válida" : "Hora no válida";
		System.out.println(horaValida);
		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);

	}

}
