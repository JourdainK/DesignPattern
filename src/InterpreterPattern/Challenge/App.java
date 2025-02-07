package InterpreterPattern.Challenge;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        var lastLetterShouldEndWithDot = new LastLetterShouldEndWithDot();
        context = lastLetterShouldEndWithDot.interpret(context);

        System.out.println(context);

    }
}
