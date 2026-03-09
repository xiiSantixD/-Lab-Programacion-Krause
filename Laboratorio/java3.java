package java2;

import java.util.*;

public class java3 {
	 public static void main(String[] args) {
		 
	 
	Scanner scanner = new Scanner(System.in);
	int suma = 0;
	int nuevo = 0;
	int cont = 0;

    	while (suma <= 19) {

        System.out.print("Ingrese un numero ");
        nuevo = scanner.nextInt();
		
        if (suma <= 19) {
        	suma = suma + nuevo;
        	cont++;
        }

    	}
		System.out.println("La suma es: " + suma);
		double prome = (double) suma / cont;
		System.out.println("El promedio es " + prome);
		scanner.close();
    	} 
    }


