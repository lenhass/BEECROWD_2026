import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	
	Scanner leitor = new Scanner(System.in);
	
	int n = leitor.nextInt();
		
	for(int i = 0; i<n;i++){
	String valor = leitor.next();
	String contem = leitor.next();
	//int tam = valor.length() - contem.length();	
		if (contem.length() > valor.length()){
		System.out.println("nao encaixa");
			}else if(valor.endsWith(contem)){			
			System.out.println("encaixa");
				}else{
				System.out.println("nao encaixa");		
			}	
		}
		leitor.close();
	}
}