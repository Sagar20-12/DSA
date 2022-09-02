public class pivotcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        if(pivot == -1){
            //array is not rotated
            return 0;
        }
        return pivot +1;

    }

    // use this for non duplicates
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

    //for dupliacted we skip end and start with end -1 and start + 1
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
