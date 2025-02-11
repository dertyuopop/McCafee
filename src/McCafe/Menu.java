package McCafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<Artikel> menu;
    private List<Artikel> bestellung;

    public Menu() {
        this.menu = loadMenu();
        this.bestellung = new ArrayList<>();
    }
    public List<Artikel> getBestellung(){
        return bestellung;
    }

    // Statische Kaffee-Liste
    private List<Artikel> loadMenu() {
        return Arrays.asList(
                new Artikel("Espresso", "klein", 1.69, false),
                new Artikel("Espresso", "groß", 2.19, true),
                new Artikel("Espresso Macchiato", "klein", 1.79, false),
                new Artikel("Cafe", "klein", 1.79, false),
                new Artikel("Cafe", "mittel", 2.19, false),
                new Artikel("Cafe", "groß", 2.49, true),
                new Artikel("Flat White Espresso", "klein", 1.89, false),
                new Artikel("Flat White Espresso", "mittel", 2.29, false),
                new Artikel("Flat White Espresso", "groß", 2.59, true),
                new Artikel("Cappuccino", "klein", 1.99, false),
                new Artikel("Cappuccino", "mittel", 2.39, false),
                new Artikel("Cappuccino", "groß", 2.69, true),
                new Artikel("Caffe Latte", "klein", 1.99, false),
                new Artikel("Caffe Latte", "mittel", 2.39, false),
                new Artikel("Caffe Latte", "groß", 2.69, true),
                new Artikel("Latte Macchiato", "klein", 2.39, false)

        );
    }

    // Bestellvorgang
    public void addKaffee(int index) {
        if (index >= 0 && index < menu.size()) {
            Artikel kaffee = menu.get(index);
            bestellung.add(kaffee);
            System.out.println(kaffee + " hinzugefügt.");
        } else {
            System.out.println("Ungültige Auswahl.");
        }
    }

    public void showMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + ": " + menu.get(i));
        }
    }
}
