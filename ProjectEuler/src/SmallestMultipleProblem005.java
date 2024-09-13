import java.math.BigInteger;

public class SmallestMultipleProblem005 implements EulerSolution{
    public static void main(String[] args) {
        System.out.print(new SmallestMultipleProblem005().run());
    }

    /*
    The smallest number n that is evenly divisible by every number in the set {k1, k2, .... km}.
    It is also known as the lowest common multiple of the set of numbers.
    The LCM of two numbers x and y can be derived using LCM(x,y) = x*y/GCD(x,y). When LCM is applied
    to collection of numbers; it is commutative, associative and idempotent. Hence, LCM(k1,k2...km)=
    LCM(....(LCM(k1,k2),k3)),km)
     */

    public String run() {
        BigInteger allLcm = BigInteger.ONE;

        for(int i = 1; i<=20; i++){
            allLcm = lcm(BigInteger.valueOf(i), allLcm);
        }

        return allLcm.toString();
    }

    private static BigInteger lcm(BigInteger x, BigInteger y){
        return x.divide(x.gcd(y)).multiply(y);
    }
}
