public class block_scope {
    public static void main (String[] args){
    {
        int s = 45;
        System.out.println(s); // s is accessible here

}
//System.out.println(s); // s is not accessible here, this will give an error

}
}




/////// block scope - // agar koi variable kisi block ke andar define kiya hai to wo variable sirf usi block ke andar use ho sakta hai
/// block means - if else, for loop, while loop, etc or curly braces { }
/// 
/// 