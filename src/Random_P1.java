import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Random_P1 {
    static Random r = new Random();

    //version numerosAleatorios que rellene el array pasado por parametro
    public static int[] obtenerNumerosAleatoriosNoRepetidos(int[] valores, int minimo, int maximo) {
        Random r = new Random();
        IntStream is = r.ints(valores.length,minimo,maximo); //devuelve una secuencia de cantidad de numeros entre minimo y maximo
        valores = is.toArray(); //convierte a un int[]
        int [] ordenado;
        //dos bucles anidados que recorren el array creado
        for(int i = 0; i < valores.length;i++) {
            for(int j = i+1; j < valores.length;j++) {
                //si encuentro valores repetidos
                if(valores[i] == valores[j]) {
                    //ordeno el array copiandolo para no modificar el original
                    ordenado = Arrays.copyOf(valores, valores.length);
                    Arrays.sort(ordenado);
                    boolean correcto = false;
                    int nuevo = 0;
                    //pregunto por un nuevo aleatorio mientras que el valor devuelto siga apareciendo en el array
                    while(!correcto) {
                        nuevo = r.nextInt(maximo);
                        if(Arrays.binarySearch(ordenado, nuevo)<0) {
                            correcto = true;
                        }
                    }
                    //cuando he conseguido un numero nuevo, sustituyo en el array
                    valores[j] = nuevo;
                }
            }
        }
        return valores;
    }

    public static int[] obtenerNumerosAleatoriosNoRepetidos(int cantidad, int minimo, int maximo) {
        int[] valores = null;
        IntStream is = r.ints(cantidad,minimo,maximo); //devuelve una secuencia de cantidad de numeros entre minimo y maximo
        valores = is.toArray(); //convierte a un int[]
        int [] ordenado;
        //dos bucles anidados que recorren el array creado
        for(int i = 0; i < valores.length;i++) {
            for(int j = i+1; j < valores.length;j++) {
                //si encuentro valores repetidos
                if(valores[i] == valores[j]) {
                    //ordeno el array copiandolo para no modificar el original
                    ordenado = Arrays.copyOf(valores, valores.length);
                    Arrays.sort(ordenado);
                    boolean correcto = false;
                    int nuevo = 0;
                    //pregunto por un nuevo aleatorio mientras que el valor devuelto siga apareciendo en el array
                    while(!correcto) {
                        nuevo = r.nextInt(maximo);
                        if(Arrays.binarySearch(ordenado, nuevo)<0) {
                            correcto = true;
                        }
                    }
                    //cuando he conseguido un numero nuevo, sustituyo en el array
                    valores[j] = nuevo;
                }
            }
        }
        return valores;
    }

    public static int[] obtenerNumerosAleatoriosRepetidos(int cantidad, int minimo, int maximo) {
        int[] valores = null;
        IntStream is = r.ints(cantidad,minimo,maximo); //devuelve una secuencia de cantidad de numeros entre minimo y maximo
        valores = is.toArray(); //convierte a un int[]
        return valores;
    }

    public static int[] obtenerNumerosAleatoriosRepetidos(int[] valores, int minimo, int maximo) {
        IntStream is = r.ints(valores.length,minimo,maximo); //devuelve una secuencia de cantidad de numeros entre minimo y maximo
        valores = is.toArray(); //convierte a un int[]
        return valores;
    }

    public static int obtenerUnNumero(int minimo, int maximo) {
        int num = 0;
        num = r.nextInt(maximo-minimo)+minimo;
        return  num;
    }

    public static boolean obtenerUnBooleano() {
        boolean num;
        num = r.nextBoolean();
        return  num;
    }

    public static int obtenerUnNumeroQueNoSea(int noRepetir, int minimo, int maximo) {
        int num = 0;
        boolean correcto = false;
        while(!correcto) {
            num = r.nextInt(maximo-minimo)+minimo;
            if(num != noRepetir) correcto = true;
        }

        return  num;
    }
}