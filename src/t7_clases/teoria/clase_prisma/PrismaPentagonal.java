package t7_clases.teoria.clase_prisma;

public class PrismaPentagonal {
    static String color = "Rojo";
    double altura;
    double apotema;
    double medidaAristaBase;
    double areaBase;
    double areaLateral;

    // Constructor por defecto, sin parámetros
    PrismaPentagonal(){
        altura = 1;
        apotema = 0.5;
        medidaAristaBase = 2;
        calcularVolumen();
        calcularAreaLateral();
    }

    // Constructor con todos los parámetros
    PrismaPentagonal(double altura, double apotema, double medidaAristaBase, double areaBase, double areaLateral){
        this.altura = altura;
        this.apotema = apotema;
        this.medidaAristaBase = medidaAristaBase;
        this.areaBase = areaBase;
        this.areaLateral = areaLateral;
    }

    // Constructor con tres valores
    PrismaPentagonal(double altura, double apotema, double medidaAristaBase){
        this(altura, apotema, medidaAristaBase, 0, 0);
    }

    // Constructor para usar el this
    void prueba(){
        int altura = 3;
        altura = altura *2;
        this.altura = 5;

    }

    static void pruebaEstatico(){
        color = "Verde";
    }

    // Imprimir valores de la clase
    public void mostrarDatosClase(){
        System.out.println("Altura:" + this.altura);
        System.out.println("Apotema:" + this.apotema);
        System.out.println("Medida arista base:" + this.medidaAristaBase);
        System.out.println("Area base:" + this.areaBase);
        System.out.println("Area lateral:" + this.areaLateral);
    }


    public void calcularAreaBase(){
        areaBase = (medidaAristaBase*5) * apotema;
    }

    public void calcularAreaLateral(){
        areaLateral = (medidaAristaBase*5)*altura;
    }

    public double calcularAreaTotalPrisma(){
        return (areaBase *2) + areaLateral;
    }

    public double calcularVolumen(){
        return areaBase*altura;
    }

    public static double calcularVolumen(double areaBase, double altura){
        return areaBase * altura;
    }

}