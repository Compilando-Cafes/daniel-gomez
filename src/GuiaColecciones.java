import java.util.*;

public class GuiaColecciones {

    public static void main(String[] args) {
        // ========================
        // MÉTODOS DE COLLECTION
        // ========================
        Collection<String> lista = new ArrayList<>();
        // ➕ boolean add(E e)
        lista.add("Hola"); // añade "Hola" a la lista
        // ➖ boolean remove(Object o)
        lista.remove("Hola"); // elimina "Hola" si está
        // ❓ boolean contains(Object o)
        // Necesita equals. Tener un constructor con un parámetro, por ejemplo, el DNI
        lista.contains("Hola"); // true si "Hola" está
        // 🈳 boolean isEmpty()
        lista.isEmpty(); // true si no hay elementos
        // 🔢 int size()
        lista.size(); // número de elementos
        // 🧹 void clear()
        lista.clear(); // elimina todos los elementos
        // 🔁 Iterator<E> iterator()
        Iterator<String> it = lista.iterator();
        // ℹ️ ¿FOR-EACH O ITERATOR?
        // ✅ Usa for-each si solo quieres leer la colección:
        for (String s : lista) {
            System.out.println(s); // más limpio y directo
        }
        // ✅ Usa Iterator si quieres eliminar elementos mientras recorres:
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("Hola")) {
                it.remove(); // solo aquí puedes eliminar sin error
            }
        }

        // ========================
        // MÉTODOS DE ITERATOR
        // ========================
        // ⏭️ boolean hasNext()
        it.hasNext(); // true si hay más elementos
        // ⬇️ E next()
        it.next(); // siguiente elemento
        // 🧽 void remove()
        it.remove(); // elimina el último elemento devuelto por next()

        // ========================
        // IMPLEMENTACIONES DE LIST
        // ========================
        // 📋 ArrayList: lista basada en array. Acceso rápido por índice, lenta para insertar en medio.
        List<String> arrayList = new ArrayList<>();
        // 📋 LinkedList: lista enlazada. Rápida para insertar/eliminar, lenta para acceder por índice.
        List<String> linkedList = new LinkedList<>();

        // ========================
        // MÉTODOS DE LIST
        // ========================
        List<Integer> listaList = new ArrayList<>(List.of(1, 1, 3, 2));
        // 📍 E get(int index)
        listaList.get(0); // devuelve 1
        // ♻️ E set(int index, E element)
        listaList.set(1, 2); // reemplaza lo que hay en la posición 1 por un 2
        // ➕ void add(int index, E element)
        listaList.add(1, 7); // inserta en posición 1 un 7 y mueve todo lo demás
        // 🔎 int indexOf(Object o)
        listaList.indexOf(3); // posición de 3. Si no lo encuentra devuelve -1.
        // 🔍 int lastIndexOf(Object o)
        listaList.lastIndexOf(1); // última posición de 1
        // ❌ E remove(int index)
        listaList.remove(2); // elimina lo que haya en la posición 2
        listaList.remove(Integer.valueOf(3)); // se cambia al remove de Collection y elimina el 3 donde esté

        // ========================
        // IMPLEMENTACIONES DE SET
        // ========================
        // 🧺 HashSet: no ordenado, no permite duplicados, rápido
        Set<String> hashSet = new HashSet<>();
        // 📏 LinkedHashSet: mantiene orden de inserción, no duplicados
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // 🔢 TreeSet: ordenado de forma natural (o con Comparator), no duplicados
        Set<String> treeSet = new TreeSet<>();

        // ========================
        // MÉTODOS DE SET
        // ========================
        Set<String> conjunto = new HashSet<>(Set.of("A", "B", "C"));
        // No permite duplicados
        // Tiene todos los métodos de Collection.
        // No tiene métodos propios.

        // ========================
        // CONVERSIONES ENTRE COLECCIONES
        // ========================
        // 🔄 List a Set (elimina duplicados)
        List<String> lista2 = List.of("A", "B", "A");
        Set<String> conjunto2 = new HashSet<>(lista2); // [A, B]
        // 🔄 Set a List (mantiene elementos únicos, pero puede perder el orden)
        Set<String> conjuntoOriginal = Set.of("A", "B", "C");
        List<String> listaDesdeSet = new ArrayList<>(conjuntoOriginal);
        // 🔄 List a LinkedList
        List<String> linkedList2 = new LinkedList<>(lista);
        // 🔄 Cualquier colección a TreeSet (se ordena automáticamente)
        Set<String> conjuntoOrdenado = new TreeSet<>(lista); // orden alfabético
        // 🔄 Array a List
        String[] array = {"X", "Y", "Z"};
        List<String> listaDesdeArray = Arrays.asList(array); // tamaño fijo
        // 🔄 List a Array
        String[] arrayDesdeLista = lista.toArray(new String[0]);


        // ========================
        // MÉTODOS DE COLLECTIONS
        // ========================
        List<Integer> numeros = new ArrayList<>(List.of(5, 3, 9, 1, 3));
        // 🔡 void sort(List<T> list)
        Collections.sort(numeros); // ordena con compareTo() (Implementarlo si es necesario)
        // o con un Comparator con lo que queramos
        Collections.sort(numeros, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        // 🔄 void reverse(List<?> list)
        Collections.reverse(numeros); // invierte
        // 🎲 void shuffle(List<?> list)
        Collections.shuffle(numeros); // mezcla
        // ⬆️ T max(Collection<? extends T> c)
        Collections.max(numeros); // mayor
        // ⬇️ T min(Collection<? extends T> c)
        Collections.min(numeros); // menor
        // 🔁 int frequency(Collection<?> c, Object o)
        Collections.frequency(numeros, 3); // cuántas veces está 3
        // 🔃 void swap(List<?> list, int i, int j)
        Collections.swap(numeros, 0, 1); // intercambia
        // 🔍 int binarySearch(List<? extends Comparable> list, key)
        // Busca con búsqueda binaria (¡debe estar ordenado!)
        Collections.sort(numeros); // obligatorio antes
        int posicion = Collections.binarySearch(numeros, 5); // devuelve el índice de 5
        // 🧩 void fill(List<? super T> list, T obj)
        // Rellena toda la lista con el mismo valor
        Collections.fill(numeros, 0); // todos los elementos pasan a ser 0
        // 🔁 void replaceAll(List<T> list, T oldVal, T newVal)
        // Reemplaza todas las ocurrencias de un valor por otro
        Collections.replaceAll(numeros, 0, 9); // cambia todos los 0 por 9
        // 🔒 Set<T> singleton(T o)
        // Devuelve un Set inmutable con un único elemento
        Set<String> soloUno = Collections.singleton("Único");
        // No se puede modificar (ni añadir ni eliminar), lanza excepción si lo intentas
        // Se usa para eliminar todas las veces que aparezca un valor.
        List<String> lista3 = new ArrayList<>(List.of("A", "B", "A", "C", "A"));
        // Eliminar todas las "A" de la lista sin usar bucle
        lista.removeAll(Collections.singleton("A"));
        System.out.println(lista3); // Imprime: [B, C]

        // ========================
        // MÉTODOS DE COLLECTION (extra)
        // ========================
        // 📦 Object[] toArray()
        // Convierte la colección a un array de Object
        Object[] array1 = lista.toArray();
        // 📦 <T> T[] toArray(T[] a)
        // Convierte la colección a un array del tipo indicado
        String[] array2 = lista.toArray(new String[0]);

        // ========================
        // MÉTODOS DE ARRAYS
        // ========================
        // 🔗 List<T> Arrays.asList(T... a)
        // Convierte un array en una lista fija (no se puede cambiar su tamaño)
        List<String> listaFija = Arrays.asList("Uno", "Dos", "Tres");
        // nota: no se puede hacer add/remove sobre listaFija, lanza excepción

        // ========================
        // IMPLEMENTACIONES DE MAP
        // ========================
        // 📘 HashMap: rápido, no ordena las claves
        Map<String, Integer> hashMap = new HashMap<>();
        // 🧾 LinkedHashMap: mantiene el orden de inserción
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // 📚 TreeMap: ordenado por clave (natural o con Comparator)
        Map<String, Integer> treeMap = new TreeMap<>();

        // ========================
        // VISTAS DE COLLECTION DE MAPAS
        // ========================
        // Un mapa tiene tres vistas principales:
        // 1. **keySet()**: Devuelve un conjunto de las claves del mapa.
        // 2. **values()**: Devuelve una colección con todos los valores del mapa.
        // 3. **entrySet()**: Devuelve un conjunto de las entradas (pares clave-valor) del mapa.

        // ========================
        // MÉTODOS DE MAP
        // ========================
        Map<String, Integer> mapa = new HashMap<>();
        // ➕ V put(K key, V value)
        mapa.put("A", 1); // añade
        // 📥 V get(Object key)
        mapa.get("A"); // devuelve 1
        // ➖ V replace(K key, V value)
        mapa.replace("A", 10); // reemplaza el valor asociado con la clave "A" por 10
        // ❓ boolean containsKey(Object key)
        mapa.containsKey("A"); // true
        // 🔍 boolean containsValue(Object value)
        mapa.containsValue(1); // true
        // ❌ V remove(Object key)
        mapa.remove("A"); // elimina clave
        // 🗝️ Set<K> keySet()
        mapa.keySet(); // claves
        // 📦 Collection<V> values()
        Collection<Integer> valores = mapa.values(); // devuelve todos los valores del mapa
        // 📄 Set<Map.Entry<K, V>> entrySet()
        // Devuelve un conjunto de entradas (pares clave-valor)
        // Muy útil cuando necesitas ver o modificar la clave y el valor a la vez
        Set<Map.Entry<String, Integer>> entradas = mapa.entrySet();
        // Iteración de las entradas
        for (Map.Entry<String, Integer> entry : entradas) {
            System.out.println(entry.getKey() + " = " + entry.getValue()); // Imprime "A = 1" y "B = 2"
        }

        List<Integer> numeros3 = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 6);

        // Conjunto de únicos (sin duplicados)
        Set<Integer> unicos = new HashSet<>(numeros3);
        System.out.println("Únicos (sin duplicados): " + unicos);

        // Repetidos (aparecen 2 o más veces)
        Set<Integer> repetidos = new HashSet<>();
        for (Integer n : unicos) {
            if (Collections.frequency(numeros3, n) > 1) {
                repetidos.add(n);
            }
        }
        System.out.println("Repetidos: " + repetidos);

        // No repetidos (solo aparecen una vez)
        Set<Integer> noRepetidos = new HashSet<>();
        for (Integer n : unicos) {
            if (Collections.frequency(numeros3, n) == 1) {
                noRepetidos.add(n);
            }
        }
        System.out.println("No repetidos: " + noRepetidos);

        // Contar cuántos elementos están repetidos (solo contar elementos con frecuencia > 1)
        int cantidadRepetidos = 0;
        for (Integer n : unicos) {
            if (Collections.frequency(numeros3, n) > 1) {
                cantidadRepetidos++;
            }
        }
        System.out.println("Cantidad de elementos repetidos: " + cantidadRepetidos);

        // Mostrar cuanto se repite cada número de los que se repiten
        for (Integer n : repetidos) {
            System.out.println(n + " se repite " + Collections.frequency(numeros3, n) + " veces");
        }
    }
}
