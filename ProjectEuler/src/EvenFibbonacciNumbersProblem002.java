public class EvenFibbonacciNumbersProblem002 implements EulerSolution{
    public static void main(String[] args) {
        System.out.println(new EvenFibbonacciNumbersProblem002().run());
    }

    public String run() {
        int sum = 0;
        int one = 1;
        int two = 2;

        while(one <=4000000){
            if(one%2 == 0){
                sum +=one;
            }
            int three = one + two;
            one = two;
            two = three;
        }

        return Integer.toString(sum);
    }
}
