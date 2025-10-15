

public class Friends_pairing_problem {

    public static int pairingProblem(int n){

        /// base case 
        
        if( n == 1 || n ==2){
            return n;
        }

        //kaam 
        int single = pairingProblem(n-1);
        int pair = (n-1) * pairingProblem(n-2);

        

        int totalWays = single + pair;

        return totalWays;
                                       ////////////////// it can directly written as 
                                       /// return pairingProblem(n-1) + (n-1) * pairingProblem(n-2);
    }

    public static void main(String args[]){

        System.out.println(pairingProblem(2));


    } 
    
}
