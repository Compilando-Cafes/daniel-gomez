package t12_colecciones.clase_4_interfaz_map.ejercicio2_zoo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Habitat> zoo = new TreeMap<>();
        Habitat habitat1 = new Habitat("Ártico",
                new TreeSet<>(Set.of("Pingüino", "Oso polar")),
                "Mucho frío",
                2.5,
                Habitat.Recinto.ABIERTO);
        Habitat habitat2 = new Habitat("Selva",
                new TreeSet<>(Set.of("Mono", "Orangután")),
                "Lleno de árboles",
                5.2,
                Habitat.Recinto.ABIERTO);
        Habitat habitat3 = new Habitat("Sabana",
                new TreeSet<>(Set.of("Tigre", "León", "Jirafa")),
                "Peligroso",
                8.2,
                Habitat.Recinto.ABIERTO);
        Habitat habitat4 = new Habitat("Desierto",
                new TreeSet<>(Set.of("Zorro", "Escorpión")),
                "Mucho calor",
                20.9,
                Habitat.Recinto.ABIERTO);
        Habitat habitat5 = new Habitat("DAM Brianda de Mendoza",
                new TreeSet<>(Set.of("Alumnos", "Profesores")),
                "Un poco viejo... pero resiste",
                0.5,
                Habitat.Recinto.CERRADO);

        zoo.put(1, habitat1);
        zoo.put(2, habitat2);
        zoo.put(3, habitat3);
        zoo.put(4, habitat4);
        zoo.put(5, habitat5);

        System.out.println(zoo);
    }
}