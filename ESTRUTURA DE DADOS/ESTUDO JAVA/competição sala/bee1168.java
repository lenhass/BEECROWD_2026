import java.util.Scanner;
public class bee1168{
	public static void main(String[] args){
	Scanner leitor = new Scanner(System.in);
	int [] vetc = {6,2,5,5,4,5,6,3,7,6};
	int led = 0;
	int quant = leitor.nextInt();
		for(int i=0;i<quant;i++){
			String numero = leitor.nextLine();
			for(int j=0; j<numero.length();j++){			
			led += vetc[Character.getNumericValue(numero.charAt(j))];			
			}
			System.out.printf("%d leds\n",led);	
		}		
		
	}
}