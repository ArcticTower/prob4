import java.util.Random;

public class Main {

    public static void main(String[] args){

        System.out.println("arguments: N iterations, K all points, M good points, a1, a2");
        var random = new Random();


        double a1 = random.nextDouble();
        double a2 = random.nextDouble() + a1;
        int N = 100000;
        int K = 10;
        int M = 4;

        if(args.length>0)
            N = Integer.parseInt(args[0]);

        if(args.length>1)
            M = Integer.parseInt(args[1]);

        if(args.length>2)
            K = Integer.parseInt(args[2]);

        if(args.length>3){
            a1 = Double.parseDouble(args[3]);
            a2 = Double.parseDouble(args[4]);
            if(a2<a1){
                System.out.println("Error length!");
                System.exit(1);
            }
        }


        var line = new Line(random.nextDouble(),random.nextDouble());

        long goods=0;

        for (long i =0;i<N;i++){
            if(line.makePoints(K)==M){
                goods++;
            }

        }

        double chance = (double)goods/(double)N;


        System.out.println("iterations: "+N+"\nall points: "+K+"\ngood points: "+M+"\na1: "+a1+"\na2: "+a2 );
        System.out.println("\nChance is "+String.format("%.12f",chance));
    }

}
