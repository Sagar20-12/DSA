public class firstandlast {
    public static void main(String[] args) {

    }

    public int[] searchinrange(int[] num, int target) {

        int[] ans = {-1, -1};

        //check foe first occurence if target first
        int start = search(num, target, true);
        int end = search(num, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    //this value returns the index id what we are trying to search
    int search(int[] num, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            //find the middle element

            //int mid = (start+end)/2; //(might get exceeds the range of int in java)
            int mid = start + (end - start) / 2;  //new formula
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                //potential answer has been found
                ans = mid;
                if(findStartIndex == true){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}