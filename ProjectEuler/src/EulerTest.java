import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EulerTest {
    @Test
    public void testMultiplesOf3And5Problem001(){
        assertEquals("233168", new MultiplesOf3And5Problem001().run());
    }

    @Test
    public void testEvenFibbonacciNumbersProblem002(){
        assertEquals("4613732", new EvenFibbonacciNumbersProblem002().run());
    }

    @Test
    public void testLargestPrimeFactorProblem003(){
        assertEquals("6857", new LargestPrimeFactorProblem003().run());
    }

    @Test
    public void testLargestPalindromeProductProblem004(){
        assertEquals("906609", new LargestPalindromeProductProblem004().run());
    }

    @Test
    public void testSmallestMultipleProblem005(){
        assertEquals("232792560", new SmallestMultipleProblem005().run());
    }

    @Test
    public void testSumSquareDifferenceProblem006(){
        assertEquals("25164150", new SumSquareDifferenceProblem006().run());
    }

    @Test
    public void testPrime10001Problem007(){
        assertEquals("104743",new Prime10001Problem007().run());
    }

    @Test
    public void testLargestProductSeriesProblem008(){
        assertEquals("23514624000", new LargestProductInSeriesProblem008().run());
    }

    @Test
    public void testSpecialPythagoreanTripletProblem009(){
        assertEquals("31875000", new SpecialPythagoreanTripletProblem009().run());
    }

}
