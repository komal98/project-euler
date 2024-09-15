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

    public static int sqrt(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Square root of negative number");
        int y = 0;
        for (int i = 1 << 15; i != 0; i >>>= 1) {
            y |= i;
            if (y > 46340 || y * y > x)
                y ^= i;
        }
        return y;
    }

    public static boolean isPrime(int x){
        if( x < 0)
            throw new IllegalArgumentException("Negative number");
        if( x==0 || x==1){
            return false;
        } else if (x == 2) {
            return true;

        }else{
            if(x%2 == 0){
                return false;
            }
            for(int i = 3, end = sqrt(x); i<=end; i+=2){
                if( x%i == 0){
                    return false;
                }
            }
            return true;
        }
    }

}
