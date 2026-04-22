import java.util.Random;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        Thread.sleep(3000);
        System.out.println("\n Memoriza y escribe:");

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            if (num != arr[i]) {
                System.out.println("Perdiste");
                return;
            }
        }

        System.out.println("Ganaste");
    }
}
