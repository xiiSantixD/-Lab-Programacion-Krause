public class Ejercicio12 {
    public static void main(String[] args) {
        int[] arr = {15, 2, 8, 99, 3, 7, 1, 50};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Mayor: " + max);
        System.out.println("Menor: " + min);
    }
}
