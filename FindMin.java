public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,12,2,3,14,28};
        System.out.println(min(arr)); //min gives the minumum elemeent in the arrau
    }

    // asume arr.length!=0
    //return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }

        }
        return ans;

    }
}
