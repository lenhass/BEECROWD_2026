import java.util.ArrayList; // 1. Importar

public class ExemploArrayList {
    public static void main(String[] args) {
        // 2. Declarar e Instanciar (ArrayList de Strings)
        ArrayList<Integer> lista = new ArrayList<>();

        // 3. Adicionar elementos
        lista.add(10);
        lista.add(20);
		lista.add(30);
		
		// 6. Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size()); // Saída: 3

        // Acessar elementos
        System.out.println(lista.get(0)); // Saída: 10
		
		// Imprimir a lista
		System.out.println("Elementos na lista: " + lista);

        // Remover elementos
        System.out.println("Elemento removido: " + lista.remove(2));
		
		// Imprimir a lista
		System.out.println("Elementos na lista: " + lista);
		
		// 6. Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size()); // Saída: 3

        lista.add(0, 40); // add(posição, valor)
		lista.add(2, 50); // add(posição, valor)
		
		// Imprimir a lista
		System.out.println("Elementos na lista: " + lista);
		
		// Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size()); // Saída: 3
    }
}
