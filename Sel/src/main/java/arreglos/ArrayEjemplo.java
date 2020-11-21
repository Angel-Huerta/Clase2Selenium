package arreglos;

public class ArrayEjemplo {

	public static void main(String[] args) {
		int intArray[];
		int [] intArray2;
		short shorArray[];
		
		String array[]; //Declaración del arreglo
		array = new String [6]; //Asignando memoria para los elementos del arreglo
		
		array[0] = "Cero";
		array[1] = "Uno";
		array[2] = "Dos";
		array[3] = "Tres";
		array[4] = "Cuatro";
		array[5] = "Cinco";
		
		//System.out.println("Elemento en la posición 1: " + array[1];
		//System.out.println("Elemento en la posición 5: " + array[5];
		
		for(int i = 0; i < array.length; i++) { //arr.length calcula la longitud del arreglo
			System.out.println("Elemento en el índice " + i + ": " + array[i]);
		}
		
		int[] intArrayDinamico = new int[] {0,1,2,5,4,3}; //Arreglo dinámico, no especificamos memoria

	}

}
