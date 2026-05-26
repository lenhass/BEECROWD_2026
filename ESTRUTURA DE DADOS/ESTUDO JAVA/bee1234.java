import java.util.Scanner;
public class bee1324{
	public static void main(String [] args){
	Scanner leitor = new Scanner(System.in);
	
	while(leitor.hasNextLine()){
	
	StringBuilder frasepronta = new StringBuilder();
	Boolean proximaMaiuscula = true;
	String frase = leitor.nextLine();
		
		for(int i = 0; i<frase.length(); i++){
		char letra = frase.charAt(i);
		
		if(letra ==' '){
			frasepronta.append(letra);
		}else if (proximaMaiuscula == true){
				letra = Character.toUpperCase(letra);
				proximaMaiuscula = false;
				frasepronta.append(letra);
			}else{
				letra = Character.toLowerCase(letra);
				proximaMaiuscula = true;
				frasepronta.append(letra);
			}
		}		
		System.out.println(frasepronta.toString());
	}
	leitor.close();
	}
}