package IteratorPattern;

import java.util.Iterator;
import java.util.function.Consumer;

public class StockIterator implements Iterator<Item> {
    private Inventory inventory;
    private int index;

    public StockIterator(Inventory inventory){
        this.inventory = inventory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        var items = inventory.getItems();

        return index < items.length;
    }

    @Override
    public Item next() {
        var items = inventory.getItems();
        if(hasNext()){
            var item = items[index++];
            if(item.getQuantity() > 0){
                return item;
            }else{
                return next();
            }
        }else{
            return null;
        }

    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Item> action) {
        Iterator.super.forEachRemaining(action);
    }

}
