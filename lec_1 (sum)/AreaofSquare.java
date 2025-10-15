import java.util.Scanner;
public class AreaofSquare {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
int a = sc.nextInt();

double area = a * a;

System.out.println("Area of the square is :" + area);

sc.close();
    }
}
