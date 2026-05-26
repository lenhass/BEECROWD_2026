import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] pares = new int[N];
        int[] impares = new int[N];

        int p = 0; // contador de pares
        int i = 0; // contador de ímpares

        // Separar números
        for (int j = 0; j < N; j++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares[p] = num;
                p++;
            } else {
                impares[i] = num;
                i++;
            }
        }

        // Ordenar
        Arrays.sort(pares, 0, p);
        Arrays.sort(impares, 0, i);

        // Mostrar pares
        for (int j = 0; j < p; j++) {
            System.out.println(pares[j]);
        }

        // Mostrar ímpares ao contrário
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(impares[j]);
        }
    }
}