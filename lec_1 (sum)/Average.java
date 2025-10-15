import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number:" );
    float a = sc.nextInt();

    System.out.print("Enter second number:" );
    float b = sc.nextInt();

    System.out.print("Enter third number:" );  
    float c = sc.nextInt();

   double avg = (a+b+c)/3;

System.out.println("Average of three number is:" + avg);


sc.close();
    }

}
