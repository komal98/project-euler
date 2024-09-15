public class SumOfPrimesProblem010 implements EulerSolution{
    public static void main(String[] args) {
        System.out.print(new SumOfPrimesProblem010().run());
    }

    private static final int LIMIT = 2000000;
    public String run() {
        long sum = 0;
        for(int i = 0; i<=LIMIT; i++){
            if(LibraryHelper.isPrime(i)){
                sum += i;
            }
        }
        return Long.toString(sum);
    }
}
