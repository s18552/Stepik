import java.util.ArrayList;
import java.util.List;

public class StringOperations {


    public String reverse(String a) {
        if (a == null) throw new NullPointerException();
        List<String> tempArray = new ArrayList<>(a.length());
        for (int i = 0; i < a.length(); i++) {
            tempArray.add(a.substring(i, i + 1));
        }

        StringBuilder reversedString = new StringBuilder(a.length());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

    public String concat(String a, String b) {
        if (a == null || b == null) throw new NullPointerException();
        String retVal = null;
        if (a.length() > 0) {
            retVal = a + b;
        }
        return retVal;
    }

    public boolean isPalindrome(String a) {
        if (a == null) return false;
        String reverseStr = "";
        for (int i = (a.length() - 1); i >= 0; --i) {
            reverseStr = reverseStr + a.charAt(i);
        }

        return a.equalsIgnoreCase(reverseStr);
    }

}