import java.util.Scanner;

public class bee1011{
	public static void main(String[] args){
	Scanner leitor = new Scanner(System.in);
	double raio = leitor.nextDouble();
	
	double volume = (4.0/3.0)*3.14159*raio*raio*raio;
	
	System.out.printf("VOLUME = %.3f\n",volume);
	
	}
}