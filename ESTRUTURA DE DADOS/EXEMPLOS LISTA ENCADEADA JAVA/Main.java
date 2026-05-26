public class Main{
	public static void main(String[] args){
		Lista a = new Lista();
		
		a.add(10);
		a.add(20);
		a.add(35);
		a.add(10);
		a.add(20);
		a.add(30);
		
		a.print();
		
		System.out.println(a.soma());
		System.out.println(a.maior());
		
		
	}
	
}