package model;

public class ConsoleLog implements Log {

    @Override
    public void debug(String message) {
        System.out.println("Debug logs: " + message);
    }

    @Override
    public void warn(String message) {
        System.out.println("Warn logs: " + message);
    }

    @Override
    public void trace(String message) {
        System.out.println("Trace logs: " + message);
    }

    @Override
    public void info(String message) {
        System.out.println("Info logs: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("Error logs: " + message);
    }
}
