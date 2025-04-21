package t10_colecciones.ejs_libro.ar12_14_estacion_meteorologica;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Registro> temperaturas = new LinkedHashSet<>();
        int opcion;
        do {
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros del día");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Salir");
            System.out.print("\nIntroducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introducir temperatura: 1");
                    double temperatura = new Scanner(System.in).useLocale(Locale.US).nextDouble();
                    temperaturas.add(new Registro(temperatura));
                }
                case 2 -> {
                    System.out.println(temperaturas);
                }
                case 3 -> {
                    Comparator<Registro> c = new Comparator<Registro>() {
                        @Override
                        public int compare(Registro o1, Registro o2) {
                            return (int) Math.signum(o1.temperatura - o2.temperatura);
                        }
                    };
                    System.out.println("Máxima: " + Collections.max(temperaturas, c));
                    System.out.println("Mínima: " + Collections.min(temperaturas, c));
                    double suma = 0;
                    for (Registro t : temperaturas) {
                        suma += t.temperatura;
                    }
                    System.out.println("Media: " + suma / temperaturas.size());
                }
            }
        } while (opcion != 4);
        String nombreArchivo = "registros";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyMMdd");
        nombreArchivo += LocalDate.now().format(f);
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(nombreArchivo))){
            out.writeObject(temperaturas);
        }catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}