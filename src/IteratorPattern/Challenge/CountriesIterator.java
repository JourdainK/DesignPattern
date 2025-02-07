package IteratorPattern.Challenge;

import java.util.Iterator;
import java.util.function.Consumer;

public class CountriesIterator implements Iterator<Country> {
    public Countries countries;
    private int index;

    public CountriesIterator(Countries countries){
        this.countries = countries;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        var items = countries.getCountries();

        return index < items.length;
    }

    @Override
    public Country next() {
        var items = countries.getCountries();

        if(hasNext()){
            var country = items[index++];
            if (isInEurope(country.getName().toUpperCase())){
                return country;
            }else{
                return next();
            }
        }

        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Country> action) {
        Iterator.super.forEachRemaining(action);
    }

    private boolean isInEurope(String countryName) {
        try {
            EUROPE.valueOf(countryName);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public enum EUROPE{
        BELGIUM,
        FRANCE,
        NETHERLANDS,
        ITALY
    }


}
