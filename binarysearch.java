// algorithm for binary search
// 1) FIND THE MIDDLE ELEMENT
// 2) TARGET ELEMENT GREATER SEARCH IN RIGHT SMALLER SEARCH IN LEFT.
// 3) IF MIDDLE ELEMENT == TARGET ELEMENT(  ANSWER  )

public class binarysearch {
    public binarysearch(int[] arr, int target, int start, int end) {
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        int ans = search(arr,target);
        System.out.println(ans);


    }
    // return the index
    //return -1 if it does not exist
    static int search(int[] arr, int target){
       int start = 0;
       int end = arr.length-1;

       while(start<=end){
           //find the middle element

           //int mid = (start+end)/2; //(might get exceeds the range of int in java)
           int mid = start + (end-start)/2;  //new formula
           if(target<arr[mid]){
               end = mid-1;
           }
           else if(target>arr[mid]){
               start = mid + 1;
           }
           else{
               return mid;
           }

       }
       return -1;
    }
}
