public class LargestPalindromeProductProblem004 implements EulerSolution {
    public static void main(String[] args) {
        System.out.print(new LargestPalindromeProductProblem004().run());
    }


    public String run() {
        int maxPalin = -1;
        for(int i = 1; i< 1000; i++ ){
            for(int j = 1; j < 1000; j++){
                int prod = i*j;
                if(LibraryHelper.isPalindrome(prod) && prod >maxPalin){
                    maxPalin = prod;
                }
            }
        }
        return Integer.toString(maxPalin);
    }
}
