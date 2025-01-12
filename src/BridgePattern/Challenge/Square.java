package BridgePattern.Challenge;

public class Square implements Shape {

    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void getShape() {
        System.out.print("Square filled with color ");
    }

    @Override
    public Color getColor() {
        return color;
    }

}
