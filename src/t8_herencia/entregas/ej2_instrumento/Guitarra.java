package t8_herencia.entregas.ej2_instrumento;

import java.util.Random;

public class Guitarra extends Instrumento{
    private int cantidadCuerdas;
    Random random = new Random();

    public Guitarra(Nota[] notasMusicalesObra, int cantidadCuerdas) {
        super(notasMusicalesObra);
        this.cantidadCuerdas = cantidadCuerdas;
    }

    public int getCantidadCuerdas() {
        return cantidadCuerdas;
    }

    public void setCantidadCuerdas(int cantidadCuerdas) {
        this.cantidadCuerdas = cantidadCuerdas;
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < notasMusicalesObra.length; i++) {
            int cuerda1Random = random.nextInt(cantidadCuerdas), cuerda2Random = 0;
            boolean repetido = true;

            while (repetido){
                cuerda2Random = random.nextInt(cantidadCuerdas);
                if (cuerda2Random != cuerda1Random)
                    repetido = false;
            }
            System.out.print(cuerda1Random + "+" + cuerda2Random + "=" + notasMusicalesObra[i].name() + (i == notasMusicalesObra.length-1? "" : ", "));
        }
        System.out.println();
    }
}