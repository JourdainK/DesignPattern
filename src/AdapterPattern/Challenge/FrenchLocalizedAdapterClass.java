package AdapterPattern.Challenge;

public class FrenchLocalizedAdapterClass extends FrenchLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        sayBonjour();
    }
}
