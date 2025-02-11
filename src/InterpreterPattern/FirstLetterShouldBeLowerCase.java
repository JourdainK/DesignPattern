package InterpreterPattern;

public class FirstLetterShouldBeLowerCase implements Expression{

    public final NoWhitespace noWhitespace = new NoWhitespace();

    @Override
    public String interpret(String context) {
        context = context.substring(0,1).toLowerCase() + context.substring(1);

        return noWhitespace.interpret(context);
    }
}
