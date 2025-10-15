

public class Tiling_Problem {


    public static int tiling(int n){

         // base case 

        if(n==0 || n==1){
            return 1;
    }

    // vetical 

    int Vnm1 = tiling(n -1);
    
    int Hnm2 = tiling(n-2);

    int totalWays = Vnm1 + Hnm2;

    return totalWays;
}
    public static void main(String args[]){

        System.out.println(tiling(3));
       

        }

    }

