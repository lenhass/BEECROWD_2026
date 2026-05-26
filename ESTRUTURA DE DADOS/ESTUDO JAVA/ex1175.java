import java.util.Scanner;
import java.util.Arrays;

public class ex1175{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int tam = 20;
	int [] vetornum = new int[tam];
	int [] vetortrocado = new int[tam];
	
	
		for(int i=0; i < vetornum.length; i++){
			int num = sc.nextInt();
			vetornum[i] = num;
			for(int j = 0; j < vetornum.length; j++){
			vetortrocado[j] = vetornum[ 19 - i];
			System.out.println("N["+ j+"]" + "=" + vetortrocado[j] );
			}
		}
	}	
}