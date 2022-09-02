public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,14,90,100,120,130,150,170};
        int target = 10;
        System.out.println(ans(arr,target));


    }
    static binarysearch ans(int[] arr, int target){
        //first find the range
        //first start with the box of size 2

        int start = 0;
        int end  = 1;

        // condition foe the target to lie in the range
        while(target>arr[end]){
            int newstart = end +1;// this is my new start

            //double the value of the box
            //end  = previous end  + size of the box *2
            end  = end + (end - start + 1) * 2;
            start = newstart;
        }
        return new binarysearch(arr, target, start,end);

    }
    static int search(int[] arr, int target, int start, int end){

        while (start <= end) {
            //find the middle element

            //int mid = (start+end)/2; //(might get exceeds the range of int in java)
            int mid = start + (end - start) / 2;  //new formula
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
