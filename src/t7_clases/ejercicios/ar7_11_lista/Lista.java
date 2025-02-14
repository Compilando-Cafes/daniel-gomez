package t7_clases.ejercicios.ar7_11_lista;

import java.util.Arrays;

public class Lista {
    private Integer[] tabla;

    Lista() {
        this.tabla = new Integer[0];
    }

    Lista(Integer[] tabla) {
        if (tabla == null) {
            this.tabla = new Integer[0];
        } else {
            this.tabla = Arrays.copyOf(tabla, tabla.length);
        }

    }

    public void setTabla(Integer[] tabla) {
        if (tabla == null) {
            this.tabla = new Integer[0];
        } else {
            this.tabla = Arrays.copyOf(tabla, tabla.length);
        }
    }

    public Integer[] getTabla() {
        return tabla;
    }

    public void insertarPrincipio(Integer nuevo) {
        // Agrandar la lista un espacio
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        // Mover la tabla uno a la derecha
        // Copia esto desde 0 aquí desde 1 y cuánto copiar.
        // Origen, posInicio, destino, posDestino, cantidad a copiar
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        // Insertar el nuevo número
        tabla[0] = nuevo;
        System.out.println("Número insertado al principio.");
    }

    public void insertarFinal(Integer nuevo) {
        // Ampliar
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        // Copiar al final
        tabla[tabla.length - 1] = nuevo;
        System.out.println("Número insertado al final.");
    }

    public void insertarFinalOtraLista(Lista nuevaTabla) {
        int tamanoInicialTabla = tabla.length;
        // Ampliar tabla
        tabla = Arrays.copyOf(tabla, tabla.length + nuevaTabla.tabla.length);
        // Copiar
        System.arraycopy(nuevaTabla.tabla, 0, tabla, tamanoInicialTabla, nuevaTabla.tabla.length);
    }

    public void insertar(int posicion, Integer nuevo) {
        // Ampliando
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        // Copiar desde la posición hasta el final, moverlo un puesto a la derecha
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        // Copiar el nuevo número en su posición
        tabla[posicion] = nuevo;
    }

    public Integer eliminar(int indice) {
        // Creamos el número a devolver sin valor
        Integer eliminado = null;
        // Comprobar que el índice está dentro del rango de índices de tabla, de cero al final
        if (indice >= 0 && indice < tabla.length) {
            // Guardar en eliminado el valor a devolver
            eliminado = tabla[indice];
            // Copiar los valores de la tabla un puesto más para atrás dejando el último repetido y eliminando el índice.
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            // Eliminar la última posición de la tabla.
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public Integer get(int indice){
        // Iniciar en null para evitar fallos
        Integer resultado = null;
        if (indice >= 0 && indice < tabla.length) {
                resultado = tabla[indice];
        }
        return resultado;
    }

    public int buscar(int claveBusqueda){
        int indice = -1;
        // Recorrer buscando
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(indice)){
                // Si lo encuentra almacenar el valor buscado
                indice = i;
            }
        }
        return indice;
    }
    public int numeroElementos(){
        return tabla.length;
    }

    public void mostrar(){
        System.out.println("Lista: " + Arrays.toString(tabla));
    }
}