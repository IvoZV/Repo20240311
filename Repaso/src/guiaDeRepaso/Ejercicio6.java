package guiaDeRepaso;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Valor de A");
		int a = sc.nextInt();
		System.out.println("Ingrese Valor de B");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("A es mayor\nB es menor");
		} else {
			System.out.println("B es mayor\nA es menor");
		}

	}

}
