public enum ItemType {
    TOOL(false, true),
    FOOD(true, false),
    MEDICINE(true, true);

    public boolean edible;
    public boolean isExpensive;

    ItemType(boolean edible, boolean isExpensive) {
        this.edible = edible;
        this.isExpensive = isExpensive;
    }

    public void doSomething() {
        System.out.println("I do something");
    }
}
