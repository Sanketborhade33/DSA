import java.util.*;

public class inbuilt_sort_4 {
    public static void main (String[] args){
        int arr[] = {5,4,1,3,2};

        Arrays.sort(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}