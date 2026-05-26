public class Principal{
    public static void main(String args[]){
        int x[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };
        int y[][] = new int[10000][10000];
        
        int z[][] = x.clone();
        
        System.out.println(y);
                    
        //System.out.println(x[0][1]);
        
        int c = 0;
        long tempoInicial = System.currentTimeMillis();
        
        for(int i=0; i<y.length; i++)
            for(int j=0; j<y[i].length; j++){
                c = c + y[j][i];
            }
        System.out.println("o metodo executou em " + (System.currentTimeMillis() - tempoInicial));
    }
}
