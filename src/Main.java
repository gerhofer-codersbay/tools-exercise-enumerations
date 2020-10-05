public class Main {

    public static void main(String[] args) {
        Item banana = new Item();
        banana.itemType = ItemType.FOOD;
        System.out.println("banana is edible: "+ banana.itemType.edible);

        Item aspirin = new Item();
        aspirin.itemType = ItemType.MEDICINE;
        System.out.println("Aspirin is edible: "+ aspirin.itemType.edible);


        Item axe = new Item();
        axe.itemType = ItemType.TOOL;
        System.out.println("Axe is edible: "+ axe.itemType.edible);


        ItemType.FOOD.doSomething();

    }

}
