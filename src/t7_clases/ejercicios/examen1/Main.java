package t7_clases.ejercicios.examen1;
import java.util.Scanner;
public class Main {


    public class main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Curso cDAM = new Curso("dam1");
            cDAM.anyadirEstudiante("Pedro", 20);
            cDAM.anyadirEstudiante("Ana", 18);
            cDAM.anyadirEstudiante("María", 19);
            cDAM.anyadirEstudiante("Sara", 31);
            cDAM.anyadirEstudiante("José", 46);
            cDAM.anyadirEstudiante("Jesús", 27);
            cDAM.anyadirEstudiante("Ainhoa", 23);
            cDAM.anyadirEstudiante("Daniel", 35);
            cDAM.anyadirEstudiante("David", 41);
            cDAM.anyadirEstudiante("Mario", 21);
            cDAM.anyadirEstudiante("Miguel", 18);
/*
            cDAM.anyadirProfesor("Julia", "Leng. de Marcas", "12345678K", "1/9/2021");
            cDAM.anyadirProfesor("Julia", "Tutorías", "12345678K", "1/9/2021");
            cDAM.anyadirProfesor("Martín", "Bases de Datos", "11223344K", "1/9/2018");
            cDAM.anyadirProfesor("Miguel", "Sistemas Informáticos", "99887766P", "1/9/2020");
            cDAM.anyadirProfesor("Alma", "Programación", "34251678K", "1/12/2024");
            cDAM.anyadirProfesor("Adela", "Digitalización", "56473829K", "1/9/2024");
            cDAM.anyadirProfesor("Luis", "Sostenibilidad", "10293847K", "1/9/2014");
            cDAM.anyadirProfesor("Llanos", "Itinerarios", "87654321K", "1/10/2018");
            cDAM.anyadirProfesor("Sara", "Ingles", "98765432K", "1/9/2023");
            cDAM.anyadirProfesor("Adela", "Entornos de desarrollo", "56473829K", "1/9/2024");
            cDAM.anyadirProfesor("María Jesús", "Acceso a Datos", "19283847K", "1/9/2016");

            // VARIABLE QUE GUARDA LA OPCION
            int op = -1;

            do{
                //MENÚ
                System.out.println();
                System.out.println("Elija su opcion");
                System.out.println("1. Buscar un alumno por su nombre");
                System.out.println("2. Eliminar un alumno por su nombre");
                System.out.println("3. Eliminar un profesor por su nombre");
                System.out.println("4. Calcular nota media");
                System.out.println("5. Mostrar toda la información");
                System.out.println("6. Salir");

                //COMPRUEBA QUE TODOS LOS ENTEROS ESTÁN DENTRO DE LOS RANGOS
                op = sc.nextInt();
                sc.nextLine();
                if(op == 1) {
                    System.out.println("Introduce el nombre: ");
                    String nombre = sc.nextLine();
                    cDAM.buscarEstudiante(nombre);
                }else if(op == 2) {
                    System.out.println("Introduce el nombre: ");
                    String nombre = sc.nextLine();
                    cDAM.eliminarEstudiante(nombre);
                }else if(op == 3) {
                    System.out.println("Introduce el nombre: ");
                    String nombre = sc.nextLine();
                    cDAM.eliminarProfesor(nombre);
                }else if(op == 4) {
                    cDAM.calcularMediaNotas();
                }else if(op == 5) {
                    cDAM.mostrarListado();
                }
            }while(op != 6);
        }*/

        }

    }}