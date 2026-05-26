import java.util.Scanner;
public class bee1021{
	public static void main(String[] args){
	Scanner leitor = new Scanner(System.in);

        double num = leitor.nextDouble();

        double cem = (int) (num / 100.00);
        double resto = num % 100.00;

        double cinquenta = (int) (resto / 50.00);
        resto = resto % 50.00;

        double vinte = (int) (resto / 20.00);
        resto = resto % 20.00;

        double dez = (int) (resto / 10.00);
        resto = resto % 10.00;

        double cinco = (int) (resto / 5.00);
        resto = resto % 5.00;

        double dois = (int) (resto / 2.00);
        resto = resto % 2.00;

        double um = (int) (resto / 1.00);
        resto = resto % 1.00;

        resto = resto + 0.00001;

        double cinqcent = (int) (resto / 0.50);
        resto = resto % 0.50;

        double vintecincocent = (int) (resto / 0.25);
        resto = resto % 0.25;

        double dezcent = (int) (resto / 0.10);
        resto = resto % 0.10;

        double cincocent = (int) (resto / 0.05);
        resto = resto % 0.05;

        double umcent = Math.round(resto / 0.01);

        System.out.printf(
            "NOTAS:\n%.0f nota(s) de R$ 100.00\n%.0f nota(s) de R$ 50.00\n%.0f nota(s) de R$ 20.00\n%.0f nota(s) de R$ 10.00\n%.0f nota(s) de R$ 5.00\n%.0f nota(s) de R$ 2.00\n",
            cem, cinquenta, vinte, dez, cinco, dois
        );

        System.out.printf(
            "MOEDAS:\n%.0f moeda(s) de R$ 1.00\n%.0f moeda(s) de R$ 0.50\n%.0f moeda(s) de R$ 0.25\n%.0f moeda(s) de R$ 0.10\n%.0f moeda(s) de R$ 0.05\n%.0f moeda(s) de R$ 0.01\n",
            um, cinqcent, vintecincocent, dezcent, cincocent, umcent
        );

        leitor.close();
    }
}
