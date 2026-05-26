import java.util.Scanner;
import java.util.Arrays;

public class bee1175{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		int [] vetornum = new int[6];
		
		for(int i=0; i<vetornum.length; i++){
			int num = leitor.nextInt();
			vetornum[i] = num;
		}
		for(int i=0; i<vetornum.length; i++){
			int a =vetornum[vetornum.length - 1 - i];
			System.out.printf("N[%d] = %d\n", i, a);
		}
	}
}	