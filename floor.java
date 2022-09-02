// algorithm for binary search
// 1) FIND THE MIDDLE ELEMENT
// 2) TARGET ELEMENT GREATER SEARCH IN RIGHT SMALLER SEARCH IN LEFT.
// 3) IF MIDDLE ELEMENT == TARGET ELEMENT(  ANSWER  )

public class floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,16,14,18};
        int target = 15;
        int ans = search(arr,target);
        System.out.println(ans);


    }
    // return the index : greatest number return the target

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
        return end;
    }
}
