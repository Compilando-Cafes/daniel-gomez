package t9_interfaces.ejercicios.ej3_centro_de_recuperacion;

public abstract class AnimalBase implements Animal {
    enum EstadoSalud {HERIDO, GRAVE, RIESGOSO, RECUPERÁNDOSE, BIEN}
    protected String nombre;
    protected int edad;
    protected EstadoSalud estadoSalud;
    protected String dieta;
    protected int nivelEnergia;

    public AnimalBase(String nombre, int edad, EstadoSalud estadoSalud, String dieta, int nivelEnergia) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
        this.dieta = dieta;
        if (nivelEnergia<50) {
            this.nivelEnergia = nivelEnergia;
            System.out.println("Nivel mínimo de energía admitido: 50");
        } else
            this.nivelEnergia = nivelEnergia;
    }

    public AnimalBase() {
        this.nivelEnergia = 50;
    }

    public abstract void mostrarInformacion();

    public abstract boolean necesitaDescanso();

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void alimentar() {
        this.nivelEnergia += 10;
        System.out.println("Animal alimentado. Ahora tiene 10 más de energía: " + this.nivelEnergia);
    }

    @Override
    public void revisarSalud() {
        if (!estadoSalud.equals(EstadoSalud.BIEN)){
            if (!estadoSalud.equals(EstadoSalud.RECUPERÁNDOSE)){
                this.estadoSalud = EstadoSalud.RECUPERÁNDOSE;
                System.out.println("El animal ahora se está recuperando.");
            } else {
                this.estadoSalud = EstadoSalud.BIEN;
                System.out.println("El animal se ha recuperado. Está bien.");
            }
        } else
            System.out.println("El animal está bien.");
    }
}