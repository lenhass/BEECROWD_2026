import java.util.Arrays;

public class MainClassArray{
	public static void main(String[] args){
		int[] numeros = {50, 10, 30, 20, 40, 90, 15, 60, 50};

		// imprime os valores do array numeros
		System.out.println(Arrays.toString(numeros));

		// Ordena o array original (in-place)
		Arrays.sort(numeros);
		//Array.sort(array, inicio, fim); condição do array

		// imprime os valores do array numeros
		System.out.println(Arrays.toString(numeros));

		// busca binária
		int indice = Arrays.binarySearch(numeros, 40);

		System.out.println("O número 40 está na posição: " + indice);

		// Preenchimento (Filling)
		int[] mapa = new int[10];
		Arrays.fill(mapa, -1); // Preenche todos os 10 espaços com -1
		System.out.println(Arrays.toString(mapa));

		// Comparação e cópia
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};

		boolean saoIguais = Arrays.equals(arr1, arr2); // Retorna true

		if(Arrays.equals(arr1, arr2)) System.out.println("arr1 e arr2 são iguais");
		else System.out.println("arr1 e arr2 são diferentes");

		// Criando uma cópia exata ou maior
		int[] copia = Arrays.copyOf(arr1, 5); // Cria [1, 2, 3, 0, 0]
		System.out.println(Arrays.toString(copia));


	}

}