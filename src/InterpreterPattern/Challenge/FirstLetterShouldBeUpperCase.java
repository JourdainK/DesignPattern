package InterpreterPattern.Challenge;

public class FirstLetterShouldBeUpperCase implements Express{

    @Override
    public String interpret(String context) {
        context = context.substring(0,1).toUpperCase() + context.substring(1);

        return context;
    }
}
