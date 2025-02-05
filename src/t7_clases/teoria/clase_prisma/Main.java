package t7_clases.teoria.clase_prisma;

import t7_clases.teoria.clase_alumno.Alumno;
import t7_clases.teoria.clase_alumno.Practicas;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        PrismaPentagonal prisma1, p2;

        prisma1 = new PrismaPentagonal();
        p2 = new PrismaPentagonal();

        prisma1.altura = 2;
        prisma1.apotema = 5;
        prisma1.medidaAristaBase = 5;
        prisma1.calcularAreaBase();
        System.out.println(prisma1.calcularVolumen());
        System.out.println(prisma1.areaBase);

        prisma1.calcularAreaTotalPrisma();
        double areaBase = PrismaPentagonal.calcularVolumen(2, 4);
        System.out.println(areaBase);

        p2.areaBase = 8;
        System.out.println(PrismaPentagonal.color);
        PrismaPentagonal.pruebaEstatico();
        System.out.println(PrismaPentagonal.color);

        PrismaPentagonal prueba1 = new PrismaPentagonal();
        PrismaPentagonal prueba2 = new PrismaPentagonal(0,0,0,0,0);
        PrismaPentagonal prueba3 = new PrismaPentagonal(0,0,0);
        prueba1.mostrarDatosClase();
        prueba2.mostrarDatosClase();
    }
}