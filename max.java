public class max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};
        System.out.println(max(arr));
    }

    //work on edge cases(means if statements) here , like array being null
    static int maxRange(int[] arr, int start, int end){

        if(end>start){
            return -1;
        }
        if (arr == null){
            return -1;

        }
        int maxVal = arr[start];
        for (int i = start; i <=end ; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


    // imagine the arry to be empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
