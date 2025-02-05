package t7_clases.ejercicios.ejercicio1_segundo_grado;

public class Main {
    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacion1 = new EcuacionSegundoGrado();
        ecuacion1.setA(1);
        ecuacion1.setB(-3);
        ecuacion1.setC(2);
        ecuacion1.solucion();

        System.out.println("Solución 1 = " + ecuacion1.solucion()[0]);
        System.out.println("Solución 2 = " + ecuacion1.solucion()[1]);
    }
}