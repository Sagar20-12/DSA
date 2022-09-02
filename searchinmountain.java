public class searchinmountain {
    public static void main(String[] args) {

    }

    int orderagnosticsbinary(int[] arr, int target, int i, int peak){
        peak = peakIndexInMountain(arr);
        int firstTry = orderagnosticsbinary(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        // try to search in second half
        return orderagnosticsbinary(arr, target, peak+1, arr.length - 1);


    }
    public int peakIndexInMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are int the descending part of the array
                //thid may be the ans but look at the left
                //this is why end ! = mid-1
                end = mid;
            } else{
                //you are in the asc part of the array
                start = mid + 1;
                //because we know that mid+1 ele>mid ele
                //
            }
        }
        //in the end start  = = end and pointing to tthe largest number because of the 2 above boxes
        //start and end are always trying to find max ele in the above 2 boxed
        // hence when they are pointing to just onw wlement that is the max one because that is what the check say
        //more elaboratrion : at every point of time for start and end they have the best possible answers till that time
        //and id we are saying that only one item is remaining hence cuz of above lines
        return end; //you can return anything as they are equal
    }
    static int oabs(int[] arr, int target, int start, int end){

        //find whether the array is sorted in ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;

        } else{
            isAsc = false;
        }

        while(start<=end){
            //find the middle element

            //int mid = (start+end)/2; //(might get exceeds the range of int in java)
            int mid = start + (end-start)/2;  //new formula
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            } else{
                if(target>arr[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}

