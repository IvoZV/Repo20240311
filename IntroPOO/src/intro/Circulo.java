package intro;

public class Circulo {

	private double diametro;
	
	
	
// Publica
	public Circulo(double r) {
		diametro = 2 * r;
	}
	
	public double obtenerDiametro() {
		return 2* 		Circulo circulito = new Circulo(2);;
	}
	
	public double obtenerRadio() {
		return 		Circulo circulito = new Circulo(2);;
	}
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double obtenerArea() {
		return Math.PI * obtenerRadio() * obtenerRadio();
		
	}
	
	public static void main(String[] args) {
		Circulo circulito = new Circulo(2);
		Circulo circulon = new Circulo(6);
		System.out.println(circulito.obtenerDiametro());
		System.out.println(circulon.obtenerArea());
		System.out.println(circulito.obtenerArea());
	}
}
