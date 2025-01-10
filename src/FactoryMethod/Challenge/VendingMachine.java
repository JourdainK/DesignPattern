package FactoryMethod.Challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snacks = new HashMap<>();

    static{
        snacks.put("ChocolateBar", ChocolateBar::new);
        snacks.put("Drink", Drink::new);
        snacks.put("Chips", Chips::new);
    }

    Snack getSnack(String snackType) {
        if(snacks.containsKey(snackType)) {
            return snacks.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Snack type not found");
        }
    }
}
