public class orderagnosticbinary {
    public static void main(String[] args) {
        int[] arr = {-23,-20,-6,2,3,4,15,16,18,22,26};
        int target = 22;
        int ans = oabs(arr, target);
        System.out.println(ans);

    }
    static int oabs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
