import java.util.Scanner;

public class bee1010{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		//ENTRADA
		int peça1 = leitor.nextInt(); int qtd1 = leitor.nextInt(); double valor1 = leitor.nextDouble();
		int peça2 = leitor.nextInt(); int qtd2 = leitor.nextInt(); double valor2 = leitor.nextDouble();
		//CALCULO
		double total = (qtd1*valor1) + (qtd2*valor2);
		//INFORMADO NA TELA
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
	}
}