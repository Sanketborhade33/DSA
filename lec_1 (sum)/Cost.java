import java.util.Scanner;
public class Cost {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the cost of the pencil : ");
    float pencil = sc.nextInt();

    System.out.print("Enter the cost of the pen : ");
    float pen = sc.nextInt();

    System.out.print("Enter the cost of the eraser : ");
    float eraser = sc.nextInt();

    float cost = (pencil + pen + eraser) ;

    System.out.println("The total cost of the Items is :" + cost);

    //With tax 

    float tax = cost + (0.18f *cost);
    System.out.print("The total cost of the Items with tax is :" + tax);

 sc.close();
   } 
}
   

