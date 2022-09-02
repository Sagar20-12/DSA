public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(linearsearch(arr,target, 1 , 4));

    }
    // search in the array: return te index if item is found and item not found return -1
    static <end> int linearsearch(int[] arr, int target, int start, int end ){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int i = start; i <=end; i++) {
            //check for element at every index if it is eaqual to target
            int element = arr[i];
            if(element==target){
                return i;
            }

        }
        // this line will execute if none of the return statement is executed and hence the target not found
        return -1;
    }
}
