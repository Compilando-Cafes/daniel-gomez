package t8_herencia.ej1_poligono;

public class PoligonoRegular extends Poligono {
    private int numeroLados;
    private double apotema;

    public PoligonoRegular(double base, double altura, int numeroLados, double apotema) {
        super(base, altura);
        this.numeroLados = numeroLados;
        this.apotema = apotema;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    double area() {
        double resultado = ((double) 1 /2) * (numeroLados * altura) * apotema;
        System.out.println("El area del polígono " + getClass().getName() + " es: " + resultado);
        return resultado;
    }
}