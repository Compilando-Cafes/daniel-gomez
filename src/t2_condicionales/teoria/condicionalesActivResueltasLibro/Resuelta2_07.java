package t2_condicionales.teoria.condicionalesActivResueltasLibro;

import java.util.Scanner;

public class Resuelta2_07 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b, c;

      System.out.print("Introduzca primer número: ");
      a = sc.nextInt();
      System.out.print("Introduzca segundo número: ");
      b = sc.nextInt();
      System.out.print("Introduzca tercer número: ");
      c = sc.nextInt();

      if (a > b && b > c) {
         System.out.println(a + ", " + b + ", " + c);
      } else if (a > c && c > b) {
         System.out.println(a + ", " + c + ", " + b);
      } else if (b > a && a > c) {
         System.out.println(b + ", " + a + ", " + c);
      } else if (b > c && c > a) {
         System.out.println(b + ", " + c + ", " + a);
      } else if (c > a && a > b) {
         System.out.println(c + ", " + a + ", " + b);
      } else if (c > b && b > a) {
         System.out.println(c + ", " + b + ", " + a);
      }
      sc.close();
   }
}