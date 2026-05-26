import java.util.Locale;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Locale.setDefault(Locale.US);
	Scanner leitor = new Scanner (System.in);
	int distancia = leitor.nextInt();
	double litros = leitor.nextDouble();
	double autonomia = distancia/litros;
	System.out.printf("%.3f km/l\n", autonomia);
	}
}