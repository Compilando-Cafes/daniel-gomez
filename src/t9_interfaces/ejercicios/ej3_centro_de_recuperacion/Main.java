package t9_interfaces.ejercicios.ej3_centro_de_recuperacion;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Array de 6 animales con 2 de cada tipo
        Animal[] animales = {
                new Ave("Paloma", 3, AnimalBase.EstadoSalud.BIEN, "Bichos", 30, true, "El tejado de mi casa y de los vecinos."),
                new Ave("Mirlo", 5, AnimalBase.EstadoSalud.GRAVE, "Los tomates de mi huerto", 70, true, "Mi huerto si no se lo impido."),
                new Mamifero("Gato", 10, AnimalBase.EstadoSalud.RIESGOSO, "Comida sana", 60, 3),
                new Mamifero("Gato pardo de algún vecino", 13, AnimalBase.EstadoSalud.RECUPERÁNDOSE, "Lo que pilla de mi patio", 5, 10),
                new Reptil("Salamanqui", 6, AnimalBase.EstadoSalud.HERIDO, "Arañas del huerto", 80, 20),
                new Reptil("Lagartija", 4, AnimalBase.EstadoSalud.GRAVE, "Bichos en general", 50, 15)
        };

        while (true) {
            System.out.println("""
                    ==============================================
                    ANIMALES QUE VIVEN CONMIGO O CERCA
                    1. Ver todos los animales.
                    2. Modificarlos.
                    3. Comprobar todos los que necesitan descanso.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 3);
            if (eleccion == 0) {
                System.out.println("Hasta otra.");
                break;
            }
            switch (eleccion) {
                case 1 -> {
                    for (Animal animal : animales){
                        if (animal instanceof Ave)
                            ((Ave) animal).mostrarInformacion();
                        if (animal instanceof Mamifero)
                            ((Mamifero) animal).mostrarInformacion();
                        if (animal instanceof Reptil)
                            ((Reptil) animal).mostrarInformacion();
                    }
                }
                case 2 -> {
                    ((Ave) animales[0]).volar();
                    ((Ave) animales[0]).migrar();
                    animales[0].alimentar();
                    animales[0].revisarSalud();

                    ((Ave) animales[1]).volar();
                    ((Ave) animales[1]).migrar();
                    animales[1].alimentar();
                    animales[1].revisarSalud();

                    ((Mamifero) animales[2]).correr();
                    animales[2].alimentar();
                    animales[2].revisarSalud();

                    ((Mamifero) animales[3]).correr();
                    animales[3].alimentar();
                    animales[3].revisarSalud();

                    ((Reptil) animales[4]).estarALaSombra();
                    ((Reptil) animales[4]).tomarSol();
                    animales[4].alimentar();
                    animales[4].revisarSalud();

                    ((Reptil) animales[5]).estarALaSombra();
                    ((Reptil) animales[5]).tomarSol();
                    animales[5].alimentar();
                    animales[5].revisarSalud();
                }
                case 3 -> {
                    for (Animal animal : animales){
                        if (animal instanceof Ave)
                            System.out.println(animal.getNombre() + (((Ave) animal).necesitaDescanso()?"": " no " + "necesita descansar"));
                        if (animal instanceof Mamifero)
                            System.out.println(animal.getNombre() + (((Mamifero) animal).necesitaDescanso()?"": " no " + "necesita descansar"));
                        if (animal instanceof Reptil)
                            System.out.println(animal.getNombre() + (((Reptil) animal).necesitaDescanso()?"": " no " + "necesita descansar"));
                    }
                }
            }
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