package guiaDeRepaso;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un entero positivo: ");
		int numerito = sc.nextInt();
		if (numerito % 2 == 0) {			
			System.out.println("Es Par");
		}
		else {
			System.out.println("Es Impar1");
		}
	}
}
