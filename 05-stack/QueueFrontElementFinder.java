import java.util.LinkedList;
import java.util.Queue;

public class QueueFrontElementFinder {

    public static void main(String[] args) {

        Queue<Integer> studentDataQueue = new LinkedList<>();

        studentDataQueue.add(100);
        studentDataQueue.add(200);
        studentDataQueue.add(300);
        studentDataQueue.add(400);

        System.out.println("Queue Elements: " + studentDataQueue);

        System.out.println("Front Element: " + studentDataQueue.peek());
    }
}