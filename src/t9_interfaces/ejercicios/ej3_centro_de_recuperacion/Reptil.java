package t9_interfaces.ejercicios.ej3_centro_de_recuperacion;

public class Reptil extends AnimalBase {
    private double temperaturaCorporal;

    public Reptil(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia, double temperaturaCorporal) {
        super(nombre, edad, estadoSalud, dieta, nivelEnergia);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void tomarSol() {
        this.temperaturaCorporal += 1.5;
    }

    public void estarALaSombra() {
        this.temperaturaCorporal -= 2;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("""
                Nombre: %s
                \tEdad: %d
                \tEstado de salud: %s
                \tDieta: %s
                \tNivel de energía: %,d
                \tTemperatura corporal: %s
                \t¿Necesita descanso?: %s
                """,
                nombre,
                edad,
                estadoSalud.toString().toLowerCase(),
                dieta,
                nivelEnergia,
                temperaturaCorporal,
                necesitaDescanso()?"Si": "No"
        );
    }

    @Override
    public boolean necesitaDescanso() {
        return nivelEnergia < 15 && temperaturaCorporal < 30;
    }
}