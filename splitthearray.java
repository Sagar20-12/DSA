public class splitthearray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i <nums.length ; i++) {
            start = Math.max(start, nums[i]);//in the end the loop will contain the maxinmum item in the array
            end = end + nums[i];

        }
        //binary search
        while(start<end){
            //try or the middle asthe potential asnweer
            int mid = start +(end - start)/2;

            //calculate how many pieces tou can divede this in whith this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum  + num>mid){
                    // you cannot add this in subaray
                    //say you can add this in the subarary thrn sum = num
                    sum = num;
                    pieces++;
                    
                }
                else{
                    start = start + num;
                }
            }
            if(pieces>m){
                start = mid  + 1;
            }else{
                end = mid;
            }
        }
        return end;// here start==end
    }
}
