package t8_herencia.entregas.ej2_instrumento;

public class Campana extends Instrumento {
    public int reverberacion;

    public Campana(Nota[] notasMusicalesObra, int reverberacion) {
        super(notasMusicalesObra);
        this.reverberacion = reverberacion;
    }

    public int getReverberacion() {
        return reverberacion;
    }

    public void setReverberacion(int reverberacion) {
        this.reverberacion = reverberacion;
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < notasMusicalesObra.length ; i++) {
            System.out.print(notasMusicalesObra[i]);
            for (int j = 0; j < reverberacion-1; j++) {
                System.out.print(notasMusicalesObra[i].name().charAt(notasMusicalesObra[i].name().length()-1) +
                        (j == reverberacion-2 ? (i==notasMusicalesObra.length-1? "": ", ") : ""));
            }
        }
        System.out.println();
    }
}