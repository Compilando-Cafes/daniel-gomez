package t8_herencia.entregas.ej5_empresa_alimentaria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear dos frescos, tres refrigerados, 2 congelados por agua, 2 por aire y 1 por nitrógeno
        Fresco fresco1 = new Fresco("Melocotón", LocalDate.of(2025, 3, 15), 1115, LocalDate.of(2025, 1, 15), "España");
        Fresco fresco2 = new Fresco("Sandía", LocalDate.of(2025, 4, 12), 1111, LocalDate.of(2025, 2, 15), "Francia");
        Refrigerado refrigerado1 = new Refrigerado("Queso", LocalDate.of(2025, 6, 1), 112, LocalDate.of(2024, 12, 30), "Marruecos", 34445, 25);
        Refrigerado refrigerado2 = new Refrigerado("Chorizo", LocalDate.of(2025, 7, 2), 11223, LocalDate.of(2024, 10, 19), "Marruecos", 34445, 25);
        Refrigerado refrigerado3 = new Refrigerado("Flan", LocalDate.of(2025, 8, 3), 11256, LocalDate.of(2024, 8, 20), "Marruecos", 34445, 25);
        CongeladoPorAgua congeladoPorAgua1 = new CongeladoPorAgua("Cocido", LocalDate.of(2025, 3,20), 233, LocalDate.of(2025, 2, 10), "España", 10, 5);
        CongeladoPorAgua congeladoPorAgua2 = new CongeladoPorAgua("Fabada", LocalDate.of(2025, 4,15), 23334, LocalDate.of(2025, 1, 11), "España", 15, 6);
        CongeladoPorAire congeladoPorAire1 = new CongeladoPorAire("Pizza", LocalDate.of(2025, 12, 31), 3445, LocalDate.of(2023, 5,15), "Italia", 5, 20, 30, 10, 40);
        CongeladoPorAire congeladoPorAire2 = new CongeladoPorAire("Lasaña", LocalDate.of(2026, 12, 3), 344545, LocalDate.of(2020, 5,15), "Italia", 3, 5, 35, 30, 30);
        CongeladoPorNitrogeno congeladoPorNitrogeno1 = new CongeladoPorNitrogeno("Helado de chocolate y fresa", LocalDate.of(2028, 5,3), 3332, LocalDate.of(2024, 4,5), "Suecia", 0, "Nitrógeno", 2000);

        System.out.println(fresco1);
        System.out.println(fresco2);
        System.out.println(refrigerado1);
        System.out.println(refrigerado2);
        System.out.println(refrigerado3);
        System.out.println(congeladoPorAgua1);
        System.out.println(congeladoPorAgua2);
        System.out.println(congeladoPorAire1);
        System.out.println(congeladoPorAire2);
        System.out.println(congeladoPorNitrogeno1);
    }

}