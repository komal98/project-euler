public class HighlyDivisibleTriangularNumberProblem012 implements EulerSolution{
    public static void main(String[] args) {
        System.out.print(new HighlyDivisibleTriangularNumberProblem012().run());
    }

    public String run() {
        int triangle = 0;
        for(int i = 1; ; i++){
            if(Integer.MAX_VALUE - triangle < i)
                throw new ArithmeticException("Overflow");
            triangle += i;
            if(countDivisors(triangle) > 500)
                return Integer.toString(triangle);
        }
    }

    private static int countDivisors(int n){
        int count = 0;
        int end = LibraryHelper.sqrt(n);

        for(int i = 1; i < end; i++){
            if(n%i == 0)
                count +=2;
        }

        if(end*end == n){
            count++;
        }
        return count;
    }
}
