package guiaDeRepaso;

public class Ejercicio7 {

	public static void main(String[] args) {
		int mayor, medio, menor =0;
		int a = 1;
		int b = 3;
		int c = 2;

		mayor = a;
		if (b > mayor) {
			medio = a;
			mayor = b;
		} else
			medio = b;

		if (c > mayor) {
			menor = medio;
			medio = mayor;
			mayor = c;
		} else if (c > medio)
			menor = medio;
		medio = c;
	
	System.out.println("Mayor: " + mayor);
	System.out.println("Medio: " + medio);
	System.out.println("Menor: " + menor);
	}

}
