public class binary_search_7 {


    public static int binarySearch(int numbers[], int key) {
        int start =0; 
        int  end = numbers.length-1;

        while(start<=end){
            int mid = (start+ end)/2;

            //conditions

            if(numbers[mid]==key){
                return mid;
            }

            if (numbers[mid] >key){
                end = mid -1;
            }

            else{
            start = mid+1;
            }


        }
            return -1; 
    }
    public static void main(String[] args){

        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;


        System.out.println("the index of key is : " + binarySearch(numbers, key) );
    }
}
