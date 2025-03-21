package t9_interfaces.ejercicios.ej4_dispositivo;

public interface Electronico {
    void cargarBateria() throws InterruptedException;
    void reiniciar();
    boolean conectarWifi(String red, String contrasena);
    int verificarBateria();
    void modoAhorroEnergia();
}
