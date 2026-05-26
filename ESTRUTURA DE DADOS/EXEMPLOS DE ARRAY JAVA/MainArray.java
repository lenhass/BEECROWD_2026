public class MainArray{
	public static void main(String[] args){
		// Forma 1: Declarar e depois instanciar com tamanho 5
		int[] idades = new int[5]; 

		// Forma 2: Inicialização direta (o Java entende que o tamanho é 3)
		String[] nomes = {"Alice", "Bob", "Charlie"};


		idades[0] = 19;  // a posição "zero" é a primeira
		idades[1] = 20;
		idades[4] = 18;  // a posição "quatro" é a última (0 a 4)

		// percorrendo arrays (loop)

		// loop "for" tradicional
		for(int i=0; i<idades.length; i++){
			System.out.println(idades[i]);
		}

		// loop "for each"
		for (String nome : nomes) {
	    	System.out.println("Nome: " + nome);
		}


		// Arrays multidimensionais

		// Uma matriz 3x3 (3 linhas e 3 colunas)
		int[][] matriz = {
    			{1, 2, 3},
    			{4, 5, 6},
    			{7, 8, 9}
		};

		// Acessando o número 5 (linha 1, coluna 1)
		System.out.println(matriz[1][1]);

		// loop "for" sobre elementos da matriz
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				System.out.print(matriz[i][j] + " - ");
			}
			System.out.println();
		}

	}
}