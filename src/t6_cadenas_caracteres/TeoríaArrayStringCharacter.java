package t6_cadenas_caracteres;

import java.util.Arrays;

public class TeoríaArrayStringCharacter {
    public static void main(String[] args) {
        char caracter = 'a';
        String cadena = "";
        int entero = 0;
        boolean booleano = true;
        //********************************************************************
        // CLASE ARRAY (hay que importarla: import java.util.Arrays)
        //********************************************************************
        String[] tabla = new String[5];
        /* Como lo inicializa:
        Números = 0
        Booleanos = false
        Resto = null
         */

        // Vaciar una tabla --------------------------------------------------
        tabla = null;

        // Longitud de una tabla o cuantos elementos tiene -------------------
        int longitud = tabla.length;

        // Rellenar una tabla con un valor concreto --------------------------
        String[] tabla2 = new String[10];
        Arrays.fill(tabla2, "-"); // fill es void, no devuelve nada, no hay que asignarlo a algo.
        Arrays.fill(tabla2, 3, 6, "-"); // rellena desde una posición hasta otra con lo que sea
        // Recorrer un array con un for --------------------------------------
        
        // Mostrar una tabla -------------------------------------------------
        System.out.println(tabla2); // Muestra su referencia
        System.out.println(Arrays.toString(tabla2)); // La muestra así: [-,-,-,-,-]
        // Con un for para mostrarla como queramos.
        // Se puede usar un for-each si no vamos a usar sus posiciones
        for (String elemento : tabla2) {
            System.out.println(elemento);
        }

        // Ordenar una tabla -------------------------------------------------
        Arrays.sort(tabla2); // sort es void, no devuelve nada, no asignar a nada.

        // Buscar en una tabla -----------------------------------------------
        // Buscar en tabla no ordenada con while
        int indiceBusqueda = 0;
        while (indiceBusqueda < tabla2.length && tabla2[indiceBusqueda] != "loQueBuscamos") { // Recuerda: Strings con .equals
            indiceBusqueda++;
        }
        if (indiceBusqueda < tabla2.length) {
            // Lo que buscamos está en índiceBusqueda
        } else {
            // No hemos encontrado lo que buscamos
        }

        // Buscar en tabla ordenada --------------------------------------------
        int posicion = Arrays.binarySearch(tabla2, "Lo que busquemos");
        /* Indicamos tabla y lo que queremos buscar
        Positivo: Encontrado. Dice el índice donde se encuentra.
        Negativo: No encontrado. Dice el índice donde debería estar.
        Cuidado con el cero. Si pone -1 es que debería estar en la posición 0.
         */
        posicion = Arrays.binarySearch(tabla2, 2, 4, "Lo que busquemos");
        // Arrays.binarySearch(Tabla, desde, hasta, lo que buscamos)

        // Copiar una tabla -----------------------------------------------------
        int[] tabla3 = {1, 2, 3, 4, 5};
        int[] tablaCopia = Arrays.copyOf(tabla3, tabla3.length); // Indicamos la tabla a copiar y la longitud de la copia
        int[] tablaCopia2 = Arrays.copyOfRange(tabla3, 3, 5); // Tabla a copiar, desde, hasta.
        // Copiar entre dos tablas con la clase System
        // En este caso ambas tablas deben estar creadas de antes.
        System.arraycopy(tabla3, 0, tablaCopia2, 2, 4); // Es void, no devuelve nada.
        // System.arraycopy(TABLA_ORIGEN, DESDE_DONDE, TABLA_DESTINO, DESDE_DONDE, CUANTOS_COPIAR(LONGITUD));

        // Insertar algo en una tabla --------------------------------------------
        // Insertar en tabla no ordenada, al final
        tabla3 = Arrays.copyOf(tabla3, tabla3.length + 1); // Hacemos la tabla un puesto más grande al final
        tabla3[tabla.length - 1] = 6; // Añadimos lo que queramos en esa última posición.

        // Insertar en tabla ordenada, donde debe estar ---------------------------
        // (Se puede hacer con el sistema anterior y después ordenar con sort)
        int[] tablaOrdenada = {1, 2, 4, 5}; // Queremos añadir el tres
        int numeroAAnadir = 3;
        int indiceInsercion = Arrays.binarySearch(tablaOrdenada, numeroAAnadir); // Buscamos el índice donde debería estar
        if (indiceInsercion < 0) { // Si no lo encuentra da un número negativo. La posición que buscamos
            indiceInsercion = -indiceInsercion - 1; // Lo pasamos a positivo y sumamos uno por el cero.
        }
        int[] copiaTablaOrdenada = new int[tablaOrdenada.length + 1]; // Creamos una nueva tabla con tamaño +1
        // Copiar lo que va antes del hueco
        System.arraycopy(tablaOrdenada, 0, copiaTablaOrdenada, 0, indiceInsercion);
        // Copiar lo que va después del hueco
        System.arraycopy(tablaOrdenada, indiceInsercion, copiaTablaOrdenada, indiceInsercion + 1, tablaOrdenada.length - indiceInsercion);
        // Añadimos el número al hueco
        copiaTablaOrdenada[indiceInsercion] = numeroAAnadir;
        // Referenciamos la tabla ordenada a la copia y listo.
        tablaOrdenada = copiaTablaOrdenada;

        // Eliminar un elemento ---------------------------------------------------
        // Eliminar en tabla no ordenada. Mover el último a la posición a eliminar y quitar el último puesto
        int[] tablaNoOrdenada = {3, 5, 2, 4};
        int numeroAQuitar = 2;
        int indiceEliminar = Arrays.binarySearch(tablaNoOrdenada, numeroAQuitar); // Buscamos el índice donde debería estar
        if (indiceEliminar >= 0) { // Si lo encuentra y devuelve un número positivo
            // Copiamos lo que esté al final de la tabla en la posición que hay que eliminar.
            tablaNoOrdenada[indiceEliminar] = tablaNoOrdenada[tablaNoOrdenada.length - 1];
            // Disminuimos la longitud de la tabla quitando el último puesto
            tablaNoOrdenada = Arrays.copyOf(tablaNoOrdenada, tablaNoOrdenada.length - 1);
        } else {
        } // Si no lo encontramos...

        // Eliminar en tabla ordenada. -----------------------------------------------------
        // Mover los valores que estén después del índice a eliminar una posición atrás
        indiceEliminar = Arrays.binarySearch(tablaOrdenada, numeroAQuitar); // Buscamos el índice donde debería estar
        if (indiceEliminar >= 0) { // Si lo encuentra y devuelve su posición con un número positivo
            System.arraycopy(tablaOrdenada, indiceEliminar + 1, tablaOrdenada, indiceEliminar, tablaOrdenada.length - indiceEliminar - 1);
            /* Ej.: Índice a eliminar está en la posición 3 y la longitud de la tabla es de 5.
            (tabla, 3+1, tabla, 3, 5-3-1)
            Coge de la tablaOrigen, desde la posición a eliminar más uno. Copia en tablaDestino lo que haya desde la posición hasta el final
             */
        }

        // Comparar dos tablas --------------------------------------------------------------
        booleano = Arrays.equals(tabla, tabla2); // Con == no funciona. Tiene que ser con .equals

        // Tabla de dos dimensiones ---------------------------------------------------------
        int[][] tablaBidimensional = new int[3][5];
        // Para recorrer una tabla bidimensional
        // eje x: columnas
        // eje y: filas
        // Primer for para las columnas y dentro otro para las filas.

        // Tabla tridimensional --------------------------------------------------------------
        int[][][] tablaTridimensional = new int[5][2][7];
        // eje x: ancho
        // eje y: alto
        // eje z: profundidad

        // ***********************************************************************************
        // CLASE CHARACTER
        // ***********************************************************************************

        // Conversiones ----------------------------------------------------------------------
        caracter = Character.toUpperCase(caracter);
        caracter = Character.toLowerCase(caracter);
        cadena = Character.toString(caracter); // También para un int de un ASCII

        // Clasificaciones -------------------------------------------------------------------
        booleano = Character.isDigit(caracter);
        booleano = Character.isLetter(caracter);
        booleano = Character.isLetterOrDigit(caracter);
        booleano = Character.isLowerCase(caracter);
        booleano = Character.isUpperCase(caracter);
        booleano = Character.isSpaceChar(caracter); // Solo el espacio
        booleano = Character.isWhitespace(caracter); // Espacio + \t, \n y \r...

        // ***********************************************************************************
        // CLASE STRING
        // ***********************************************************************************

        // Convertir a string ----------------------------------------------------------------
        cadena = String.valueOf(1234); //Válido para int, double, char y boolean.

        // Comparaciones ---------------------------------------------------------------------
        // Comparar si son iguales dos cadenas
        String cadena1 = "Pepe González";
        String cadena2 = "Daniel Gonzo";
        booleano = cadena1.equals(cadena2); // NO COMPARAR CON ==. Usar .equals
        booleano = cadena1.equalsIgnoreCase(cadena2); // Sin distinguir mayúsculas. A == a

        // Comparar dos trozos de dos cadenas ------------------------------------------------
        booleano = cadena1.regionMatches(5, cadena2, 7, 4);
        booleano = cadena1.regionMatches(true, 5, cadena2, 7, 4); // +True para ignorar mayúsculas
        /* 4 valores: Ej. Apellidos que empiecen por Gon
        1. Inicio de cadena1 que queremos comparar. Ej.: Cadena1 = Pepe González. Desde posición 5: a partir de la G
        2. Cadena2. Ej.: Daniel Gonzo
        3. Desde donde de cadena2. Ej.: posición 7 a partir de la G
        4. Número de caracteres a comparar en AMBAS. Ej.: 3 caracteres. cadena1=Gon == cadena2=Gon. Resultado = true.
         */

        // Comparar que cadena es mayor, cual va antes en el diccionario. --------------------
        cadena1 = "aaa";
        cadena2 = "bbb";
        entero = cadena1.compareTo(cadena2);
        entero = cadena1.compareToIgnoreCase(cadena2); // Ignora mayúsculas y minúsculas
        /*
        0: si son iguales
        negativo: si cadena1 va antes por orden alfabético.
        positivo: si cadena2 va antes por orden alfabético.
         */

        // Obtener un carácter. --------------------------------------------------------------
        caracter = cadena1.charAt(0);
        // Obtener longitud (cuantos caracteres tiene)
        entero = cadena1.length();

        // Modificaciones de una cadena ------------------------------------------------------
        // Obtener un trozo o una subcadena
        cadena1 = cadena2.substring(1, 2); // Inicio y fin (opcional, si no se pone es hasta el final)
        cadena1 = cadena1.strip(); // quita espacios al principio y al final
        cadena1 = cadena1.stripLeading(); // quita espacios al principio
        cadena1 = cadena1.stripLeading(); // quita espacios al final

        // Búsqueda --------------------------------------------------------------------------
        entero = cadena1.indexOf('c'); // Posición de lo que queramos
        entero = cadena1.indexOf('c', 4); // Buscar desde un índice concreto
        entero = cadena1.lastIndexOf('c', 4); // Busca desde la posición indicada desde el final

        // Comprobar -------------------------------------------------------------------------
        booleano = cadena1.isEmpty(); // True si está vacía
        booleano = cadena1.contains("a"); // True si encuentra lo que le pongamos

        // Prefijos y sufijos ----------------------------------------------------------------
        booleano = cadena1.startsWith("Daniel"); // Si empieza por algo desde posición 0
        booleano = cadena1.startsWith("Daniel", 5); // Si empieza por algo desde posición que pongamos
        booleano = cadena1.endsWith("Daniel"); // Si termina por algo

        // Conversiones -----------------------------------------------------------------------
        cadena1 = cadena1.toLowerCase(); // Convierte letras a minúsculas (resto deja igual)
        cadena1 = cadena1.toUpperCase(); // Convierte letras a mayúsculas (resto deja igual)

        // Reemplazar -------------------------------------------------------------------------
        cadena1 = cadena1.replace("a", "w"); // Reemplaza lo que encuentre de algo por lo que queramos.

        // Convertir a un array de Strings cortando por donde digamos con el separador --------
        String cadena3 = "Hola que tal";
        String[] tablaStrings = cadena3.split(" ");

        // Convertir --------------------------------------------------------------------------
        char[] tablaCaracteres = cadena.toCharArray(); // De String a array de caracteres
        cadena = String.valueOf(tablaCaracteres); // De array de caracteres a String.
        cadena = String.valueOf(tablaCaracteres, 2, 4); // Como el anterior con desde y hasta donde convertir.
    }
}