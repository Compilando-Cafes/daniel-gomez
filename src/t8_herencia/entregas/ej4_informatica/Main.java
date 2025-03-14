package t8_herencia.entregas.ej4_informatica;

public class Main {
    public static void main(String[] args) {
        // Crear 5 empleados 2 de ellos programadores
        Empleado empleado1 = new Empleado("Segismundo", "Lazaresco Lazaresco", "Calle Mayor, 456", 40, true, 2000);
        Empleado empleado2 = new Empleado("Hermenegildo", "Zuzunaga Zuzunaga", "Calle Menor, 654", 30, true, 2000);
        Empleado empleado3 = new Empleado("Crescenciano", "Urriaga Urriaga", "Calle de Enmedio, 555", 20, false, 2000);
        Programador programador1 = new Programador("Austiquiliano", "Sandemetrio Sandemetrio", "Calle de Enmedio, 555", 40, true, 2000, 2999, "Cobol");
        Programador programador2 = new Programador("Espidíforo", "Bonachera Bonachera", "Calle de Enmedio, 555", 20, false, 2000, 3001, "Fortran");

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(programador1);
        System.out.println(programador2);

    }
}