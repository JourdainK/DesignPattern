package CommandPattern.Challenge;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        light.isOn();
        var lightCommandExecutor = new LightExecutor();
        lightCommandExecutor.execute(new LightOffCommand(light));
        light.isOn();
        lightCommandExecutor.execute(new LightOnCommand(light));
        light.isOn();
    }
}
