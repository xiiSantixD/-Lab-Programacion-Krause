import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        String[] palabras = {"java", "programa", "computadora"};
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        String palabra = palabras[r.nextInt(3)];
        char[] progreso = new char[palabra.length()];

        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        while (!String.valueOf(progreso).equals(palabra)) {
            System.out.println(progreso);
            char letra = sc.next().charAt(0);

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    progreso[i] = letra;
                }
            }
        }

        System.out.println("Ganaste");
    }
}
