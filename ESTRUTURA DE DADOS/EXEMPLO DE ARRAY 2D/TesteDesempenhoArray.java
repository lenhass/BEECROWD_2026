public class TesteDesempenhoArray{
	public static void main(String[] args){
		int[][] x = new int[10000][10000];
			
		long start = System.currentTimeMillis();
		
		for(int i=0; i<x.length; i++)
			for(int j=0; j<x.length; j++)
				x[i][j] = i+j;
		
		/*for(int j=0; j<x.length; j++)
			for(int i=0; i<x.length; i++)
				x[i][j] = i+j; */
		
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		
		System.out.println(timeElapsed);
	}
}