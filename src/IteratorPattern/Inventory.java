package IteratorPattern;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Inventory implements Iterable<Item>{
    private final Item[] items;

    public Inventory(Item... items){
        this.items = items;
    }

    public Item[] getItems(){
        return items;
    }


    @Override
    public Iterator<Item> iterator() {
        return new StockIterator(this);
    }

    @Override
    public void forEach(Consumer<? super Item> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Item> spliterator() {
        return Iterable.super.spliterator();
    }
}
