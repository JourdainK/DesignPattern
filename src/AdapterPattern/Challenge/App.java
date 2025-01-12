package AdapterPattern.Challenge;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchLocalizedAdapter = new FrenchLocalizedAdapter();
        var frenchGreeting = new Greeting(frenchLocalizedAdapter);
        frenchGreeting.print();

        //class Adapter
        var frenchLocalizedAdapter2 = new FrenchLocalizedAdapterClass();
        var frenchGreeting2 = new Greeting(frenchLocalizedAdapter2);
        frenchGreeting2.print();

    }
}
