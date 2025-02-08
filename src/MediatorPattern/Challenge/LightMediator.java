package MediatorPattern.Challenge;

import CommandPattern.Challenge.Light;

public class LightMediator {

    private TrafficLight trafficLight;
    private PedestrianCrossingLight pedestrianCrossingLight;


    public LightMediator (TrafficLight trafficLight, PedestrianCrossingLight pedestrianCrossingLight){
        this.trafficLight = trafficLight;
        this.pedestrianCrossingLight = pedestrianCrossingLight;
    }

    public void setTrafficLightToAmber(){
        this.trafficLight.changeToAmber();
    }

    public void setTrafficLightToRed(){
        this.trafficLight.changeToRed();
        this.pedestrianCrossingLight.changeToGreen();
    }

    public void setTrafficLightToGreen(){
        this.trafficLight.changeToGreen();
        this.pedestrianCrossingLight.changeToRed();
    }

}
