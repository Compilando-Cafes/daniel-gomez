package t9_interfaces.ejercicios.ej3_centro_de_recuperacion;

public class Ave extends AnimalBase {
    private boolean puedeVolar;
    private String habitat;

    public Ave(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia, boolean puedeVolar, String habitat) {
        super(nombre, edad, estadoSalud, dieta, nivelEnergia);
        this.puedeVolar = puedeVolar;
        this.habitat = habitat;
    }

    public void volar() {
        if (puedeVolar && nivelEnergia > 10) {
            nivelEnergia-=10;
        }
    }

    public void migrar(){
        System.out.println("El ave está migrando a otra zona en el habitat " + habitat);
    }


    @Override
    public void mostrarInformacion() {
        System.out.printf("""
                Nombre: %s
                \tEdad: %d
                \tEstado de salud: %s
                \tDieta: %s
                \tNivel de energía: %,d
                \t¿Puede volar?: %s
                \tHábitat: %s
                \t¿Necesita descanso?: %s
                """,
                nombre,
                edad,
                estadoSalud.toString().toLowerCase(),
                dieta,
                nivelEnergia,
                puedeVolar?"Si": "No",
                habitat,
                necesitaDescanso()?"Si": "No"
        );
    }

    @Override
    public boolean necesitaDescanso() {
        return nivelEnergia < 20;
    }
}