public class resImagenPar implements Runnable {

    private int [][]foto;
    private int inicio,fini;

    public resImagenPar(int[][]image,int ini,int fin){foto = image;inicio = ini;fini = fin;}

   public  void run(){
    if(inicio==0){inicio = inicio +1;}
    for (int i = inicio; i < fini; i++) {
           for (int j = 1; j < foto.length-1; j++) {
                foto[i][j] =Math.abs((4*foto[i][j] - foto[i+1][j] - foto[i][j+1] - foto[i-1][j] - foto[i][j-1])/8);
             }
        }

   };
    
}
