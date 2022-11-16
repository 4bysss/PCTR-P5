public class numPerfectos {
    static public int Perfectos(int inicio, int fin){
        int resul=0;
        int calcParcial = 0;
        for (int i = inicio; i <=fin ; i++) {
            for (int j = 1; j <= i/2; j++) {
                if(i%j==0){
                    calcParcial+=j;
                }
            }
            if(calcParcial==i){
                ++resul;
            }
            calcParcial = 0;
        }
        return resul;
    } 
    public static void main(String[] args) {
        System.out.println(Perfectos(1,1000));

    }
}
