package t8_herencia.entregas.ej2_instrumento;

public class Main {
    public static void main(String[] args) {
        Nota[] notas = {Nota.DO, Nota.SI, Nota.FA, Nota.RE, Nota.DO, Nota.SOL};
        Piano piano = new Piano(notas, 5);
        Campana campana = new Campana(notas, 10);
        Guitarra guitarra = new Guitarra(notas, 5);

        System.out.println("Piano");
        piano.interpretar();

        System.out.println();
        System.out.println("Campana");
        campana.interpretar();

        System.out.println();
        System.out.println("Guitarra");
        guitarra.interpretar();
    }



}