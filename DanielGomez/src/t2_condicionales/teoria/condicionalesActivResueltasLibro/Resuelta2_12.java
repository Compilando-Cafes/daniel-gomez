package t2_condicionales.teoria.condicionalesActivResueltasLibro;

import java.util.Scanner;

public class Resuelta2_12 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int dia, mes, anyo;
      boolean fechaCorrecta; 
      System.out.print("Introduzca dia: ");
      dia = sc.nextInt();
      System.out.print("Introduzca mes: ");
      mes = sc.nextInt();
      System.out.print("Introduzca a�o: ");
      anyo = sc.nextInt();

      //fechaCorrecta = fechaCorrecta(dia, mes, anyo);
      
      fechaCorrecta = fedhaCorrecfta2(dia, mes, anyo);
      
      
      
      
      
      if (fechaCorrecta) {
         System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anyo);
      } else {
         System.out.println("Fecha incorrecta");
      }
   }

private static boolean fedhaCorrecfta2(int dia, int mes, int anyo) {
	boolean fechaCorrecta;
	if (anyo == 0) { 
          fechaCorrecta = false;
       } else {
          if (mes == 2 && (1 <= dia && dia <= 28)) {
             fechaCorrecta = true;
          } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)
                  && (1 <= dia && dia <= 30)) {
             fechaCorrecta = true;

          } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                  || mes == 10 || mes == 12)
                  && (1 <= dia && dia <= 31)) {
             fechaCorrecta = true;
          } else { 
             fechaCorrecta = false;
          }

       }
	return fechaCorrecta;
}

private static boolean fechaCorrecta(int dia, int mes, int anyo) {
	boolean fechaCorrecta;
	fechaCorrecta = fedhaCorrecfta2(dia, mes, anyo);
	return fechaCorrecta;
}
}