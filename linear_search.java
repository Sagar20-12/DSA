import java.lang.module.FindException;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {23,34,3,5,5,64,456,564,455};
        int target = 18;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }
    // search in the array: return te index if item is found and item not found return -1
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
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
