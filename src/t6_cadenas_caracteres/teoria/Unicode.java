package t6_cadenas_caracteres.teoria;

public class Unicode {
    public static void main(String[] args) {

        int a = 'a';
        int b = '\u0061';
        char c = 97;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println((char) ('a' + 1));


        System.out.println((int)'e' + " " + (int) 'A' + " " + (int) 'a');
        int letraMayuscula = (int)'e' +  (int)'A' - (int)'a';
        System.out.println((char)letraMayuscula);
        System.out.println((int)'E');

        // Almacenar un hexadecimal
        int codePoint = 0xFFFF;

        for (int i =0x0000; i<=0xFFFF;i++) {
            System.out.println(i + ": " +Integer.toHexString(i) + " " + (char)i);
        }

        for (int i =0x0000; i<=0xFFFF;i++) {
            if (Character.isLetterOrDigit(i)&& !Character.isISOControl(i)) {
                System.out.printf("U+%04X %c ", (int)i, i);
            }
        }

        }
}