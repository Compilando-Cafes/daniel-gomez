package t10_colecciones.ejs_libro.aa12_26_reparto_alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> alumnos = List.of("Ana", "Luis", "Marta", "Pedro", "Sofía");
        List<List<String>> grupos = repartoAlumnos(alumnos, 2);

        // Mostrar resultados
        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("Grupo " + (i + 1) + ": " + grupos.get(i));
        }
    }

    public static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
        List<List<String>> grupos = new ArrayList<>();
        List<String> listaAleatoria = new ArrayList<>(lista);

        // Mezclar la lista de alumnos
        Collections.shuffle(listaAleatoria);

        // Inicializar los grupos vacíos
        for (int i = 0; i < numGrupos; i++) {
            grupos.add(new ArrayList<>());
        }

        // Distribuir alumnos
        for (int i = 0; i < listaAleatoria.size(); i++) {
            int grupoDestino = i % numGrupos; // Asigna a un grupo de forma rotativa
            grupos.get(grupoDestino).add(listaAleatoria.get(i));
        }

        return grupos;
    }
}
