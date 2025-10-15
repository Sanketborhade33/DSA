public class update_ithbit {

     public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIth(int n, int i, int Bitnew ){

        n =clearIthBit(n,i);
        int BitMask = Bitnew <<i;
        return n | BitMask;
    }
    public static void main(String[] args){

        System.out.println(updateIth(10, 2, 1));
    }
}
