
import java.util.Scanner;
public class bee1013{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt(); 
		int B = leitor.nextInt(); 
		int C = leitor.nextInt(); 
		
		int maiorAB = ((A+B)+Math.abs(A-B))/2;
		int maiortodos = ((maiorAB+C)+Math.abs(maiorAB-C))/2;
		
		System.out.printf("%d eh o maior\n",maiortodos);
	
	}
}


