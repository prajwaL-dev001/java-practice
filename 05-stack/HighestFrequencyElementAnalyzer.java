import java.util.HashMap;

public class HighestFrequencyElementAnalyzer {

    public static void main(String[] args) {

        int[] inputValueCollection = {10, 20, 10, 30, 20, 10, 40, 20};

        HashMap<Integer, Integer> occurrenceTrackingMap = new HashMap<>();

        for (int currentInputValue : inputValueCollection) {

            occurrenceTrackingMap.put(
                    currentInputValue,
                    occurrenceTrackingMap.getOrDefault(currentInputValue, 0) + 1
            );
        }

        int maximumFrequencyValue = 0;
        int mostFrequentElement = 0;

        for (Integer currentMapKey : occurrenceTrackingMap.keySet()) {

            if (occurrenceTrackingMap.get(currentMapKey) > maximumFrequencyValue) {

                maximumFrequencyValue = occurrenceTrackingMap.get(currentMapKey);
                mostFrequentElement = currentMapKey;
            }
        }

        System.out.println("Most Frequent Element: " + mostFrequentElement);
        System.out.println("Frequency: " + maximumFrequencyValue);
    }
}