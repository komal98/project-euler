public class SumSquareDifferenceProblem006 implements EulerSolution{
    public static void main(String[] args) {
        System.out.print(new SumSquareDifferenceProblem006().run());
    }

    public String run() {
        int sum =0;
        int sum2 = 0;
        for(int i = 1; i <=100; i++){
            sum += i*i;
            sum2 += i;
        }
        sum2 = sum2*sum2;
        return Integer.toString(sum2 - sum);
    }
}
