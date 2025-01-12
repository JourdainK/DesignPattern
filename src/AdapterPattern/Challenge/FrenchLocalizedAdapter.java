package AdapterPattern.Challenge;

public class FrenchLocalizedAdapter implements LocalizedMessage {

    private FrenchLocalizedMessage frenchLocalizedMessage;

    public FrenchLocalizedAdapter() {
        this.frenchLocalizedMessage = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        frenchLocalizedMessage.sayBonjour();
    }
}
