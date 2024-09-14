package model;

public interface Log {
    void debug(String message);

    void warn(String message);

    void trace(String message);

    void info(String message);

    void error(String message);
}
