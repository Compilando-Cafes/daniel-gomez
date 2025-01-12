package t5_arrays.ejercicios_libro;

public class A5_20_Algoritmo_De_Fusion {
    public static void main(String[] args) {
        int[] tabla1 = {1, 3, 5, 7, 9};
        int[] tabla2 = {2, 4, 6, 8, 10};
        int[] tablaFusion = fusion(tabla1, tabla2);
        for (int i = 0; i < tablaFusion.length; i++) {
            System.out.print(tablaFusion[i] + " ");
        }
    }
    // Crea una función que realice el algoritmo de fusión de dos tablas de enteros ordenadas de menor a mayor
    public static int[] fusion(int[] tabla1, int[] tabla2){
        int[] tablaFusion = new int[tabla1.length + tabla2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < tabla1.length && j < tabla2.length){
            if (tabla1[i] < tabla2[j]){
                tablaFusion[k] = tabla1[i];
                i++;
            } else {
                tablaFusion[k] = tabla2[j];
                j++;
            }
            k++;
        }
        while (i < tabla1.length){
            tablaFusion[k] = tabla1[i];
            i++;
            k++;
        }
        while (j < tabla2.length){
            tablaFusion[k] = tabla2[j];
            j++;
            k++;
        }
        return tablaFusion;
    }
}