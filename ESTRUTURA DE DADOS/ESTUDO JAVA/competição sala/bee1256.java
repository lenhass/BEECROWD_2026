import java.util.Scanner;
import java.util.Arrays;

public class bee1256{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ent = sc.nextInt();

        int[] pares = new int[ent];
        int[] impares = new int[ent];

        int par = 0; 
        int imp = 0; 

        for (int i = 0; i < ent; i++){
            int num = sc.nextInt();

            if (num % 2 == 0){
                pares[par] = num;
                par++;
            } else{
                impares[imp] = num;
                imp++;
            }
        }
        Arrays.sort(pares,0,par);
        Arrays.sort(impares,0,imp);
		
        for (int i = 0; i < par; i++) {
            System.out.println(pares[i]);
        }

        for (int i = imp - 1; i >= 0; i--) {
            System.out.println(impares[i]);
     	 }
    }
		
}