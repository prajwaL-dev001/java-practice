import java.util.HashMap;

public class AnagramValidationChecker {

    public static void main(String[] args) {

        String firstWordInput = "listen";
        String secondWordInput = "silent";

        if (firstWordInput.length() != secondWordInput.length()) {

            System.out.println("Not Anagrams");
            return;
        }

        HashMap<Character, Integer> characterCountRegistry = new HashMap<>();

        for (char currentCharacterEntry : firstWordInput.toCharArray()) {

            characterCountRegistry.put(
                    currentCharacterEntry,
                    characterCountRegistry.getOrDefault(currentCharacterEntry, 0) + 1
            );
        }

        for (char currentCharacterEntry : secondWordInput.toCharArray()) {

            if (!characterCountRegistry.containsKey(currentCharacterEntry)) {

                System.out.println("Not Anagrams");
                return;
            }

            characterCountRegistry.put(
                    currentCharacterEntry,
                    characterCountRegistry.get(currentCharacterEntry) - 1
            );

            if (characterCountRegistry.get(currentCharacterEntry) == 0) {
                characterCountRegistry.remove(currentCharacterEntry);
            }
        }

        if (characterCountRegistry.isEmpty()) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}