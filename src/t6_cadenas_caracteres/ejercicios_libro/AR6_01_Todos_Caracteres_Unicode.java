package t6_cadenas_caracteres.ejercicios_libro;

public class AR6_01_Todos_Caracteres_Unicode {
    public static void main(String[] args) {
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u" + xxxx + " " + (char) codePoint);
        }
    }
}