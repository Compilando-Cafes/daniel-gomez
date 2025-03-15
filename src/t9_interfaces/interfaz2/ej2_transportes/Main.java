package t9_interfaces.interfaz2.ej2_transportes;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear uno de cada
        Barco barco = new Barco();
        Avion avion = new Avion();
        Hidroavion hidroavion = new Hidroavion();

        while (true) {
            System.out.println("""
                    ==============================================
                    SINGASOLINA.COM
                    BIENVENIDO A LA MEJOR AGENCIA DE VIAJES
                    ¿Cómo quieres viajar?
                    1. Barco. Hemos reflotado el Titanic solo para tí.
                    2. Avión. Tenemos el Air Force One. No lo necesitaban.
                    3. Hidroavión. Pilotado por Indiana Jones.
                    0. Salir
                    ==============================================""");

            int eleccion = pedirNumeroEntero("Elige: ", 0, 3);
            if (eleccion == 0) {
                System.out.println("Vuelve pronto! La próxima vez nuestros precios serán un 50% más caros, solo para clientes VIP.");
                break;
            }
            switch (eleccion) {
                case 1 -> viajarEnBarco(barco);
                case 2 -> viajarEnAvion(avion);
                case 3 -> viajarEnHidroavion(hidroavion);
            }
        }
    }

    public static void viajarEnAvion(Avion avion) {
        int contador = 0; // 0 despegar, 1 volar, 2 aterrizar
        while (true) {
            System.out.println("""
                    ==============================================
                    SINGASOLINA.COM
                    BIENVENIDO AL AIR FORCE ONE
                    ¿Qué quieres hacer?
                    1. Despegar.
                    2. Volar.
                    3. Aterrizar.
                    4. Recargar gasolina.
                    0. Salir
                    ==============================================""");

            int eleccionAvion = pedirNumeroEntero("Elige: ", 0, 4);

            if (eleccionAvion == 0) {
                System.out.println("¿Seguro? Bueno...");
                break;
            }
            switch (eleccionAvion) {
                case 1 -> {
                    if (avion.getGasolina() == 0) {
                        System.out.println("¿Tienes una garrafa por ahí? Es que nos hemos quedado SINGASOLINA.COM");
                    } else {
                        if (contador == 0) {
                            System.out.println("Por favor, enciendan sus teléfonos móviles y todos los aparatos que tengan");
                            avion.despegar();
                            contador++;
                        } else {
                            System.out.println("Para poder volar o aterrizar" +
                                    " a lo mejor el avión tendrá que despegar ¿no?" +
                                    " (sin haberlo planeado...)");
                        }
                    }
                }
                case 2 -> {
                    if (contador == 1) {
                        System.out.println("Volando!!! A ver, explícame como es posible que vuelen los aviones...");
                        avion.volar();
                        contador++;
                    } else {
                        if (contador == 0)
                            System.out.println("Será maravilloso, volar hasta Mallorca, sin haber despegado antes...");
                        else
                            System.out.println("A mi me parece que ya estamos volando, llámame loco...");
                    }
                }
                case 3 -> {
                    if (contador == 2) {
                        System.out.println("Resulta que el avión no tiene tren de aterrizaje...\n" +
                                "!Era broma! ¿Por qué se llamará \"tren\" si vamos en un avión?");
                        avion.aterrizar();
                        contador = 0;
                    } else {
                        if (contador == 0)
                            System.out.println("Estás deseando llegar a tu destino ¿eh?\n" +
                                    "Mejor despega primero el avión");
                        else
                            System.out.println("Volar, volar, volar sin parar, y después se podrá aterrizar.");
                    }
                }
                case 4 -> {
                    System.out.println("Indiana Jones está fumando mientras echa gasolina. No se, no se...");
                    int gasolina = pedirNumeroEntero("¿Cuantos litros de gasolina le decimos a Indi que eche? ", 0);
                    avion.recargarGasolina(gasolina);
                    System.out.println("Perfecto. Ahora somos CONGASOLINA.COM");
                }
            }
        }
    }

    public static void viajarEnBarco(Barco barco) {
        int contador = 0; // 0 zarpar, 1 navegar, 2 reiniciar gasto
        while (true) {
            System.out.println("""
                    ==============================================
                    SINGASOLINA.COM
                    BIENVENIDO AL TITANIC
                    ¿Qué quieres hacer?
                    1. Zarpar.
                    2. Navegar.
                    3. Anclar.
                    4. Reiniciar gasto.
                    0. Salir.
                    ==============================================""");

            int eleccionBarco = pedirNumeroEntero("Elige: ", 0, 4);

            if (eleccionBarco == 0) {
                System.out.println("Tu te lo pierdes...");
                break;
            }
            switch (eleccionBarco) {
                case 1 -> {
                    if (contador == 0) {
                        System.out.println("Zarpemos. No te preocupes, que este barco seguro, seguro, seguro que no se puede hundir.");
                        barco.zarpar();
                        contador++;
                    } else {
                        if (contador == 1)
                            System.out.println("¿Tú lo que quieres es ir más rápido, verdad?");
                        else
                            System.out.println("Si echamos el ancla antes de zarpar salimos en los periódicos...");
                    }
                }
                case 2 -> {
                    if (contador == 1) {
                        System.out.println("¡Muy bién, con valentía! Me han dicho que es temporada de Icebergs.");
                        barco.navegar(pedirSiNo("¿Mira a ver el AEMET y dime si hace buen tiempo? Si o no: "));
                        System.out.println("Perfecto. Estamos navegando!!! Por cierto babor es a la izquierda o es estribor...");
                        contador++;
                    } else {
                        if (contador == 0)
                            System.out.println("¿Tienes prisa por ver los Icebergs? Antes de navegar a lo mejor hay que zarpar...");
                        else
                            System.out.println("Mira a tu alrededor. ¿Ves todo ese agua? A mi me parece que ya estamos navegando.");
                    }
                }
                case 3 -> {
                    if (contador == 2) {
                        System.out.println("Muy bien, vamos a echar el ancla. ¿Sabes como se hace? Hoy es mi primer día...");
                        barco.anclar();
                        contador = 0;
                    } else {
                        if (contador == 0)
                            System.out.println("Vaya, vaya, parece que tienes miedo de zarpar. ¿Por qué, qué podría salir mal?");
                        else
                            System.out.println("Pero déjame que navegue un poco... Mira a lo lejos. Ese iceberg nos está llamando.");
                    }
                }
                case 4 -> {
                    if (barco.getGastoEnViaje() > 0) {
                        System.out.println("Encantados de cargar el cargo del combustible a tu tarjeta de crédito.");
                        System.out.println("Lo ponemos a cero. Gracias por viajar con SINGASOLINA.COM");
                        barco.reiniciaCombustible();
                    } else
                        System.out.println("Por más que nos gustaría no tenemos nada para cargar en tú cuenta. No podemos reiniciar el gasto.");
                }
            }
        }
    }

    public static void viajarEnHidroavion(Hidroavion hidroavion) {
        int contador = 0; // 0 despegar, 1 volar, 2 aterrizar
        while (true) {
            System.out.println("""
                    ==============================================
                    SINGASOLINA.COM
                    BIENVENIDO AL HIDROAVIÓN CON INDIANA JONES
                    ¿Qué quieres hacer?
                    1. Despegar.
                    2. Volar.
                    3. Aterrizar.
                    4. Zarpar.
                    5. Navegar.
                    6. Anclar.
                    7. Transformar.
                    8. Subir al hidroavión.
                    0. Salir
                    ==============================================""");

            int eleccionAvion = pedirNumeroEntero("Elige: ", 0, 8);

            if (eleccionAvion == 0) {
                System.out.println("Indiana, emocionado y con lagrimas en los ojos, se despide de tí sin ser capaz de mirarte a los ojos.");
                break;
            }
            switch (eleccionAvion) {
                case 1 -> {
                    if (hidroavion.getPasajeros() > 0)
                        hidroavion.despegar();
                    else
                        System.out.println("Indiana Jones te mira con los ojos vidriosos desde la ventana del avión" +
                                " con las manos en el cristal preguntándose por qué no subes primero.");
                }
                case 2 -> {
                    if (hidroavion.getPasajeros() > 0)
                        hidroavion.volar();
                    else
                        System.out.println("Indiana Jones te asegura que no hay serpientes en el avión, que puedes subir primero.");
                }
                case 3 -> {
                    if (hidroavion.getPasajeros() > 0) {
                        hidroavion.aterrizar();
                        hidroavion.setPasajeros(0);
                    } else
                        System.out.println("Indiana dice que si no subes primero que dimite.");
                }
                case 4 -> {
                    if (hidroavion.getPasajeros() > 0)
                        hidroavion.zarpar();
                    else
                        System.out.println("Hola soy Jones, Indiana Jones, y tengo licencia para pilotar, pero me da miedo ir solo. ¿Subes primero?");
                }
                case 5 -> {
                    if (hidroavion.getPasajeros() > 0)
                        hidroavion.navegar(pedirSiNo("Después de tanta lluvia, ¿cómo está el día de hoy? ¿Hace bueno? (Si o no): "));
                    else
                        System.out.println("Indiana se ha dejado el sombrero al entrar corriendo al avión. Quizás deberías entrar tú también ¿no?" +
                                " Y ya le llevas el sombrero a Indi, que es un poco intenso...");
                }
                case 6 -> {
                    if (hidroavion.getPasajeros() > 0) {
                        hidroavion.anclar();
                        hidroavion.setPasajeros(0);
                    } else
                        System.out.println("Ves como Indiana se baja del avión y, enfadado, dice: \"esto no me pasaba con los alemanes...\" Tendrías que haber subido antes...");
                }
                case 7 -> {
                    System.out.println("Optimus Prime estaría orgulloso...");
                    hidroavion.transformar();
                }
                case 8 -> {
                    System.out.println("Subiendo al avión. Indiana Jones se quita el sombrero y te da la bienvenida!");
                    hidroavion.anadirPasajero();
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

    public static int pedirNumeroEntero(String mensaje, int minimo) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero >= minimo) {
                    return numero;
                } else {
                    System.out.println("El número debe ser mayor que " + minimo + ".");
                }
            } else {
                System.out.print("Introduce un número válido. ");
                sc.nextLine();
            }
        }
    }

    public static boolean pedirSiNo(String mensaje) {
        String cadena;
        while (true) {
            System.out.print(mensaje);
            cadena = sc.nextLine().toLowerCase();
            if (cadena.equals("si")) {
                return true;
            }
            if (cadena.equals("no")) {
                return false;
            }
            System.out.println("O \"Si\" o \"No\"");
        }
    }
}