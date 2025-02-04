package McCafe;

import java.util.ArrayList;

public class Artikel {

    // Atribute

   private String name;
   private double price;
   private char größe;

   // Constructor

    public Artikel(String name, double price,char größe){
        this.price = price;
        this.größe = größe;
        this.name = name;
    }

   // Get und Set Methoden
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public char getGröße() {
        return größe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGröße(char größe) {
        this.größe = größe;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
