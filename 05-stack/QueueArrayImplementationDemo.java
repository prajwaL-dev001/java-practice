public class QueueArrayImplementationDemo {

    static class QueueStorageUnit {

        int[] queueData;
        int frontPosition;
        int rearPosition;
        int queueCapacity;

        QueueStorageUnit(int sizeValue) {
            queueCapacity = sizeValue;
            queueData = new int[queueCapacity];
            frontPosition = 0;
            rearPosition = -1;
        }

        void insertElement(int newValue) {

            if (rearPosition == queueCapacity - 1) {
                System.out.println("Queue Overflow");
                return;
            }

            queueData[++rearPosition] = newValue;
        }

        void removeElement() {

            if (frontPosition > rearPosition) {
                System.out.println("Queue Underflow");
                return;
            }

            System.out.println("Removed: " + queueData[frontPosition]);
            frontPosition++;
        }

        void displayQueue() {

            for (int indexValue = frontPosition; indexValue <= rearPosition; indexValue++) {
                System.out.print(queueData[indexValue] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueStorageUnit studentQueueData = new QueueStorageUnit(5);

        studentQueueData.insertElement(10);
        studentQueueData.insertElement(20);
        studentQueueData.insertElement(30);

        studentQueueData.displayQueue();

        studentQueueData.removeElement();

        studentQueueData.displayQueue();
    }
}