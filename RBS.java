public class RBS {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        // if you did not find the pibot the aray us not rotated
        if(pivot == -1){
            // just do binary search
            return search(nums, target, 0, nums.length-1);
        }
        //if pivot id found you have 2 asc sorteed arays
        if(nums[pivot] == target) {
            return pivot;
        }

        if(target>=nums[0]){
            return search(nums,target, 0, pivot - 1);
        }
        return search(nums, target, pivot + 1, nums.length-1);
    }
    static int search(int[] arr, int target, int start, int end){

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

    //this will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;  //new formula

            // 4 cases over here

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid -1;
            }
            if(arr[mid]<=arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }

    //for dupliacted we skip end and start eith end -1 and start + 1
    static int findPivotforduplicates(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;  //new formula

            // 4 cases over here

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid -1;
            }
            // if elements at middle , dtart and end are equal then skip the duplictes
            if(arr[mid]== arr[start] && arr[mid] == arr[end]){
                // skip the duplicates

                //NOTE: but what if the elements at start and end were the pivots
                //check if the start is pivot
                if(arr[start]>arr[start + 1]){
                    return start;
                }
                start++;

                //check whether end is pivot or not
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }

            //here left side id sorted so povit should be in right
            else if (arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])) {
                start = mid + 1;
            }
            else{
                end = end - 1;
            }
        }

        return -1;
    }
}
