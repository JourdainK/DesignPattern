package ObserverPattern.Challenge;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class WeatherUpdates implements PropertyChangeListener {

    private List<String> weatherUpdates = new ArrayList<>();

    public void printUpdates(){
        weatherUpdates.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        weatherUpdates.add((String) evt.getNewValue());
    }
}
