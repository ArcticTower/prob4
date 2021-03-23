import java.util.Random;

public class Main {

    public static void main(String[] args){
        long N = 10000;
        if(args.length>0){
            N = Long.parseLong(args[0]);
        }

        var random = new Random();

        int asks = 22500;
        int bad = 4620;//<=

        long not=0;
        long goods=0;

        //p 0.2
        for (int j=0;j<N;j++) {
            for (int i = 0; i < asks; i++) {
                if (random.nextFloat() <= 0.2) {

                    not++;
                    if(not>bad){

                        break;
                    }

                }
            }
            if(not <=bad){
                goods++;
            }
            not =0;
        }


        double chance = (double) goods/(double) N;
        System.out.println("Chance is "+String.format("%.8f",chance));




    }

}
