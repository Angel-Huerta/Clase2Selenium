package clasesYobjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		//Asignamos valores
		minivan.pasajeros = 13;
		minivan.capacidad = 20;
		minivan.kmh = 25;
		
		//Calculamos el rango
		rango = minivan.capacidad * minivan.kmh;
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros, con un rango de " + minivan.kmh + " kilometros");

	}

}
