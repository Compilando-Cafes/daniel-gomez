package t8_herencia.entregas.ej2_cajas;

public class CajaDeCarton extends Caja{
    public CajaDeCarton(double alto, double ancho, double fondo, double peso) {
        super(alto, ancho, fondo, peso);
    }

    public void cantidadCartonUsado(){
        double cantidadCarton = super.alto * super.ancho * super.fondo;
        System.out.println("Cantidad de cartón usado para montarla: " + cantidadCarton);
    }

    @Override
    public double volumenCaja() {
        double volumen = (alto * ancho * fondo) * 0.7;
        System.out.println("El volumen de la caja es: " + volumen);
        return volumen;
    }
}