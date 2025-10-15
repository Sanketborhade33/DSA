

public class even_odd {

    public static void evenOdd(int n){
        int bit_Length = 1;
        
        if ((n & bit_Length) == 1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even Number");
        }
    }
    public static void main (String[] args){

        evenOdd(5);
        evenOdd(10);
        evenOdd(15);


    }
}
