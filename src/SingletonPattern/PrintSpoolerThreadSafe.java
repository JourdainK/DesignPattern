package SingletonPattern;

public enum PrintSpoolerThreadSafe {
    INSTANCE;

    private PrintSpoolerThreadSafe() {}

    public static PrintSpoolerThreadSafe getInstance() {
        return INSTANCE;
    }
    public void print() {
        System.out.println("Printing...");
    }
}
