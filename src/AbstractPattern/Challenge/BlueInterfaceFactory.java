package AbstractPattern.Challenge;

public class BlueInterfaceFactory implements UserInterfaceFactory{
    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new BlueScrollBar();
    }
}
