package t9_interfaces.interfaz.ej2_animal;

public class Pato implements Animal, Volador, Nadador {
    private double energia;

    public Pato(double energia) {
        this.energia = energia;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    @Override
    public double dormir() {
        if (this.energia >= 1)
            return energia--;
        else {
            System.out.println("El pato no puede dormir, tiene hambre.");
            return 0;
        }
    }

    @Override
    public double avanzar(double cantidad) {
        if (this.energia > cantidad)
            return this.energia - cantidad;
        else {
            System.out.println("El pato no puede avanzar, tiene hambre.");
            return 0;
        }
    }

    @Override
    public double nadar(double cantidad) {
        if (this.energia > (cantidad/2))
            return this.energia - (cantidad/2);
        else {
            System.out.println("El pato no puede nadar, tiene hambre.");
            return 0;
        }
    }

    @Override
    public double volar(double cantidad) {
        if (this.energia > cantidad*2)
            return this.energia - cantidad*2;
        else {
            System.out.println("El pato no puede volar, tiene hambre.");
            return 0;
        }
    }

    @Override
    public double alimentarse(double alimento) {
        System.out.println("¡Qué rico!");
        return this.energia + alimento;
    }
}