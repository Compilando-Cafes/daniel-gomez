package t7_clases.examen;

public class Plato {
    private int numeroPlatoEnMenu;
    private String nombrePlato;
    private double precioPlato;
    private int cantidadIngredientes;

    public Plato(int numeroPlatoEnMenu, String nombrePlato, double precioPlato, int cantidadIngredientes) {
        this.numeroPlatoEnMenu = numeroPlatoEnMenu;
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public int getNumeroPlatoEnMenu() {
        return numeroPlatoEnMenu;
    }

    public void setNumeroPlatoEnMenu(int numeroPlatoEnMenu) {
        this.numeroPlatoEnMenu = numeroPlatoEnMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(double precioPlato) {
        this.precioPlato = precioPlato;
    }

    public int getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public void setCantidadIngredientes(int cantidadIngredientes) {
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public void mostrarInformacion(){
        System.out.println(numeroPlatoEnMenu + " : " + nombrePlato + "_ _ _ _ _ " + precioPlato + "€");
    }
}