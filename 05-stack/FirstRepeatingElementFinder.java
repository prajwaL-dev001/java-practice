import java.util.HashMap;

public class FirstRepeatingElementFinder {

    public static void main(String[] args) {

        int[] inputNumberSeries = {10, 20, 30, 40, 20, 50, 10};

        HashMap<Integer, Integer> repetitionTrackerMap = new HashMap<>();

        int firstRepeatingValue = -1;

        for (int currentArrayValue : inputNumberSeries) {

            if (repetitionTrackerMap.containsKey(currentArrayValue)) {

                firstRepeatingValue = currentArrayValue;
                break;
            }

            repetitionTrackerMap.put(currentArrayValue, 1);
        }

        if (firstRepeatingValue != -1) {

            System.out.println(
                    "First Repeating Element: "
                            + firstRepeatingValue
            );

        } else {

            System.out.println("No Repeating Element Found");
        }
    }
}