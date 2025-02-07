package InterpreterPattern.Challenge;

public class LastLetterShouldEndWithDot implements Express{
    private final FirstLetterShouldBeUpperCase firstLetterShouldBeUpperCase = new FirstLetterShouldBeUpperCase();

    @Override
    public String interpret(String context) {
        context = context + ".";


        return firstLetterShouldBeUpperCase.interpret(context);
    }
}
