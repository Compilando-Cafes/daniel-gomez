package t12_colecciones.ejs_libro.ar12_02_contenedor_generico;

public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
        for (int i = 0; i< 20; i++){
            c.insertarAlFinal((int) (Math.random() * 20));
        }
        System.out.println("Sin ordenar: " + c);
        c.ordenar();
        System.out.println("Ordenado: " + c);
        Integer n = c.extraerDelPrincipio();
        System.out.println("Elemento extraído: " + n);
        System.out.println("Después de extraer: " + c);
    }

}