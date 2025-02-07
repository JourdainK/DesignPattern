package CommandPattern.Challenge;

public class LightOffCommand implements LightCommand{
    private final Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }
}
