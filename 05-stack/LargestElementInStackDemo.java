import java.util.Stack;

public class LargestElementInStackDemo {

    public static void main(String[] args) {

        Stack<Integer> numberContainer = new Stack<>();

        numberContainer.push(10);
        numberContainer.push(45);
        numberContainer.push(25);
        numberContainer.push(80);
        numberContainer.push(30);

        int largestValue = numberContainer.peek();

        for (int currentValue : numberContainer) {

            if (currentValue > largestValue) {
                largestValue = currentValue;
            }
        }

        System.out.println("Largest Element = " + largestValue);
    }
}