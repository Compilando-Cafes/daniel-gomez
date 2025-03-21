package t9_interfaces.ejercicios.ej3_centro_de_recuperacion;

public class Mamifero extends AnimalBase{
    private int peso;

    public Mamifero(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia, int peso) {
        super(nombre, edad, estadoSalud, dieta, nivelEnergia);
        this.peso = peso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("""
                Nombre: %s
                \tEdad: %d
                \tEstado de salud: %s
                \tDieta: %s
                \tNivel de energía: %,d
                \tPeso: %,d
                \t¿Necesita descanso?: %s
                """,
                nombre,
                edad,
                estadoSalud.toString().toLowerCase(),
                dieta,
                nivelEnergia,
                peso,
                necesitaDescanso()?"Si": "No"
        );
    }

    @Override
    public boolean necesitaDescanso() {
        return nivelEnergia<10;
    }

    public void correr(){
        if (nivelEnergia>10){
            nivelEnergia -= peso;
            System.out.println("El nivel de energía a disminuído tanto como el peso del animal.");
        }
    }
}