package love2code.exercises.duplicate_characters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Combination");
        printDuplicateCharacters("Java");

    }

    public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : characters) {
            if (map.containsKey(ch)) {
                int counter = map.get(ch);
                map.put(ch, ++counter);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

}











































