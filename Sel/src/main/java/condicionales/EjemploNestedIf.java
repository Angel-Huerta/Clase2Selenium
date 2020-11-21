package condicionales;

public class EjemploNestedIf {

	public static void main(String[] args) {
		int temperatura = 37;
		
		if(temperatura > 15) {
			if(temperatura > 25) {
			System.out.println("Saca las chelas");
		}else {
			System.out.println("Un chocolate caliente");
		}
	}else {
		System.out.println("Toma mucha agua");
		}

	}

}
