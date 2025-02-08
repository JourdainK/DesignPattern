package MediatorPattern.Challenge;

public class App {

    public static void main(String[] args) {
        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();
        var lightMediator = new LightMediator(trafficLight, pedestrianCrossingLight);

        lightMediator.setTrafficLightToAmber();
        lightMediator.setTrafficLightToGreen();
        lightMediator.setTrafficLightToAmber();
        lightMediator.setTrafficLightToRed();

//        System.out.println("\n\n\n");
//
//        trafficLight.changeToAmber();
//        trafficLight.changeToGreen();
//        trafficLight.changeToAmber();
//        trafficLight.changeToRed();
    }


}
