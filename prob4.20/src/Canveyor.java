import java.util.Random;

public class Canveyor {

    public int makeDetals(int N){

        int[] detals = new int[2];
        var random = new Random();
        float p;
        int std=0;

        for(int i=0; i<N;i++){
            p = random.nextFloat();
            if(p<=0.8){
                std++;
            }
        }
        return std;

    }

}
