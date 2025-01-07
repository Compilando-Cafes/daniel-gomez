package t2_condicionales.teoria.condicionalesActivResueltasLibro;

import java.util.Scanner;

/* Vamos a introducir por teclado un número (entero). Para distinguir si es par o 
 * impar comprobamos el resto de dividir por 2. */
public class Resuelta2_01 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num; //número introducido por el usuario

      System.out.print("Introduzca un número: ");
      num = sc.nextInt();

      if (num % 2 == 0) { //si num es par
         System.out.println("Es par");
      } else { // es impar
         System.out.println("Es impar");
      }
   }
}


