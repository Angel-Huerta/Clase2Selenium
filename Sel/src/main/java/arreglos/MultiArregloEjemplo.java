package arreglos;

public class MultiArregloEjemplo {

	public static void main(String[] args) {
		int arr[][] = {{2,7,9}, {3,6,1}, {7,4,2}};
		
		//La primera posici�n es el n�mero de arreglo, la segunda posici�n es la posici�n dentro del arreglo
		System.out.println(arr[2][1]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		System.out.println();
		
		//Imprimir arreglo de dos dimensiones
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); //Imprime en la misma l�nea
			}
			System.out.println();
		}

	}

}
