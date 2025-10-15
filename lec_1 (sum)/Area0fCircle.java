import java.util.Scanner;

public class Area0fCircle {
    public static void main(String args[])  {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    double area = 3.14 * input * input ;
    System.out.println("Area of circle is: " + area);
     
    sc.close();
    }
}
