package t7_clases.ejercicios.ejercicio3_paleta_de_colores;

public class Main {
    public static void main(String[] args) {

        // Crear objeto con el constructor con valores por defecto
        Colores paleta1 = new Colores();

        // Poner los colores cálidos
        paleta1.nuevoColorCalido("rosas");
        paleta1.nuevoColorCalido("rojos");
        paleta1.nuevoColorCalido("naranjas");
        paleta1.nuevoColorCalido("marrones");
        paleta1.nuevoColorCalido("amarillo");
        System.out.println("Colores cálidos");
        mostrarArray(paleta1.getColoresCalidos());
        System.out.println();

        // Ahora los fríos
        paleta1.nuevoColorFrio("verdes");
        paleta1.nuevoColorFrio("azules");
        paleta1.nuevoColorFrio("morados");
        paleta1.nuevoColorFrio("grises");
        System.out.println("Colores fríos:");
        mostrarArray(paleta1.getColoresFrios());
        System.out.println();

        // Crear una paleta mixta
        String [] paletaMixta = paleta1.obtenPaletaMixta();
        System.out.println("Paleta mixta:");
        mostrarArray(paletaMixta);
        System.out.println();

        // Crear y mostrar paletas monocromáticas
        String[] paletaMonocromatica = paleta1.obtenPaletaMonocromatica('f');
        System.out.println("Colores monocromáticos fríos:");
        mostrarArray(paletaMonocromatica);
        System.out.println();
        String[] paletaMonocromatica2 = paleta1.obtenPaletaMonocromatica('c');
        System.out.println("Colores monocromáticos cálidos:");
        mostrarArray(paletaMonocromatica2);
    }

    public static void mostrarArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}