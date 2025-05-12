package t12_colecciones.clase_1_colecciones.ej1_lista_cadenas;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Collection<String> listaCadenas = new ArrayList<>();
        while (true) {
            System.out.println("""
                    ==============================================
                    Lista de tipo String (cadena)
                    1. Añadir cadena
                    2. Eliminar primera posición
                    3. Listar todos los elementos separados por un +
                    4. Recuperar la longitud de la lista
                    5. Comprobar si tiene cadena especificada
                    6. Listar todos los elementos y solicitar, mientras se lista, si se quiere eliminar o pasar al siguiente
                    7. Transformar la lista dinámica en una tabla y mostrar las cadenas ordenadas con Arrays.toString()
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 7);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    System.out.println("1. Añadir cadena");
                    System.out.print("Dime la cadena que quieres añadir: ");
                    String cadena = sc.nextLine();
                    listaCadenas.add(cadena);
                }
                case 2 -> {
                    System.out.println("2. Eliminar primera posición");
                    if (listaCadenas.isEmpty()){
                        System.out.println("La lista está vacía, no se puede eliminar nada");
                    } else {
                        Iterator<String> it = listaCadenas.iterator();
                        listaCadenas.remove(it.next());
                        System.out.println("Primera posición eliminada.");
                    }
                }
                case 3 -> {
                    System.out.println("3. Listar todos los elementos separados por +");
                    if (listaCadenas.isEmpty()){
                        System.out.println("La lista está vacía.");
                    } else{
                        Iterator<String> it = listaCadenas.iterator();
                        while (it.hasNext()) {
                            System.out.print(it.next() + (it.hasNext()? " + ": ""));
                        }
                    }
//                    System.out.println(String.join(" + ", listaCadenas));
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Recuperar la longitud de la lista.");
                    System.out.println("La lista tiene una longitud de " + listaCadenas.size() + " posiciones.");
                }
                case 5 -> {
                    System.out.println("Comprobar si tiene cadena específica.");
                    System.out.print("Dime la cadena que quieres buscar: ");
                    String cadena = sc.nextLine();
                    if (listaCadenas.contains(cadena)){
                        System.out.println("La cadena solicitada está en la lista.");
                    } else
                        System.out.println("La cadena solicitada no está en la lista.");
                }
                case 6 -> {
                    System.out.println("Listar todos los elementos y solicitar, mientras se lista, si se quiere eliminar o pasar al siguiente");
                    Iterator<String> it = listaCadenas.iterator();
                    for (;it.hasNext();){
                        System.out.println("Elemento de la lista: " + it.next());
                        System.out.print("¿Quieres eliminarlo? (Si o no): ");
                        boolean control = true;
                        while (control){
                            String opcion = sc.nextLine().toLowerCase();
                            if (opcion.equals("si")){
                                it.remove();
                                System.out.println("Borrado.");
                                control = false;
                            } else if (opcion.equals("no")){
                                control = false;
                            } else {
                                System.out.println("Elige sí o no.");
                            }
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Transformar la lista dinámica en una tabla y mostrar las cadenas ordenadas con Arrays.toString()");
                    String[] listaEstatica = listaCadenas.toArray(new String[0]);
                    Arrays.sort(listaEstatica);
                    System.out.println(Arrays.toString(listaEstatica));
                }
            }
        }
    }

    public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }
}