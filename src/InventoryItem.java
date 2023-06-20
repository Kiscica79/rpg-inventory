public class InventoryItem {
    private String name;
    private int quantity;
    private double price;


    // Írj egy konstruktort, ami beállítja az InventoryItem minden értékét!
    public InventoryItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Írj gettereket az összes fieldhez!
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Írj settert a mennyiséghez!
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Írj egy calculateValue() metódust, ami kiszámolja a termék össz. értékét
    // (a mennyiség és egységár függvényében)
    public double calculateValue() {
    return quantity*price;

    }


    public boolean equals(InventoryItem other) {
        return other.price == this.price && other.name.equals(this.name);
    }
}
