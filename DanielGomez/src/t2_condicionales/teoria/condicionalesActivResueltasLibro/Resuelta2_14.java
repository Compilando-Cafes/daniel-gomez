package t2_condicionales.teoria.condicionalesActivResueltasLibro;

import java.util.Scanner;

public class Resuelta2_14 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int diasDelMes = 0; 

      System.out.print("Introduzca dia: ");
      int dia = sc.nextInt();
      System.out.print("Introduzca mes: ");
      int mes = sc.nextInt();
      System.out.print("Introduzca a�o: ");
      int anyo = sc.nextInt();

      diasDelMes = switch(mes) {
          case 2 -> 28; 
          case 4, 6, 9, 11 -> 30;
          default -> 31; 
      };

      dia ++; 

      if (dia > diasDelMes) { 
         dia = 1; 
         mes++; 

         if (mes > 12) { 
            mes = 1; 
            anyo++; 
         }
      }
      if (anyo == 0) {
    	  anyo = 1;
      }
      
      System.out.println(dia + "/" + mes + "/" + anyo);
   }
}