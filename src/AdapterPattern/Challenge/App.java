package AdapterPattern.Challenge;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchLocalizedAdapter = new FrenchLocalizedAdapter();
        var frenchGreeting = new Greeting(frenchLocalizedAdapter);
        frenchGreeting.print();

    }
}
