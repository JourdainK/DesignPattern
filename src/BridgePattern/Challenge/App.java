package BridgePattern.Challenge;

public class App {

    public static void main(String[] args) {
        var circle = new Circle(new Blue());
        circle.getShape();
        circle.getColor().get();

        var square = new Square(new Red());
        square.getShape();
        square.getColor().get();
    }
}
