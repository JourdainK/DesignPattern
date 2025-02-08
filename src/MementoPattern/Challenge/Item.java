package MementoPattern.Challenge;

public class Item {

    private int price;
    private ItemState itemState = new ItemState(price);

    public Item(int price){
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void save(){
        itemState.setState(price);
    }

    public void undo(){
        price = itemState.getState();
    }

}
