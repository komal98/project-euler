public class LibraryHelper {

    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s){
        return s.equals(reverse(s));
    }

    public static boolean isPalindrome(int x){
        return isPalindrome(Integer.toString(x));
    }

    // Returns floor(sqrt(x)), for x >= 0.
    public static long sqrt(long x) {
        if (x < 0)
            throw new IllegalArgumentException("Square root of negative number");
        long y = 0;
        for (long i = 1L << 31; i != 0; i >>>= 1) {
            y |= i;
            if (y > 3037000499L || y * y > x)
                y ^= i;
        }
        return y;
    }

}
