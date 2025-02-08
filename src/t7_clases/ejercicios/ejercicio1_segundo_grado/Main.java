package t7_clases.ejercicios.ejercicio1_segundo_grado;

public class Main {
    public static void main(String[] args) {
        double a = 1, b = -3, c = 2;
        EcuacionSegundoGrado ecuacion1 = new EcuacionSegundoGrado();
        ecuacion1.setA(a);
        ecuacion1.setB(b);
        ecuacion1.setC(c);
        ecuacion1.solucion();

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        System.out.println("Solución 1 = " + ecuacion1.solucion()[0]);
        System.out.println("Solución 2 = " + ecuacion1.solucion()[1]);
    }
}