public class Exemplos{
	public static void main(String[] args){
		// Strings são tipos imutáveis (não podem ser alterados). Alterações
		// sobre uma String criam e retornam uma nova String.
		
		String s1 = "Olá, Mundo!!!";
		String s2 = "undo";
		String s3 = "123412341234";
		

		// Concatenação de Strings
		System.out.println("// Concatenação de Strings s1+s2");
		System.out.println(s1 + " " + s2);  // Olá, Mundo!!! undo
		
		// Comprimento de uma string (número de caracteres)
		System.out.println("// Comprimento de uma string (número de caracteres)");
		System.out.println(s1.length()); // 13
		System.out.println(s2.length()); // 4
		System.out.println(s3.length()); // 12
		
		// Convertendo string para maiúsculas e minúsculas
		System.out.println("// Convertendo string para maiúsculas e minúsculas");
		System.out.println(s1.toUpperCase()); // OLÁ, MUNDO!!!
		System.out.println(s1.toLowerCase()); // olá, mundo!!!
		
		// Dividindo uma string em partes (split)
		System.out.println("// Dividindo uma string em partes (split) - s1");
		String[] s4 = s1.split(" ");
		for(int i=0; i<s4.length; i++) System.out.println(s4[i]);
		//Olá,
		//Mundo!!!
		
		System.out.println("Dividindo s3");
		String[] s5 = s3.split("23");
		for(String s:s5) System.out.println(s);
		//1
		//41
		//41
		//4
		
		// Acessando caracteres individuais
		System.out.println("// Acessando caracteres individuais");
		System.out.println(s1.charAt(0));  // O
  		System.out.println(s1.charAt(1));  // l 
		System.out.println(s1.charAt(2));  // á
		System.out.println(s1.charAt(10)); // !
		
		// Substring (extraindo parte da string)
		System.out.println("// Substring(ini, fim) (extraindo parte da string)");
		System.out.println(s1.substring(0,5)); // Olá,
		System.out.println(s1.substring(5,7)); // Mu
		System.out.println(s1.substring(7));   // ndo!!!
		
		// Verificando se uma string contém outra
		System.out.println("// Verificando se uma string contém outra");
		System.out.println(s1.contains("Mundo"));  // true
		System.out.println(s1.contains("Mudo"));   // false
		
		// Verificando se uma string começa ou termina com outra
		System.out.println("// Verificando se uma string começa ou termina com outra string");
		System.out.println(s1.startsWith("Olá"));               // true
		System.out.println(s1.startsWith("olá"));               // false
		System.out.println(s1.toLowerCase().startsWith("olá")); // true
		System.out.println(s1.endsWith("!"));                   // true
		System.out.println(s1.endsWith("?"));                   // false
		
		// Verificando a posição de uma substring
		System.out.println("// Verificando a posição de uma substring");
		System.out.println(s1.indexOf("mundo"));                // -1 (não localizou)
		System.out.println(s1.toLowerCase().indexOf("mundo"));  // 5
		System.out.println(s3.indexOf("234"));                  // 1
		System.out.println(s3.indexOf("234", 2));               // 5 (procura a partir da posição 2)
		System.out.println(s3.lastIndexOf("1234"));             // 8
		

		// Modificando parte da string
		System.out.println("// Modificando parte da string");
		System.out.println(s1.replace("Mundo", "Universo"));   // Olá, Universo!!!
		System.out.println(s3.replace("1234", "abcd"));        // abcdabcdabcd 
		System.out.println(s3.replaceFirst("1234", "abcd"));   // abcd12341234
		
		
		
	}
}