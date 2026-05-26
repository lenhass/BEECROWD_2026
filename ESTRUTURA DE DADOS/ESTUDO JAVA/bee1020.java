import java.util.Scanner;
public class bee1020{
	public static void main(String[] args){
	Scanner leitor = new Scanner(System.in);
	
	int num = leitor.nextInt();
	
	int ano = num/365;
	int	resto = num%365;
		
	int mes = resto/30;
		resto = resto%30;
	
	int dias = resto;

	System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",ano,mes,dias);
	
	
	}
}