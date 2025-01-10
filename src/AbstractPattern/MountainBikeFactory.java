package AbstractPattern;

public class MountainBikeFactory implements BikeFactory{
    @Override
    public Handlebars createHandlebars() {
        return new MoutainBikeHandlebars();
    }

    @Override
    public Pedals createPedals() {
        return new MoutainBikePedals();
    }

    @Override
    public Tire createTire() {
        return new MoutainBikeTire();
    }
}
