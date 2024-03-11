package guiaDeRepaso;

public class Ejercicio5 {

	public static void main(String[] args) {
		int fecha = 20241103;
		int anio = fecha/10000;
		int dia = fecha % 100;
		int mes = fecha / 100 % 100;
		System.out.println("Año: " + anio + ", Mes: " + mes +", Dia: " +dia);
	}

}
