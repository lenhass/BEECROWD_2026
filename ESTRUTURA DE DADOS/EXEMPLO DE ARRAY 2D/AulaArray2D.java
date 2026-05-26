public class AulaArray2D{
	public static void main(String[] args){
		int[][] x = new int[2][2];
		
		x[0][0] = 3;
		
		System.out.println(x[0][0]);
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		int[] a = {1,2,3,4,5};
		int[] b = {3,6,7};
		int[] c = {10};
		
		int[][] y = new int[3][];
		
		y[0] = a.clone();
		y[1] = b.clone();
		y[2] = c.clone();
		
		for(int i=0; i<y.length; i++){
			for(int j=0; j<y[i].length; j++){
				System.out.printf("y[%d][%d] = %d%n",i,j,y[i][j]);
			}
		}
		
		int[][] z = new int[y.length][];
		
		for(int i=0; i<y.length; i++){
			z[i] = y[y.length-i-1];
		}
		
		for(int i=0; i<z.length; i++){
			for(int j=0; j<z[i].length; j++){
				System.out.printf("z[%d][%d] = %d%n",i,j,z[i][j]);
			}
		}
			
	}
}