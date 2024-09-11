public class LargestPrimeFactorProblem003 implements EulerSolution{
    public static void main(String[] args) {
        System.out.print(new LargestPrimeFactorProblem003().run());
    }

    /**
     * According to fundamental theorem of arithmetic, every integer n > 1 has a unique factorization
     * as a product of prime numbers. In other words, the theorem states that n = p0 * p1 * .... p_{m-1},
     * where each p_i >1 is prime but not necessarily unique. Now if we take n and divide out its smallest factor
     * (which also must be prime), then the last factor we divide must be the largest prime factor of n.
     */
    public String run() {
        long n = 600_851_475_143L;
        while(true){
            long p = smallestFactor(n);
            if(p<n){
                n /= p;
            }else{
                return Long.toString(p);
            }
        }
    }

    private static long smallestFactor(long n){
        if(n<=1)
            throw new IllegalArgumentException();
        for(long i = 2, end = LibraryHelper.sqrt(n); i<=end; i++){
            if(n % i == 0)
                return i;
        }

        return n;
    }
}
