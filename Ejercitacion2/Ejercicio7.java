import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.print("Elige piedra, papel o tijera: ");
        String usuario = sc.nextLine();

        String pc = opciones[r.nextInt(3)];

        System.out.println("PC eligio: " + pc);

        if (usuario.equals(pc)) {
            System.out.println("Empate");
        } else if (
            (usuario.equals("piedra") && pc.equals("tijera")) ||
            (usuario.equals("papel") && pc.equals("piedra")) ||
            (usuario.equals("tijera") && pc.equals("papel"))
        ) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
