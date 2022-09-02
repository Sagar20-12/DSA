public class mountain {
    public static void main(String[] args) {

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
        return start;//you can return anything as they are equal
    }
}
