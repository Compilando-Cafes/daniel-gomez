package t5_arrays.ejercicios_libro;

import java.util.Arrays;

public class A5_17_Suma_Elementos {
    public static void main(String[] args) {
        int[] t = {10, 1, 5, 8, 9, 2};
        System.out.println(Arrays.toString(suma(t, 3)));
    }
    public static int[] suma(int[] t, int numElementos){
        int[] tabla = new int[t.length-2];
        for (int i = 0; i<t.length-2; i++) {
            int sumaElementos = 0;
            for (int j = i; j < numElementos+i; j++) {
                sumaElementos+= t[j];
            }
            tabla[i] = sumaElementos;
        }
        return tabla;
    }
}