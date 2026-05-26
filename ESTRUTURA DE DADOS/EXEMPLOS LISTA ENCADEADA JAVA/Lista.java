public class Lista{
	Node head, tail;
	
	public Lista(){
		head = tail = null;
	}
	
	public void add(int valor){
		Node aux = new Node(valor);
		if(head!=null){
			tail.next = aux;
			tail = aux;
		}
		else{
			head = tail = aux;
		}
	}
	
	public void print(){
		Node aux = head;
		while(aux!=null){
			System.out.print(aux.data + " ");
			aux = aux.next;
		}
		System.out.println();
	}
	
	public int soma(){
		Node aux = head;
		int soma=0;
		while(aux!=null){
			soma = soma + aux.data;
			aux = aux.next;
		}
		return soma;
	}
	
	public int maior(){
		Node aux = head;
		int maior=-999999;
		while(aux!=null){
			if(aux.data>maior){
				maior = aux.data;
			}
			aux = aux.next;
		}
		return maior;
	}
}