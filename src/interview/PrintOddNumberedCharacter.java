package interview;


import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

/**
 * Given string write code that generate the output
 * <p>
 * aaaabbb -> b
 * aaabbbcccdd -> abc
 * abc -> abc
 * aabbbccdda -> ba
 **/
public class PrintOddNumberedCharacter {

    public String getOddNumberedCharacter(String string) {
        if (StringUtils.isEmpty(string)) {
            return string;
        } else {
            char[] characters = string.toCharArray();
            Set<Character> charSet = new LinkedHashSet<>();
            for (int i = 0; i < characters.length; ++i) {
                char temp = characters[i];
                if (charSet.contains(temp)) {
                    charSet.remove(temp);
                } else {
                    charSet.add(temp);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Character c : charSet) {
                sb.append(c);
            }
            return sb.toString();
        }
    }

    @Test
    public void test() {
        PrintOddNumberedCharacter printOddNumberedCharacter = new PrintOddNumberedCharacter();
        assertEquals(null, printOddNumberedCharacter.getOddNumberedCharacter(null));
        assertEquals("", printOddNumberedCharacter.getOddNumberedCharacter(""));
        assertEquals("b", printOddNumberedCharacter.getOddNumberedCharacter("aaaabbb"));
        assertEquals("abc", printOddNumberedCharacter.getOddNumberedCharacter("aaabbbcccdd"));
        assertEquals("abc", printOddNumberedCharacter.getOddNumberedCharacter("abc"));
        assertEquals("ba", printOddNumberedCharacter.getOddNumberedCharacter("aabbbccdda"));
    }

}
