package AdapterPattern.ClassAdapter;

public class WordDocumentAdapter extends WordDocumentUploader
        implements DocumentUploader {

    @Override
    public void upload() {
        uploadDocument();
    }

    @Override
    public void uploadDocument() {
        System.out.println("Preparing Word document...");
        System.out.println("Uploading Word document...");
    }

}
