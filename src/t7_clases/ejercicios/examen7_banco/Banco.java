package t7_clases.ejercicios.examen7_banco;

import java.util.Arrays;

public class Banco {
    private Cuenta[] cuentas;
    private boolean sesionIniciada;
    private int posicion;

    public Banco() {
        this.cuentas = new Cuenta[0];
        sesionIniciada = false;
        this.posicion = 0;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        if (cuentas == null)
            this.cuentas = new Cuenta[0];
        else
            this.cuentas = cuentas;
    }

    public boolean isSesionIniciada() {
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
        // Buscar usuario
        for (int i = 0; i < cuentas.length; i++) {
            if(usuario.equals(cuentas[i].getCliente().getUsuario())){
                if (contrasena.equals(cuentas[i].getCliente().getContrasena())){
                    System.out.println("Sesión iniciada correctamente.");
                    this.sesionIniciada = true;
                    this.posicion = i;
                } else {
                    System.out.println("¿Ha olvidado su contraseña?.");
                }
            } else {
                System.out.println("Usuario y contraseña incorrectos.");
            }
        }
    }

    public void revisarEstadoCuenta(){
        if (sesionIniciada){
            System.out.println("Movimientos:");
            for (int i = cuentas.length-1; i >= 0; i--) {
                System.out.println(Arrays.toString(cuentas[i].getMovimientos()));
            }
        }
    }

    public void revisarDatosCliente(){
        System.out.println("Nombre y Apellidos: " + cuentas[posicion].getCliente().getNombre() + " " + cuentas[posicion].getCliente().getApellidos() + ", DNI: " + cuentas[posicion].getCliente().getDNI());
        System.out.println("Usuario: " + cuentas[posicion].getCliente().getUsuario() + ", Contraseña: " + cuentas[posicion].getCliente().getContrasena());
        System.out.println("Número de cuenta: " + cuentas[posicion].getNumeroCuenta() + ", Saldo disponible: " + cuentas[posicion].getSaldo());
    }

    public void retirarDinero(int cantidad){

    }

}