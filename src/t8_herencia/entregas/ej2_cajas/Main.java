package t8_herencia.entregas.ej2_cajas;

public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja(10, 10,10, 5);
        caja1.setEtiqueta("Juan Pablo ||", "Vaticano", "Marchamalo", "Envíos celestiales", 100, "Libros prohibidos");
        System.out.println("El coste del envío es: " + caja1.costoEnvio());
        System.out.println("El volumen de la caja es: " + caja1.volumenCaja());
        System.out.println(caja1);

        CajaDeCarton cajaDeCarton = new CajaDeCarton(5,5,5,20);
        cajaDeCarton.setEtiqueta("Daniel", "Marchamalo", "Vaticano", "Envíos celestiales", 100, "Libros censurados");
        System.out.println("El coste del envío es: " + cajaDeCarton.costoEnvio());
        System.out.println("El volumen de la caja es: " + cajaDeCarton.volumenCaja());
        System.out.println(cajaDeCarton);
    }
}