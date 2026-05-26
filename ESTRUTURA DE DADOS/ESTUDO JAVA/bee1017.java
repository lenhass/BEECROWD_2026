import java.util.Scanner;
public class bee1017{
	public static void main(String[] args){
	
	Scanner leitor = new Scanner(System.in);
	
	int tempo = leitor.nextInt();
	int vel = leitor.nextInt();
	
	double autonomia = (vel*tempo)/12.00;
	
	System.out.printf("%.3f\n", autonomia);
	
	}
}