import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<InventoryItem> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    // Add hozzá (az ebben az osztályban lévő) inventory változóhoz a paraméterként kapott itemet!
    public void addItem(InventoryItem item) {
        if (inventory.contains(item)) {
            for (InventoryItem actual : inventory) {
                if (actual.equals(item)) {
                    actual.setQuantity(item.getQuantity());
                    return;
                }
            }
        }
        inventory.add(item);
    }

    // Hívd meg az InventoryItem kosntruktorát a három paraméterrel és mentsd el egy item változóba!
    // Add hozzá az inventoryhoz ezt az item-et!
    public void addItem(String name, int quantity, double price) {
        InventoryItem item = new InventoryItem(name, quantity, price);
        inventory.add(item);
    }
    // vagy addItem(new InventoryItem(name, quantity, price));

    public void printItems() {
        for (InventoryItem item : inventory) {
            System.out.println("Name: " + item.getName());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Price: " + item.getPrice());
        }
    }
    // vagy System.out.println(inventory.toString());

    public void removeItem(String name) {
        InventoryItem inventoryItem;
        for (InventoryItem actual : inventory) {
            if (actual.getName().equals(name)) {
                inventory.remove(actual);
                return;
            }
        }
    }

    public void updateQuantity(String name, int newQuantity) {
        for (InventoryItem item : inventory) {
            if (item.getName().equals(name)) {
                item.setQuantity(newQuantity);
                break;
            }
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (InventoryItem item : inventory) {
            totalValue += item.calculateValue();
        }
        return totalValue;
    }


}
