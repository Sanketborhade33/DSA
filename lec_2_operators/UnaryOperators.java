package lec_2_operators;
public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;     
        System.out.println(a );   /// pre increment
        System.out.println(b );  

        int c = 10;
        int d = c++;
        System.out.println(c ); /// post increment
        System.out.println(d );


        int e = 10;
        int f = --e;
        System.out.println(e ); /// pre decrement
        System.out.println(f );


        int g = 10;
        int h = g--;
        System.out.println(g );/// post decrement
        System.out.println(h );
    }
}
