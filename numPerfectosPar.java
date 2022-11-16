import java.util.concurrent.*;

public class numPerfectosPar implements Callable<Integer> {
    private int inicio,fin;
    public numPerfectosPar(int ini,int fini){
        inicio = ini;
        fin = fini;
    }
    public Integer call(){
        Integer resul=0;
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
}
