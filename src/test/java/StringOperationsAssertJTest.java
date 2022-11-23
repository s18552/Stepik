import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class StringOperationsAssertJTest {
    private static StringOperations stringOperations;

    @BeforeAll
    static void setUp() {
        stringOperations = new StringOperations();
    }

    @Test
    public void createInstance() {
        assertThat(stringOperations.getClass()).isEqualTo(StringOperations.class);
    }

    @Test
    public void testReverseWordAssertJ() {
        assertThat(stringOperations.reverse("Dog")).isEqualTo("goD");
    }


    @Test
    public void testReverseThrowsNullExceptionAssertJ() {
        assertThatThrownBy(() -> stringOperations.reverse(null)).isInstanceOf(NullPointerException.class);
    }

    @Test
    public void testWordIsPalindromeAssertJ() {
        assertThat(stringOperations.isPalindrome("kajak")).isTrue();
    }


    @Test
    public void testWordIsNotPalindromeAssertJ() {
        assertThat(stringOperations.isPalindrome("kajaki")).isFalse();
    }

    @Test
    public void testConcatTwoStringsAssertJ() {
        assertThat(stringOperations.concat("abc", "cba")).hasSize(6).isEqualTo("abccba");
    }

    @Test
    public void testConcatThrowsNullExceptionAssertJ() {
        assertThatThrownBy(() -> stringOperations.concat(null, null)).isInstanceOf(NullPointerException.class);
    }

    @AfterAll
    static void tearDown() {
        stringOperations = null;
    }
}
