package t7_clases.ejercicios.examen3_banco;

import java.util.Arrays;
import java.util.Scanner;

public class Banco {
    private Cuenta[] cuentas = new Cuenta[10];
    private boolean sesionIniciada;
    private int posicion;

    // Constructor
    Banco(){
        this.cuentas = new Cuenta[10];
        this.sesionIniciada = false;
        this.posicion = 0;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        if (cuentas.length <= 10)
            this.cuentas = cuentas;
        else
            System.out.println("No se ha podido almacenar el grupo de cuentas. Debe tener 10 cuentas.");
    }

    public boolean getSesionIniciada() {
        return sesionIniciada;
    }

    public void setSesionIniciada(boolean sesionIniciada) {
        this.sesionIniciada = sesionIniciada;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void iniciarSesion(String usuario, String contrasena){
        for (int i = 0; i < cuentas.length; i++) {
            if (usuario.equalsIgnoreCase(cuentas[i].getCliente().getUsuario())) {
                if(contrasena.equalsIgnoreCase(cuentas[i].getCliente().getContrasena())){
                    System.out.println("Sesión iniciada correctamente.");
                    this.sesionIniciada = true;
                    this.posicion = i;
                } else {
                    System.out.println("¿Ha olvidado su contraseña?");
                }
            } else {
                System.out.println("Usuario y contraseña incorrectos.");
            }
        }
    }

    public void revisarEstadoCuenta(){
        if (sesionIniciada){
            for (int i = cuentas[posicion].getMovimientos().length; i >= 0 ; i--) {
                System.out.println(Arrays.toString(cuentas[posicion].getMovimientos()));
            }
        }
    }

    public void revisarDatosCliente(){
        if (sesionIniciada) {
            System.out.println("Nombre y Apellido: " + cuentas[posicion].getCliente().getNombre() + ", DNI:" + cuentas[posicion].getCliente().getDNI());
            System.out.println("Usuario: " + cuentas[posicion].getCliente().getUsuario() + ", Contraseña:" + cuentas[posicion].getCliente().getContrasena());
            System.out.println("Número de cuenta: " + cuentas[posicion].getNumero() + ", Saldo disponible:" + cuentas[posicion].getSaldo());
        }
    }

    public void retirarDinero(double cantidad){
        if (cantidad <= 0){
            System.out.println("Introduce una cantidad positiva.");
            return;
        }

        if (cantidad > cuentas[posicion].getSaldo()) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        cuentas[posicion].setSaldo(cuentas[posicion].getSaldo() - cantidad);

        // Crear nuevo array de movimientos con +1 posición
        String[] nuevosMovimientos;
        if (cuentas[posicion].getMovimientos() == null) {
            nuevosMovimientos = new String[1];
        } else {
            nuevosMovimientos = Arrays.copyOf(cuentas[posicion].getMovimientos(), cuentas[posicion].getMovimientos().length + 1);
        }

        // Añadir el nuevo movimiento
        nuevosMovimientos[nuevosMovimientos.length - 1] = "Retirada de " + cantidad + "€";

        // Asignar el nuevo array actualizado a la cuenta
        cuentas[posicion].setMovimientos(nuevosMovimientos);

        System.out.println("Retirados " + cantidad + "€");
    }

    public void ingresarDinero(double cantidad){
        if (cantidad <= 0){
            System.out.println("La cantidad debe ser positiva.");
            return;
        }

        cuentas[posicion].setSaldo(cuentas[posicion].getSaldo() + cantidad);

        // Crear nuevo array de movimientos con +1 posición
        String[] nuevosMovimientos;
        if (cuentas[posicion].getMovimientos() == null) {
            nuevosMovimientos = new String[1];
        } else {
            nuevosMovimientos = Arrays.copyOf(cuentas[posicion].getMovimientos(), cuentas[posicion].getMovimientos().length + 1);
        }

        // Añadir el nuevo movimiento correcto
        nuevosMovimientos[nuevosMovimientos.length - 1] = "Ingreso de " + cantidad + "€";

        // **Faltaba asignar los movimientos actualizados**
        cuentas[posicion].setMovimientos(nuevosMovimientos);

        System.out.println("Cantidad ingresada: " + cantidad + "€");
    }


    public void cerrarSesion(){
        sesionIniciada = false;
        posicion = -1;
        System.out.println("Se ha cerrado la sesión");
    }

    public void crearCuenta(Scanner sc){
        if (posicion >= cuentas.length) {
            System.out.println("No se pueden agregar más cuentas.");
            return;
        }

        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce los apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduce el DNI: ");
        String DNI = sc.nextLine();
        System.out.println("Introduce el usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Introduce la contraseña: ");
        String contrasena = sc.nextLine();
        System.out.println("Introduce el número de cuenta: ");
        int numero = sc.nextInt();
        System.out.println("Introduce el saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        // Crear la nueva cuenta en la siguiente posición libre
        cuentas[posicion] = new Cuenta(null, numero, saldo, nombre, apellidos, DNI, usuario, contrasena);
        posicion++;

        System.out.println("Cuenta creada correctamente.");
    }

}