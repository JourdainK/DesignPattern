package AdapterPattern.ClassAdapter;

public class OnlineApplication {

    private DocumentUploader documentUploader;

    public OnlineApplication(DocumentUploader documentUploader) {
        this.documentUploader = documentUploader;
    }

    public void uploadDocument() {
        documentUploader.upload();
    }
}
