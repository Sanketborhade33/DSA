
   public class charAt_4 {

    public static void printLetters(String str){
        for(int i= 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
System.out.println();
            
    }

     public static void main (String[] args) {
        String firstName = "Sanket";
         String lastName = "Borhade";

         String fullName = firstName + " " + lastName;
         

        printLetters(fullName);
    }

}