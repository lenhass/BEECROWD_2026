import java.util.Scanner;
public class bee1019{
	public static void main(String[] args){
	Scanner leitor = new Scanner (System.in);
	int num = leitor.nextInt();
	
	int horas = num/3600;
	int resto = num%3600;
	
	int minutos = resto/60;
		resto = resto%60;
		
	int segundos = resto;
	
	System.out.printf("%d:%d:%d",horas,minutos,segundos);
	
	
	
	}
}