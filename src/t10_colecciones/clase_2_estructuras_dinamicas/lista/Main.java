package t10_colecciones.clase_2_estructuras_dinamicas.lista;

import t9_interfaces.interfaz3_comparable_comparator.ej2_alumnos.Alumno;

import java.time.LocalDate;
import java.util.Arrays;

import static t10_colecciones.clase_2_estructuras_dinamicas.lista.Lista.fusionTablas;

public class Main {
    public static void main(String[] args) {
        Lista<Double> lista1 = new Lista<>();
        Lista<String> lista2 = new Lista<>();
        Lista<Alumno> lista3 = new Lista<>();

        lista1.addLista(new Double[]{2.4, 3.3});
        lista1.insertFirst(3.2);
        lista1.deleteIn(1);
        lista1.insertIn(2, 1.3);
        lista1.insertLast(5.6);
        System.out.println(lista1.get(2));
        System.out.println(lista1.search(3.2));
        System.out.println(lista1.longitud());
        System.out.println(lista1);

        lista2.addLista(new String[]{"Hola", "Adios"});
        lista2.insertFirst("Hola");
        lista2.deleteIn(1);
        lista2.insertIn(2, "Adios");
        lista2.insertLast("Hola");
        System.out.println(lista2.get(2));
        System.out.println(lista2.search("Hola"));
        System.out.println(lista2.longitud());
        System.out.println(lista2);

        lista3.addLista(new Alumno[]{new Alumno("Juan", "Pérez", LocalDate.of(2000, 2, 3), 20, 8.5, 5)});
        lista3.insertFirst(new Alumno("Ana", "García", LocalDate.of(1997, 3, 4), 22, 9.0, 6));
        lista3.deleteIn(1);
        lista3.insertIn(0, new Alumno("Luis", "Martínez", LocalDate.of(1980, 3, 5), 21, 7.5, 4));
        lista3.insertLast(new Alumno("María", "López", LocalDate.of(1970, 2, 2), 23, 8.0, 5));
        System.out.println(lista3.get(2));
        System.out.println(lista3.search(new Alumno("Luis", "Martínez", LocalDate.of(1980, 3, 5), 21, 7.5, 4)));
        System.out.println(lista3.longitud());
        System.out.println(lista3);

        Double[] numeros = {1.1, 2.2, 3.3};
        Double[] otrosNumeros = {4.4, 5.5};

        String[] palabras1 = {"Hola", "mundo"};
        String[] palabras2 = {"desde", "Java"};

        Double[] fusionNumeros = fusionTablas(numeros, otrosNumeros);
        String[] fusionPalabras = fusionTablas(palabras1, palabras2);

        System.out.println(Arrays.toString(fusionNumeros));
        System.out.println(Arrays.toString(fusionPalabras));
    }

}