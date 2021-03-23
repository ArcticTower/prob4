public class Main {

    public static void main(String[] args){

        long N = 100000;
        if(args.length>0){
            N = Long.parseLong(args[0]);
        }


        long goods=0;
        var conv = new Canveyor();

        for(int i =0;i<N;i++){
            if(conv.makeDetals(900)==750)
                goods++;
        }

        double chance = (double) goods/(double) N;
        System.out.println("Chance is "+ String.format("%.8f",chance) );

    }

}
