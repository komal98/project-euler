public class SpecialPythagoreanTripletProblem009 implements EulerSolution{
    public static void main(String[] args) {
        System.out.print(new SpecialPythagoreanTripletProblem009().run());
    }

    private static final int PERIMETER = 1000;

    public String run() {
        for(int a = 1; a<PERIMETER; a++){
            for(int b = a +1; b <PERIMETER; b++){
                int c = PERIMETER - a - b;
                if(a*a + b*b == c*c){
                    return Integer.toString(a*b*c);
                }
            }
        }
        throw new AssertionError("Not found");
    }
}
