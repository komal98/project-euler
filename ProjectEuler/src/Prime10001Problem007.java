public class Prime10001Problem007 implements EulerSolution{
    public static void main(String[] args) {
        System.out.print(new Prime10001Problem007().run());
    }

    public String run() {
        for(int i =2, count = 0; ; i++){
            if(LibraryHelper.isPrime(i))
                count++;
            if(count == 10001)
                return Integer.toString(i);

        }
    }
}
