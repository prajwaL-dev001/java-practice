import java.util.HashMap;

public class CommonArrayElementsFinder {

    public static void main(String[] args) {

        int[] firstArrayCollection = {10, 20, 30, 40, 50};
        int[] secondArrayCollection = {30, 40, 50, 60, 70};

        HashMap<Integer, Boolean> elementPresenceRegistry = new HashMap<>();

        for (int currentFirstArrayValue : firstArrayCollection) {
            elementPresenceRegistry.put(currentFirstArrayValue, true);
        }

        System.out.println("Common Elements:");

        for (int currentSecondArrayValue : secondArrayCollection) {

            if (elementPresenceRegistry.containsKey(currentSecondArrayValue)) {

                System.out.println(currentSecondArrayValue);

                elementPresenceRegistry.remove(currentSecondArrayValue);
            }
        }
    }
}