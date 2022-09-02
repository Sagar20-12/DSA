public class evendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check if a elementt contaisne even numbers of digits
    // in boolean method
    static boolean even(int num) {
        int numberofdigits = digits(num);
        if(numberofdigits % 2 == 0){
            return true;
        }
        return false;
    }


    //count number of digits in the number
    // in int method
    static int digits(int num){

        // if number is negative make it positive to get the answer
        if(num<0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }


        int count = 0;

        while(num>0){
            count++;
            num = num/10;
        }

        return count;
    }
}
