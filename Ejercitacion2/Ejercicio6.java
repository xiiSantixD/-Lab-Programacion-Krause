import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int numero = r.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el numero: ");
            intento = sc.nextInt();

            if (intento > numero) {
                System.out.println("Menor");
            } else if (intento < numero) {
                System.out.println("Mayor");
            }

        } while (intento != numero);

        System.out.println("Ganaste");
    }
}
