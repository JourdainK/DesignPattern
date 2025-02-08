package MementoPattern;

public class DocumentViewer {

    public static void main(String[] args) {
        var textDocument = new TextDocument();
        textDocument.write("Hello World ! ");
        textDocument.print();
        textDocument.save();
        textDocument.write("How are you ?");
        textDocument.print();
        textDocument.undo();
        textDocument.print();


    }
}
