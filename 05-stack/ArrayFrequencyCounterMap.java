import java.util.HashMap;

public class ArrayFrequencyCounterMap {

    public static void main(String[] args) {

        int[] inputNumberCollection = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> frequencyStorageMap = new HashMap<>();

        for (int currentNumberValue : inputNumberCollection) {

            if (frequencyStorageMap.containsKey(currentNumberValue)) {

                frequencyStorageMap.put(
                        currentNumberValue,
                        frequencyStorageMap.get(currentNumberValue) + 1
                );

            } else {

                frequencyStorageMap.put(currentNumberValue, 1);
            }
        }

        System.out.println("Element Frequencies:");

        for (Integer mapKeyValue : frequencyStorageMap.keySet()) {

            System.out.println(
                    mapKeyValue + " -> "
                    + frequencyStorageMap.get(mapKeyValue)
            );
        }
    }
}