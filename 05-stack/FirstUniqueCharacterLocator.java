import java.util.HashMap;

public class FirstUniqueCharacterLocator {

    public static void main(String[] args) {

        String inputTextSequence = "programming";

        HashMap<Character, Integer> characterFrequencyStore = new HashMap<>();

        for (char currentCharacterValue : inputTextSequence.toCharArray()) {

            characterFrequencyStore.put(
                    currentCharacterValue,
                    characterFrequencyStore.getOrDefault(currentCharacterValue, 0) + 1
            );
        }

        for (char currentCharacterValue : inputTextSequence.toCharArray()) {

            if (characterFrequencyStore.get(currentCharacterValue) == 1) {

                System.out.println(
                        "First Non-Repeated Character: "
                                + currentCharacterValue
                );
                break;
            }
        }
    }
}