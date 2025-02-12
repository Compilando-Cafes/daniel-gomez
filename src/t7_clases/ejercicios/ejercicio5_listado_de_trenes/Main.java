package t7_clases.ejercicios.ejercicio5_listado_de_trenes;

public class Main {
    public static void main(String[] args) {
        // Información de la locomotora y vagones
        String[] informacionVagones = {
                "1234567E_1234_2023",
                "10000:11111:Mineral",
                "20000:22222:Vehiculos",
                "30000:33333:M_Construcción",
                "40000:44444:P_Comercial"
        };

        // Crear el tren con 4 vagones y empresa Renfe
        Tren tren = new Tren(4, informacionVagones, "Renfe");

        // Mostrar la revisión del tren
        tren.revisionDelTren();
    }
}
