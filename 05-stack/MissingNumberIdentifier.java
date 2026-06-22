import java.util.HashMap;

public class MissingNumberIdentifier {

    public static void main(String[] args) {

        int[] availableNumbers = {1, 2, 4, 5, 6};

        HashMap<Integer, Boolean> numberRegistry = new HashMap<>();

        for (int currentNumberEntry : availableNumbers) {
            numberRegistry.put(currentNumberEntry, true);
        }

        for (int expectedNumber = 1; expectedNumber <= 6; expectedNumber++) {

            if (!numberRegistry.containsKey(expectedNumber)) {

                System.out.println(
                        "Missing Number: " + expectedNumber
                );
            }
        }
    }
}