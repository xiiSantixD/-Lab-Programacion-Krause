import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un numero: ");
            arr[i] = sc.nextInt();
            suma += arr[i];
        }

        System.out.println("Suma: " + suma);
    }
}
