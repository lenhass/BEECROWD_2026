import java.util.Scanner;

public class bee2840{
	public static void main(String[] args){
	
	Scanner leitor = new Scanner(System.in);
	
	// v = (4/3)*(pi*r*r*r) -- formula
	
	int r = leitor.nextInt();
	int L = leitor.nextInt();
	double pi = 3.1415;
	
	double volume = (4.0/3.0) * pi * Math.pow(r, 3.0);
	
	double b = Math.floor(L/volume); 
	
	
	System.out.printf("%.0f\n",b);
	}
}