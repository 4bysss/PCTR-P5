class CalcuMatri implements Runnable{
  private int[][] vec1,vec2;
  private int [][]res;
  private int inicio,fini;
  public CalcuMatri(int[][]v1,int[][]v2,int[][] r,int ini,int fin){vec1=v1;vec2=v2;res=r;inicio=ini;fini=fin;}
  public void run(){
    for (int i = inicio; i < fini; i++) {
      for (int j = 0; j < res.length; j++) {
        for (int alpha = 0; alpha < res.length; alpha++) {
          res[i][j] += (vec1[i][alpha]*vec2[alpha][j]);
        }
        
      }
      
    }
   
    
  }
}
