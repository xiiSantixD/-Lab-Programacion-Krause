import java.util.Random;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        String[] palabras = {"java", "codigo", "array"};
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        String palabra = palabras[r.nextInt(3)];
        char[] progreso = new char[palabra.length()];

        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        while (!String.valueOf(progreso).equals(palabra)) {
            System.out.println(progreso);
            System.out.print("Letra: ");
            char letra = sc.next().charAt(0);

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    progreso[i] = letra;
                }
            }
        }

        System.out.println("Ganaste Palabra: " + palabra);
    }
}
