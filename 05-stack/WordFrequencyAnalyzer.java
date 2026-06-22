import java.util.HashMap;

public class WordFrequencyAnalyzer {

    public static void main(String[] args) {

        String sentenceInputData =
                "java python java c java python";

        String[] separatedWordCollection =
                sentenceInputData.split(" ");

        HashMap<String, Integer> wordFrequencyStorage =
                new HashMap<>();

        for (String currentWordEntry : separatedWordCollection) {

            wordFrequencyStorage.put(
                    currentWordEntry,
                    wordFrequencyStorage.getOrDefault(
                            currentWordEntry,
                            0
                    ) + 1
            );
        }

        System.out.println("Word Frequencies:");

        for (String currentWordKey :
                wordFrequencyStorage.keySet()) {

            System.out.println(
                    currentWordKey + " -> "
                    + wordFrequencyStorage.get(currentWordKey)
            );
        }
    }
}