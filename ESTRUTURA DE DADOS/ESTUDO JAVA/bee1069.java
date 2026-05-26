/*import java.util.LinkedList;
import java.util.Scanner;

public class bee1069{
	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		int quant = leitor.nextInt();
		
		for (int i = 0; i < quant; i++){
			LinkedList<String> listadiamente = new LinkedList<>();
		}
		
	}
}*/

import java.util.Scanner;

public class bee1069 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < N; i++) {
            String linha = leitor.nextLine();

            int abertos = 0;
            int diamantes = 0;

            for (int j = 0; j < linha.length(); j++) {
                char c = linha.charAt(j);

                if (c == '<') {
                    abertos++;
                } else if (c == '>') {
                    if (abertos > 0) {
                        diamantes++;
                        abertos--;
                    }
                }
            }
			System.out.println(diamantes);
		}
		//System.out.println(diamantes);
        leitor.close();
    }
}