package SingletonPattern;

public class DocumentPrinter {

    public void printDocument() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }

}
