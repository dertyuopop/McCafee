package McCafe;

public class Artikel {
    private String name;
    private String size;
    private double price;
    private boolean stempelrelevant;

    // Constructor

    public Artikel(String name, String size, double price, boolean stempelrelevant) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.stempelrelevant = stempelrelevant;
    }

    // Get Methoden

    public String getName() { return name; }
    public String getSize() { return size; }
    public double getPrice() { return price; }
    public boolean isStempelrelevant() { return stempelrelevant; }

    // To String Methode
    @Override
    public String toString() {
        return name + " (" + size + ") - " + price + "€";
    }
}
