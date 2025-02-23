package t8_herencia.entregas.ej2_instrumento;

import java.util.Arrays;

public abstract class Instrumento {
    protected Nota[] notasMusicalesObra;

    public Instrumento(Nota[] notasMusicalesObra) {
        this.notasMusicalesObra = notasMusicalesObra;
    }

    public Instrumento() {
        notasMusicalesObra = new Nota[0];
    }

    public Nota[] getNotasMusicalesObra() {
        return notasMusicalesObra;
    }

    public void setNotasMusicalesObra(Nota[] notasMusicalesObra) {
        this.notasMusicalesObra = notasMusicalesObra;
    }

    public void add(Nota nota) {
        notasMusicalesObra = Arrays.copyOf(notasMusicalesObra, notasMusicalesObra.length + 1);
        notasMusicalesObra[notasMusicalesObra.length - 1] = nota;
    }

    public abstract void interpretar();
}