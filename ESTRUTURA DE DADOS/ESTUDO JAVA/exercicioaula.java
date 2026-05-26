import java.util.Scanner;
public class exercicioaula {
	public static void main (String[] args){
	Scanner num = new Scanner (System.in);
	int numero = num.nextInt();
	int horas = num.nextInt();
	double valor = num.nextDouble();
	
	double salario = horas*valor;
	System.out.printf("Numero = %d\nSalario = $ %.2f\n",numero,salario);
	
	}	
}
