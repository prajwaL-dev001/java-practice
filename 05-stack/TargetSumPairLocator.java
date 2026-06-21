import java.util.HashMap;

public class TargetSumPairLocator {

    public static void main(String[] args) {

        int[] inputValueSeries = {2, 7, 11, 15};

        int targetSumValue = 9;

        HashMap<Integer, Integer> valuePositionStore = new HashMap<>();

        for (int currentIndexValue = 0;
             currentIndexValue < inputValueSeries.length;
             currentIndexValue++) {

            int requiredComplementValue =
                    targetSumValue - inputValueSeries[currentIndexValue];

            if (valuePositionStore.containsKey(requiredComplementValue)) {

                System.out.println(
                        "Pair Found At Indexes: "
                                + valuePositionStore.get(requiredComplementValue)
                                + " and "
                                + currentIndexValue
                );

                return;
            }

            valuePositionStore.put(
                    inputValueSeries[currentIndexValue],
                    currentIndexValue
            );
        }

        System.out.println("No Pair Found");
    }
}