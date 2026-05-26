import java.util.Scanner;
public class bee1009{
	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		double salario = leitor.nextDouble();
		double vendas = leitor.nextDouble();
		double total = salario + ((vendas*15)/100);
		
		System.out.printf("TOTAL = %.2f",total);
	
	
	
	}
}