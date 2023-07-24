package love2code.exercises.first_non_repeted_character;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        char result = findFirstNonRepeatedCharacter("AAbAFipfi".toLowerCase());
        System.out.printf("Character found: '%s'", result);
    }

    public static char findFirstNonRepeatedCharacter(String givenWord) {
        Map<Character, Integer> map = new LinkedHashMap<>(givenWord.length());
        for (char ch : givenWord.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("Didn't find any non repeated Character");
    }

}
