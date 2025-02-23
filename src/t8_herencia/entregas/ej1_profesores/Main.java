package t8_herencia.entregas.ej1_profesores;

public class Main {
    public static void main(String[] args) {
        ProfesorTitular profesorTitular = new ProfesorTitular("María", "Inglés", "Brianda", 10, new Fecha(2,5,2019), 5);
        ProfesorInterino profesorInterino = new ProfesorInterino("Alma", "Programación", "Brianda", 0, new Fecha(15,6,2025), new Fecha(15,12,2024));

        // Calcular salarios
        System.out.println("Salario del profesor titular: " + profesorTitular.obtenerSalarioBase());
        System.out.println("Salario del profesor interino: " + profesorInterino.obtenerSalarioBase());

        System.out.println(profesorTitular);
        System.out.println(profesorInterino);

    }

}