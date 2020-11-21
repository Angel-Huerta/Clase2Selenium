package herencia;

public class Lados3 {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		t1.base = 5.0;
		t1.altura = 5.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("Información para T1: ");
		t1.MostrarEstilo();
		t1.mostrarDimension();
		System.out.println("El área del triangulo es: " + t1.area());
		
		System.out.println();
		
		t2.base = 13.0;
		t2.altura = 7.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("Información para T2: ");
		t2.MostrarEstilo();
		t2.mostrarDimension();
		System.out.println("El área del triangulo es: " + t2.area());

	}

}
