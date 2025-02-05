package ChainOfResponsibilityPattern;

public class LoggerRequest {

    private final String message;
    private final LoggerType loggerType;

    public LoggerRequest(String message, LoggerType loggerType){
        this.message = message;
        this.loggerType = loggerType;
    }

    public String getMessage() {
        return message;
    }

    public LoggerType getLoggerType() {
        return loggerType;
    }

    public enum LoggerType{
        CONSOLE,
        FILE
    }
}
