package DecoratorPattern.Challenge;

public class House {
    public static void main(String[] args) {
        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        var room2 = new RoomWithCouch(room);
        room2.printFurniture();

        System.out.println();
        var room3 = new RoomWithTable(room2);
        room3.printFurniture();

    }
}
