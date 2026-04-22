import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            suma += arr[i];
        }

        double promedio = (double) suma / arr.length;
        System.out.println("Promedio: " + promedio);
    }
}