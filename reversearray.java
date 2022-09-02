import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,41};
        //swap(arr, 1, 3);

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end ){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
    }
}

