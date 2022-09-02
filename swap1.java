import java.util.Arrays;

public class swap1 {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,41};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
    }
}
