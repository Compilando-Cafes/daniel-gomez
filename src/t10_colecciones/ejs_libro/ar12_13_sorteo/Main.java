package t12_colecciones.ejs_libro.ar12_13_sorteo;

public class Main {
    public static void main(String[] args) {
        Sorteo<Integer> sorteo = new Sorteo<>();
        for (int i = 0; i < 100; i++){
            sorteo.add(i);
        }
        System.out.println(sorteo);
        System.out.println("Premiados: " + sorteo.premiados(20));
    }
}