import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversalUtility {

    public static void main(String[] args) {

        Queue<Integer> originalQueueData = new LinkedList<>();

        originalQueueData.add(10);
        originalQueueData.add(20);
        originalQueueData.add(30);
        originalQueueData.add(40);

        System.out.println("Original Queue: " + originalQueueData);

        Stack<Integer> temporaryStackStorage = new Stack<>();

        while (!originalQueueData.isEmpty()) {
            temporaryStackStorage.push(originalQueueData.remove());
        }

        while (!temporaryStackStorage.isEmpty()) {
            originalQueueData.add(temporaryStackStorage.pop());
        }

        System.out.println("Reversed Queue: " + originalQueueData);
    }
}