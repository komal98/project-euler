public class MultiplesOf3And5Problem001 implements EulerSolution{
    public static void main(String[] args) {
        System.out.println(new MultiplesOf3And5Problem001().run());
    }

    public String run() {
        int sum = 0;
        for(int i = 0; i < 1000; i++){
            if(i%3 ==0 || i%5==0) {
                sum += i;
            }
        }
        return Integer.toString(sum);
    }
}
