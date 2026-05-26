import java.util.Scanner;

public class bee1012{
	public static void main(String[] args){
	Scanner leitor = new Scanner(System.in);
	double A = leitor.nextDouble();
	double B = leitor.nextDouble();
	double C = leitor.nextDouble();
	
	double atriangulo = ((A*C)/2);
	double acirculo = (3.14159*C*C);
	double atrapezio = (((A+B)*C)/2);
	double aquadrado = B*B;
	double aretangulo = A*B;
	
	System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",atriangulo,acirculo,atrapezio,aquadrado,aretangulo);
	
	}
}