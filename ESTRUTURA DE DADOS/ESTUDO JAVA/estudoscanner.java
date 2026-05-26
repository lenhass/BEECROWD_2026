import java.util.Scanner;

public class estudoscanner {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//DIGITANDO O NOME DO CABOCO
		System.out.print("DIGITE SEU NOME: ");
		String nome = leitor.nextLine();
	
		//DIGITANDO A IDADE DO CABOCO
		System.out.print("DIGITE SUA IDADE: ");
		int idade = leitor.nextInt();
	
		//DIGITANDO O TAMANHO DO CABOCO
		System.out.print("DIGITE SUA ALTURA: ");
		double altura = leitor.nextDouble();
	
		System.out.printf("OLÁ %s!, Voce tem %d anos e %.2f de altura.",nome,idade,altura); 
		System.out.printf("\nNOME: %s\nIDADE: %d\nALTURA: %.2f",nome,idade,altura);
		leitor.close();
	
	}
}
