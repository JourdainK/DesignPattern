package MementoPattern.Challenge;

public class Store {

    public static void main(String[] args) {
        var item = new Item(20);
        item.save();
        System.out.println("Item price is " + item.getPrice());
        item.setPrice(29);
        System.out.println("Item price is " + item.getPrice());
        item.undo();
        System.out.println("Item price is " + item.getPrice());

    }

}
