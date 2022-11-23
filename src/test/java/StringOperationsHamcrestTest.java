import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class StringOperationsHamcrestTest {
    private static StringOperations stringOperations;

    @BeforeAll
    static void setUp() {
        stringOperations = new StringOperations();
    }

    @Test
    public void createInstance() {
        assertThat(stringOperations.getClass(), is(StringOperations.class));
    }

    private static Throwable exceptionOf(Callable<?> callable) {
        try {
            callable.call();
            return null;
        } catch (Throwable t) {
            return t;
        }
    }


    @Test
    public void testReverseWordHamcrest() {
        assertThat(stringOperations.reverse("Dog"), equalTo("goD"));
    }


    @Test
    public void testReverseThrowsNullExceptionHamcrest() {
        assertThat(exceptionOf(() -> stringOperations.reverse(null)), instanceOf(NullPointerException.class));
    }

    @Test
    public void testWordIsPalindromeHamcrest() {
        assertThat(stringOperations.isPalindrome("kajak"), is(true));
    }


    @Test
    public void testWordIsNotPalindromeHamcrest() {
        assertThat(stringOperations.isPalindrome("kajaki"), is(false));
    }

    @Test
    public void testConcatTwoStringsHamcrest() {
        //given
        String arg1 = "abc";
        String arg2 = "cba";

        //then
        assertThat(stringOperations.concat(arg1, arg2), hasLength(arg1.length() + arg2.length()), equalTo("abccba"));
    }


    @Test
    public void testConcatThrowsNullExceptionHamcrest() {
        assertThat(exceptionOf(() -> stringOperations.concat(null, null)), isA(NullPointerException.class));
    }


    @AfterAll
    static void tearDown() {
        stringOperations = null;
    }


}