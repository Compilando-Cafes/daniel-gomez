import java.util.*;

// 🎉 CLASES GENÉRICAS
// Una clase genérica es como un "molde" que puede funcionar con diferentes tipos de datos.

class Par<T, U> {
    private T primero;
    private U segundo;

    // Constructor que acepta dos elementos de tipo T y U
    public Par(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // Métodos para obtener los elementos
    public T getPrimero() {
        return primero;
    }

    public U getSegundo() {
        return segundo;
    }
}

// 🎉 CLASES GENÉRICAS CON MÚLTIPLES TIPOS
class DoblePar<T, U> {
    private T primero;
    private U segundo;

    public DoblePar(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public U getSegundo() {
        return segundo;
    }
}

public class GuiaTiposGenericos {

    public static void main(String[] args) {
        // ========================
        // TIPOS PARAMETRIZADOS (GENÉRICOS)
        // ========================
        // Los tipos genéricos permiten crear colecciones y métodos que pueden funcionar con diferentes tipos de datos.
        // ¡Son como superpoderes para las colecciones!

        // Ejemplo 1️⃣: Lista de Strings (palabras)
        List<String> listaString = new ArrayList<>();
        listaString.add("Hola");
        listaString.add("Mundo");
        // listaString.add(1); // 🚨 Esto da error porque la lista solo acepta Strings

        // Ejemplo 2️⃣: Lista de Números (enteros)
        List<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(1);
        listaInteger.add(2);
        // listaInteger.add("Hola"); // 🚨 Esto da error porque la lista solo acepta Integers

        // ========================
        // CÓMO FUNCIONAN LOS TIPOS GENÉRICOS
        // ========================
        // Usamos <T> para definir un tipo genérico.
        // T puede ser cualquier tipo, como String, Integer, o cualquier otro tipo que queramos.
        // ¡Con los genéricos puedes ser flexible y mantener la seguridad de tipos!

        // Ejemplo de cómo usar un método genérico:
        // Vamos a imprimir diferentes tipos de listas usando un mismo método genérico 👇
        imprimirLista(listaString); // Lista de Strings (¡palabras!)
        imprimirLista(listaInteger); // Lista de Integer (¡números!)

        // Método genérico para imprimir cualquier tipo de lista
    }

    // 🧩 MÉTODO GENÉRICO: Imprime cualquier lista (de cualquier tipo)
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento); // Imprime cada elemento
        }
    }

    // 🧩 MÉTODO GENÉRICO: Crea una nueva instancia de un objeto usando el tipo genérico
    public static <T> void crearInstancia(Class<T> tipo) {
        try {
            T obj = tipo.getDeclaredConstructor().newInstance();
            System.out.println(obj.getClass().getName() + " ha sido creado."); // ¡Acabamos de crear un objeto de tipo T!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}