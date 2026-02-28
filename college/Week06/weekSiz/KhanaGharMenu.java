
/**
 * Menu of Khana Ghar in Dharan to track their daily meni items.
 *
 * @author Alson Basnet
 * @version 21 Dec 2025
 */
class KhanaGharMenu {

    // Attributes
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;
    String spiceLevel;     
    String origin;         

    // Constructor
    KhanaGharMenu(String itemName, double price, String category,
                  boolean isVegetarian, boolean isAvailable,
                  String spiceLevel, String origin) {

        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
        this.spiceLevel = spiceLevel;
        this.origin = origin;
    }

    // Display item
    void display() {
        System.out.println("-----------------------------------");
        System.out.println("Item Name   : " + itemName);
        System.out.println("Category    : " + category);
        System.out.println("Price       : Rs. " + price);
        System.out.println("Vegetarian  : " + (isVegetarian ? "Yes" : "No"));
        System.out.println("Available   : " + (isAvailable ? "Yes" : "No"));
        System.out.println("Spice Level : " + spiceLevel);
        System.out.println("Origin      : " + origin);
    }

    // Main method
    public static void main(String[] args) {

        // Menu items
        KhanaGharMenu[] menu = {
            new KhanaGharMenu("Dal-Bhat Set", 120, "Dal-Bhat",
                    true, true, "Medium", "Nepal"),

            new KhanaGharMenu("Masala Chiya", 15, "Chiya-Nasta",
                    true, true, "Low", "Dharan"),

            new KhanaGharMenu("Dharane Kalo Bangur", 400, "Traditional Meat",
                    false, true, "High", "Dharan"),

            new KhanaGharMenu("Sekuwa", 200, "BBQ",
                    false, true, "Medium", "Eastern Nepal")
        };

        // Display full menu
        System.out.println("Our full menu: ");
        for (KhanaGharMenu item : menu) {
            item.display();
        }

        // This is display Vegetarian items
        System.out.println(" All vegetarian");
        for (KhanaGharMenu item : menu) {
            if (item.isVegetarian) {
                item.display();
            }
        }

        // This is displau non-vegetrain items.
        System.out.println(" Non- vegetarian items ");
        for (KhanaGharMenu item : menu) {
            if (!item.isVegetarian) {
                item.display();
            }
        }

        // Non-veg
        System.out.println(" Non-vegetrian items with a price greater than Rs.100");
        for (KhanaGharMenu item : menu) {
            if (!item.isVegetarian && item.price > 100 && item.isAvailable) {
                item.display();
            }
        }

        // Veg
        System.out.println(" Veg items with a price less than Rs.50 ");
        for (KhanaGharMenu item : menu) {
            if (item.isVegetarian && item.price < 50 && item.isAvailable) {
                item.display();
            }
        }
    }
}
