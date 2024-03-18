package guiaDeRepaso2;

//Implementar una función que reciba como parámetro un arreglo de enteros
//muestre por pantalla cuántas veces se repite cada uno.
//El arreglo no está ordenado.
//Se garantiza que los números están comprendidos entre 0 y 100.

public class Ejercicio26 {

	public static void  frecuencias (int [] v) {
		int [] frecuencias = new int[101];
			for (int i=0; i <v.length; i++) {
				frecuencias[v[i]]++;
			}
			for (int i=0; i < frecuencias.length; i++) {
				if (frecuencias[i]!=0) { 
					System.out.println("el valor " + i + " Se repite " + frecuencias[i] + " veces");
				}
			}
		}
	
	public static void main(String[] args) {
		int [] arreglo = {1,1,2,3,2};
		frecuencias(arreglo);
		int[] maligno = {};
		frecuencias(maligno);


	}

}
