public class swaptwo {
    public static void main(String[] args) {
        int x = 24;
        int y = 91;

        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println(x);
        System.out.println(y);
    }
}
