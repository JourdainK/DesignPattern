package BridgePattern.Challenge;

public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void getShape() {
        System.out.print("Circle filled with color ");
    }

    @Override
    public Color getColor() {
        return color;
    }
}
