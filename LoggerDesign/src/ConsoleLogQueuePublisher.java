import java.util.Queue;

public class ConsoleLogQueuePublisher implements LogQueuePublisher {

    private Queue<String> debugQueue;

    public ConsoleLogQueuePublisher(Queue<String> debugQueue) {
        this.debugQueue = debugQueue;
    }

    @Override
    public void publishDebugMessage(String message) {

        create can create a new thread and we can publish the message in our debugQueue

    }
}
