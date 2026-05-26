import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        // Cria uma LinkedList vazia de Integer
        LinkedList<Integer> listaDeInteiros = new LinkedList<>();

        // Adiciona elementos à lista
        listaDeInteiros.add(10);        // Adiciona ao final
        listaDeInteiros.add(20);       // Adiciona ao final
		listaDeInteiros.add(30);       // Adiciona ao final
		
		// Imprime a lista
        System.out.println("Elementos na lista: " + listaDeInteiros);
		
        listaDeInteiros.addFirst(50); // Adiciona ao início

        // Adiciona em uma posição específica
        listaDeInteiros.add(1, 35); // add(posição, valor);

        // Imprime a lista
        System.out.println("Elementos na lista: " + listaDeInteiros);

        // Remove um elemento
        System.out.println("Elemento removido: " + listaDeInteiros.remove(2)); //remove o valor na posição 2

        // Acessa um elemento (operação mais lenta em LinkedList)
        Integer primeiroInteiro = listaDeInteiros.get(0); //

        System.out.println("Primeiro Inteiro: " + primeiroInteiro);
        System.out.println("Lista após remoção: " + listaDeInteiros);
    }
}
