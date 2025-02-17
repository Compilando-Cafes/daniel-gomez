package t7_clases.ejercicios.examen7_banco;

import java.util.Arrays;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Cliente cliente;
    private String[] movimientos;

    public Cuenta(String[] movimientos, int numeroCuenta, double saldo, Cliente cliente, String nombre, String apellidos, String DNI, String usuario, String contrasena) {
        if (numeroCuenta > 0 && numeroCuenta <= 99999999)
            this.numeroCuenta = numeroCuenta;
        else {
            System.out.println("El número debe ser de 8 dígitos máximo.");
        }

        if (saldo >= 0)
            this.saldo = saldo;
        else {
            System.out.println("Saldo introducido incorrecto. Se pone el saldo a cero.");
            this.saldo = 0;
        }

        this.cliente = new Cliente(nombre, apellidos, DNI, usuario, contrasena);

        if (movimientos == null){
            this.movimientos = new String[0];
        } else {
            this.movimientos = movimientos;
        }
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        if (numeroCuenta > 0 && numeroCuenta <= 99999999)
            this.numeroCuenta = numeroCuenta;
        else {
            System.out.println("El número debe ser de 8 dígitos máximo. Se inicializa a cero.");
            this.numeroCuenta = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
        else {
            System.out.println("Saldo introducido incorrecto. Se pone el saldo a cero.");
            this.saldo = 0;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String[] movimientos) {
        if (movimientos == null)
            this.movimientos = new String[0];
        else
            this.movimientos = movimientos;
    }
}