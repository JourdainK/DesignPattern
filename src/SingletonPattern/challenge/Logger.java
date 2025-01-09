package SingletonPattern.challenge;

public enum Logger {
    INSTANCE;

    //optional, Logger.INSTANCE can be used
    public static Logger getInstance() {
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }
}
