import java.util.Random;

public class Line {
    private double a1;
    private double a2;
    private double length;
    private double k;

    Line(double a1, double a2){
        setA1(a1);
        setA2(a2);
        length = a1+a2;
        k = (double) 1/(double) length;
    }

    public void setA1(double a){
        a1 = a;
    }

    public void setA2(double a){
        a2 = a;
    }

    public long makePoints(long N){

        double cut = (double) k*(double) a1;
        var random = new Random();
        long googs =0;

        for (long l=0;l<N;l++){
            if(random.nextDouble()<=cut)
                googs++;
        }

        return googs;
    }

}
