import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import javax.naming.InitialContext;

public class mainPerPar {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int principio = Integer.parseInt(args[0]);
        int finaleo = Integer.parseInt(args[1]);
        int dif = finaleo - principio;
        int cores = Runtime.getRuntime().availableProcessors();
        int i = 0;
        Integer result = 0;
//77o7sd
        ExecutorService cosa = Executors.newFixedThreadPool(cores);
        List<Future<Integer>>futuro = new ArrayList<Future<Integer>>();
        for(i = 0;i<cores-1;i++){
            futuro.add(cosa.submit(new numPerfectosPar((principio+(dif/cores)*i),(principio+(dif/cores)*(i+1)))));


        }
        System.out.println((principio+(dif/cores)*(i)));
      futuro.add( cosa.submit( new numPerfectosPar((principio+(dif/cores)*(i)),finaleo)));
      for (int j = 0; j < futuro.size(); j++) {
        result += futuro.get(j).get();
      }
      System.out.println(result);
      cosa.shutdown();

    }
    
}
