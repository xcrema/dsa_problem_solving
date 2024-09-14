package listeners;


public interface LogListener {

    void listenDebugLogs(String message);

    void listenWarnLogs(String message);

    void listenInfoLogs(String message);

    void listenErrorLogs(String message);
}
