import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryHelperTest {

    @Test
    public void testSqrtInt() {
        assertEquals(0, LibraryHelper.sqrt(0));
        assertEquals(1, LibraryHelper.sqrt(1));
        assertEquals(1, LibraryHelper.sqrt(2));
        assertEquals(1, LibraryHelper.sqrt(3));
        assertEquals(2, LibraryHelper.sqrt(4));
        assertEquals(2, LibraryHelper.sqrt(5));
        assertEquals(2, LibraryHelper.sqrt(8));
        assertEquals(3, LibraryHelper.sqrt(9));
        assertEquals(3, LibraryHelper.sqrt(10));
        assertEquals(18, LibraryHelper.sqrt(360));
        assertEquals(19, LibraryHelper.sqrt(361));
        assertEquals(19, LibraryHelper.sqrt(362));
        assertEquals(256, LibraryHelper.sqrt(65536));
        assertEquals(32768, LibraryHelper.sqrt(1073741824));
        assertEquals(46340, LibraryHelper.sqrt(2147483647));
    }
}
