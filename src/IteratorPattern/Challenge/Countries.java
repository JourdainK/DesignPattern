package IteratorPattern.Challenge;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Countries implements Iterable<Country>{

    private final Country[] countries;

    public Countries(Country... countries){
        this.countries = countries;
    }

    public Country[] getCountries(){
        return countries;
    }

    @Override
    public Iterator<Country> iterator() {
        return new CountriesIterator(this);
    }

    @Override
    public void forEach(Consumer<? super Country> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Country> spliterator() {
        return Iterable.super.spliterator();
    }
}
