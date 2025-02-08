package MementoPattern;

public class TextDocumentState {

    private String state;

    public TextDocumentState(String text){
        this.state = text;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
}
