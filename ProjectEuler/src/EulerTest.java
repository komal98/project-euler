import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EulerTest {
    @Test
    public void testMultiplesOf3And5Problem001(){
        assertEquals("233168", new MultiplesOf3And5Problem001().run());
    }
}
