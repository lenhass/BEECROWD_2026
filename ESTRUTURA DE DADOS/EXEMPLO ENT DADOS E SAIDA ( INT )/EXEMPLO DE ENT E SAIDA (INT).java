import java.util.Scanner;

Public class EXEMPLOS DE ENT E SAIDA (INT){
	public static void main(String[] args){
		Scanner sc = novo Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int a=sc.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o valor de b: ");
		int b=sc.nextInt();
		
		int c;
		
		c=a+b;
		
		System.out.println(a+" + " + b + " = "+c);
		
		System.out.printf("%d + %d = %d%n", a,b,c);
		//System.out.println();
		// agora com flutuar
		
		System.out.print("Digite o valor de af: ");
		float af=sc.nextFloat();
		System.out.print("Digite o valor de bf: ");
		float bf=sc.nextFloat();
		
		flutuar cf;
		
		cf=af+bf;
		
		System.out.println(af+" + " + bf + " = "+cf);
		
		System.out.printf("%.2f + %.2f = %.2f", af,bf,cf);
	}
}