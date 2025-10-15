

public class OOPS {
    public static void main(String[] args) {
        // Creating an instance of Pen
       
        Pen p1 =new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println("Pen color: " + p1.color);
        System.out.println("Pen tip: " + p1.tip);
        
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip (int newTip){
        tip = newTip;
    }
}
