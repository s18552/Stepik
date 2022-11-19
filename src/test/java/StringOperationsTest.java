
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringOperationsTest {
    private static StringOperations stringOperations;

    @BeforeAll
    static void setUp() {
        stringOperations = new StringOperations();
    }

    @Test
    public void testReverseWord() {
        //given
        String arg = "Dog";

        //when
        String reverse = stringOperations.reverse(arg);

        Assertions.assertEquals(reverse, "goD");
    }

    @Test
    public void testReverseWithNumber() {
        //given
        String arg = "Dog123";

        //when
        String reverse = stringOperations.reverse(arg);

        //then
        Assertions.assertEquals(reverse, "321goD");
    }

    @Test
    public void testReverseThrowsNullException() {
        //given
        String arg = null;

        //then
        Assertions.assertThrows(NullPointerException.class,()->stringOperations.reverse(arg));
    }

    @Test
    public void testWordIsPalindrome() {
        //given
        String arg = "aba";

        //when
        boolean isPalindrome = stringOperations.isPalindrome(arg);

        //then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void testOtherWordIsPalindrome() {
        //given
        String arg = "kajak";

        //when
        boolean isPalindrome = stringOperations.isPalindrome(arg);

        //then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void testWordIsNotPalindrome() {
        //given
        String arg = "kajaki";

        //when
        boolean isPalindrome = stringOperations.isPalindrome(arg);

        //then
        Assertions.assertFalse(isPalindrome);
    }

    @Test
    public void testConcatTwoStrings() {
        //given
        String arg1 = "abc";
        String arg2 = "cba";

        //when
        String result = stringOperations.concat(arg1,arg2);

        //then
        Assertions.assertEquals(result, "abccba");
    }

    @Test
    public void testOtherConcatTwoStrings() {
        //given
        String arg1 = "home ";
        String arg2 = "office";

        //when
        String result = stringOperations.concat(arg1,arg2);

        //then
        Assertions.assertEquals(result, "home office");
    }

    @Test
    public void testConcatThrowsNullException() {
        //given
        String arg1 = null;
        String arg2 = "office";

        //then
        Assertions.assertThrows(NullPointerException.class,()->stringOperations.concat(arg1,arg2));
    }

    @Test
    public void testOtherConcatThrowsNullException() {
        //given
        String arg1 = "home ";
        String arg2 = null;

        //then
        Assertions.assertThrows(NullPointerException.class,()->stringOperations.concat(arg1,arg2));
    }

    @AfterAll
    static void tearDown() {
        stringOperations=null;
    }


}