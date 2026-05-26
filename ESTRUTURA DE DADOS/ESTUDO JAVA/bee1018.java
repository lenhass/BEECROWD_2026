import java.util.Scanner;
public class bee1018 {
	public static void main(String[] args){
	Scanner leitor = new Scanner(System.in);
	int num = leitor.nextInt();
	
	int cem = num/100;
	int	resto = num%100;
	
	int cinquenta = resto/50;
		resto = resto%50;
	
	int vinte = resto/20;
		resto = resto%20;
		
	int dez = resto/10;
		resto = resto%10;
		
	int cinco = resto/5;
		resto = resto%5;	
	
	int dois = resto/2;
		resto = resto%2;
			
	int um = resto;
	
	System.out.printf("%d\n",num);
	System.out.printf("%d nota(s) de R$ 100,00\n",cem);
	System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta);
	System.out.printf("%d nota(s) de R$ 20,00\n",vinte);
	System.out.printf("%d nota(s) de R$ 10,00\n",dez);
	System.out.printf("%d nota(s) de R$ 5,00\n",cinco);
	System.out.printf("%d nota(s) de R$ 2,00\n",dois);
	System.out.printf("%d nota(s) de R$ 1,00\n",um);
			
	}
}