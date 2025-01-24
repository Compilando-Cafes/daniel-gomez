package t7_clases.teoria;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Inicializar tabla con 10 alumnos
        Alumno[] alumno = new Alumno[2];
        Practicas[] practicas = new Practicas[2];

        for (int i = 0; i < alumno.length; i++) {

            // Inicializar cada alumno
            alumno[i] = new Alumno();

            // Identificador
            System.out.print("Identificador alumno número " + (i+1) + ": ");
            alumno[i].identificador = sc.nextInt();
            sc.nextLine();

            // Nombre
            System.out.print("Nombre del alumno: ");
            alumno[i].nombre = sc.nextLine();

            // Apellidos
            System.out.print("Apellidos separados por barra baja: ");
            String apellido = sc.nextLine();
            apellido = apellido.replace(" ", "_");
            alumno[i].apellidos = apellido;

            // Nota media
            System.out.print("Nota media: ");
            alumno[i].notaMedia = sc.nextDouble();

            // Año matriculación
            System.out.print("Año matriculación: ");
            alumno[i].notaMedia = sc.nextInt();

            // Preguntar si tiene prácticas
            System.out.print("¿Tiene prácticas? (si o no): ");
            String practicasEleccion = sc.nextLine();
            practicasEleccion = practicasEleccion.toLowerCase();
            if (practicasEleccion.equals("si")){
                practicas[i] = new Practicas();
                for (int j = 0; j< practicas.length; j++){

                    // Identificador empresa
                    System.out.print("Identificador empresa: ");
                    practicas[i].identificador = sc.nextInt();

                    // Nombre de la empresa
                    System.out.print("Nombre de la empresa: ");
                    practicas[i].nombre = sc.nextLine();

                    // CIF
                    System.out.print("Dime el CIF: ");
                    practicas[i].cif = sc.nextLine();

                    // Campo de la materia
                    String[] materias = {"CIENCIA", "LETRAS", "TIC", "ARTES", "BIOLOGÍA"};
                    System.out.println("""
                            Elige la materia:
                            1. Ciencia.
                            2. Letras.
                            3. Tic.
                            4. Artes.
                            5. Biología.
                            """);
                    int eleccionMateria = pedirNumeroEntero("Elección: ", 1, 5);
                    switch (eleccionMateria){
                        case 1 -> practicas[i].campoMateria = materias[0];
                        case 2 -> practicas[i].campoMateria = materias[1];
                        case 3 -> practicas[i].campoMateria = materias[2];
                        case 4 -> practicas[i].campoMateria = materias[3];
                        case 5 -> practicas[i].campoMateria = materias[4];
                    }

                    // Guardar el alumno
                    practicas[i].alumno = alumno[i];

                    // Nota final de práctica
                    System.out.print("Nota final de la práctica: ");
                    practicas[i].notaFinal = sc.nextDouble();
                }


            }
        }
        for (int i = 0; i< alumno.length; i++){
            System.out.print("Identificador alumno " + (i+1) + ": " + alumno[i].identificador);
            System.out.print("Nombre: " + alumno[i].nombre);
            System.out.print("Apellidos: " + alumno[i].apellidos);
            System.out.print("Nota media: " + alumno[i].notaMedia);
            System.out.print("Año de matriculación: " + alumno[i].anoMatriculacion);
            System.out.println();
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