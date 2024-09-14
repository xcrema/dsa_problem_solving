package listeners;

import model.ConsoleLog;

import java.util.Queue;

public class ConsoleLogListener implements LogListener{

    private Queue<String> debugQueue;

    private ConsoleLog consoleLog;

    public ConsoleLogListener(Queue<String> debugQueue) {
        this.debugQueue = debugQueue;
    }

    @Override
    public void listenDebugLogs() {
        if (!debugQueue.isEmpty()) {
            consoleLog.debug(debugQueue.poll());
        }
    }

    @Override
    public void listenWarnLogs(String message) {

    }

    @Override
    public void listenInfoLogs(String message) {

    }

    @Override
    public void listenErrorLogs(String message) {

    }
}
