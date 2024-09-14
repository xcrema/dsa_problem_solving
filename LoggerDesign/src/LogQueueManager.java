import listeners.ConsoleLogListener;

import java.util.ArrayDeque;
import java.util.Queue;

public class LogQueueManager {

    void manageLog() {
        Queue<String> debugQueue = new ArrayDeque<>();
        ConsoleLogQueuePublisher consoleLogQueuePublisher = new ConsoleLogQueuePublisher(debugQueue);


        ConsoleLogListener consoleLogListener = new ConsoleLogListener(debugQueue);

    }
}
