package t7_clases.ejercicios.ejercicio5_listado_de_trenes;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anyo;

    // Constructor
    Locomotora(String matricula, int potencia, int anyo) {
        this.matricula = matricula;

        if (potencia > 0)
            this.potencia = potencia;
        else
            this.potencia = 1;

        if (anyo > 1900 && anyo < 2100)
            this.anyo = anyo;
        else
            this.anyo = 1900;
    }

    // Métodos get y set


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null)
            this.matricula = " ";
        else
            this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        if (potencia > 0)
            this.potencia = potencia;
        else
            this.potencia = 1;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        if (anyo > 1900 && anyo < 2100)
            this.anyo = anyo;
        else
            this.anyo = 1900;
    }
}