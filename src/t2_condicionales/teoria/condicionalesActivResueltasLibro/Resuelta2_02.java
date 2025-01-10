package t2_condicionales.teoria.condicionalesActivResueltasLibro;

import java.util.Scanner;

public class Resuelta2_02 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un numero: ");
      int n1 = sc.nextInt(); //primer número
      System.out.print("Introduzca otro numero: ");
      int n2 = sc.nextInt();

      if (n1 == n2) { //si n1 esigual que n2
         System.out.println("Ambos numeros son iguales");
      } else {
         System.out.println("Lo numeros son distintos");
      }
      sc.close();
   }
}