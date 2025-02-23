package t8_herencia.ej2_instrumento;

import java.util.Arrays;
import java.util.Random;

public class Piano extends Instrumento {
    private int cantidadOctavas;
    Random random = new Random();

    public Piano(Nota[] notasMusicalesObra, int cantidadOctavas) {
        super(notasMusicalesObra);
        this.cantidadOctavas = cantidadOctavas;
    }

    public int getCantidadOctavas() {
        return cantidadOctavas;
    }

    public void setCantidadOctavas(int cantidadOctavas) {
        this.cantidadOctavas = cantidadOctavas;
    }

    @Override
    public void interpretar() {
        // Crear un array con tantos números aleatorios como notas
        int[] octavasAleatorias = new int[notasMusicalesObra.length];
        // Rellenarlo con números distintos
        for (int i = 0; i < octavasAleatorias.length; i++) {
            int octavaAleatoria = -1;
            if (Arrays.binarySearch(octavasAleatorias, octavaAleatoria) == -1) {
                octavaAleatoria = random.nextInt(cantidadOctavas);
            }
            octavasAleatorias[i] = octavaAleatoria;
        }
        // Mostrar los dos arrays
        for (int i = 0; i < octavasAleatorias.length; i++) {
            System.out.print(notasMusicalesObra[i].name() + octavasAleatorias[i] + (i == octavasAleatorias.length - 1 ? "" : ", "));
        }
        System.out.println();
    }
}