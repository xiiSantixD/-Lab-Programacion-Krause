public class Ejercicio13 {
    public static void main(String[] args) {
        String[] nombres = {"Santiago", "Luis", "Jorge", "Mathias"};
        double[] notas = {7.5, 4.0, 6.0, 8.2};

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] >= 6) {
                System.out.println(nombres[i] + " Aprobado");
            } else {
                System.out.println(nombres[i] + " Reprobado");
            }
        }
    }
}
