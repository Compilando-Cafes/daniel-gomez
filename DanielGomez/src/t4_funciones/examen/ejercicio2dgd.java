package t4_funciones.examen;

public class ejercicio2dgd {

    public static void main(String[] args) {

        System.out.println("Daniel Gómez Delgado");
        dividirNumero(1234567);
        dividirNumero(132);
        dividirNumero(123456);
        dividirNumero(10020);
        dividirNumero(22334556);
        dividirNumero(12);
        dividirNumero(2);
        dividirNumero(154);
        dividirNumero(-1020);
    }

    private static void dividirNumero(long numero) {

        int cifras = contarCifras(numero);

        if (numero < 0) {
            numero = -numero;
        }

        int mitad1 = cifras / 2;
        int denominador = (int) Math.pow(10, mitad1);

        System.out.println("\nNúmero: " + numero);

        if (numero < 10) {
            System.out.println(numero > 0 ? "Sí es Harshad" : "No es Harshad");
            return;
        }

        long parte1 = numero / denominador;
        long parte2 = numero % denominador;

        int suma1 = sumarCifras(parte1);
        int suma2 = sumarCifras(parte2);

        if (numero % (suma1 + suma2) == 0) {
            System.out.println("Sí es Harshad");
        } else {
            System.out.println("No es Harshad");
        }
    }

    private static int sumarCifras(long n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    private static int contarCifras(long n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}

