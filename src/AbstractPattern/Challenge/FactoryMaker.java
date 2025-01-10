package AbstractPattern.Challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static Map<String, Supplier<UserInterfaceFactory>> userInterfaceTypes = new HashMap<>();

    static {
        userInterfaceTypes.put("RED", RedInterfaceFactory::new);
        userInterfaceTypes.put("BLUE", BlueInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String userInterfaceType) {

        if (userInterfaceTypes.get(userInterfaceType) != null) {
            return userInterfaceTypes.get(userInterfaceType).get();
        } else {
            throw new IllegalArgumentException("User interface type not supported");
        }

    }
}
