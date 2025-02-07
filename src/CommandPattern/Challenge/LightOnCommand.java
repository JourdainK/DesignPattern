package CommandPattern.Challenge;

public class LightOnCommand implements LightCommand{
    private final Light light;

    public LightOnCommand (Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }
}
