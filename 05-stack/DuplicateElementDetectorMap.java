import java.util.HashMap;

public class DuplicateElementDetectorMap {

    public static void main(String[] args) {

        int[] inputDataCollection = {10, 20, 30, 20, 40, 10, 50};

        HashMap<Integer, Integer> duplicateTrackingStore = new HashMap<>();

        for (int currentDataValue : inputDataCollection) {

            duplicateTrackingStore.put(
                    currentDataValue,
                    duplicateTrackingStore.getOrDefault(currentDataValue, 0) + 1
            );
        }

        System.out.println("Duplicate Elements:");

        for (Integer currentKeyValue : duplicateTrackingStore.keySet()) {

            if (duplicateTrackingStore.get(currentKeyValue) > 1) {

                System.out.println(currentKeyValue);
            }
        }
    }
}