import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryHelperTest {

    @Test
    public void testReverse(){
        assertEquals("", LibraryHelper.reverse(""));
        assertEquals("a", LibraryHelper.reverse("a"));
        assertEquals("ba", LibraryHelper.reverse("ab"));
        assertEquals("001", LibraryHelper.reverse("100"));
        assertEquals("a0a", LibraryHelper.reverse("a0a"));
    }

    @Test
    public void testIsPalindromeString(){
        assertTrue(LibraryHelper.isPalindrome(""));
        assertTrue(LibraryHelper.isPalindrome("a"));
        assertTrue(LibraryHelper.isPalindrome("aaa"));
        assertTrue(LibraryHelper.isPalindrome("malayalam"));
        assertFalse(LibraryHelper.isPalindrome("ab"));
        assertFalse(LibraryHelper.isPalindrome("aa0aa1"));

    }

    @Test
    public void testIsPalindromeInt(){
        assertTrue(LibraryHelper.isPalindrome(0));
        assertTrue(LibraryHelper.isPalindrome(010));
        assertTrue(LibraryHelper.isPalindrome(9999));
        assertFalse(LibraryHelper.isPalindrome(100));
        assertTrue(LibraryHelper.isPalindrome(5665));
        assertTrue(LibraryHelper.isPalindrome(2147447412));
        assertFalse(LibraryHelper.isPalindrome(12));
        assertFalse(LibraryHelper.isPalindrome(43));
        assertFalse(LibraryHelper.isPalindrome(220));
        assertFalse(LibraryHelper.isPalindrome(1010));
        assertFalse(LibraryHelper.isPalindrome(2147483647));
    }

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
