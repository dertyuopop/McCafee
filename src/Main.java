import McCafe.Artikel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        int ProduktEingabe;
        int mengeauswahl;
        double gesamtsumme;
        int auswahl;
        boolean stopSchleife;

        ArrayList<Double> artikel = new ArrayList<Double>();
        stopSchleife = true;
        gesamtsumme = 0;

        Artikel ca;
        ca = new Artikel("ca",1.99, 'M');
        Artikel es;
        es = new Artikel("es",0.99,'M');
        

        while (stopSchleife){

            System.out.println("Was möchten sie Bestellen :");
            System.out.println("1 = ca");
            System.out.println("2 = es");
            System.out.println("3 = bestellung abschliessen");

            auswahl = sc.nextInt();
            if (auswahl == 1){
                artikel.add(ca.getPrice());
            } else if (auswahl == 2){
                artikel.add(es.getPrice());
            } else if (auswahl == 3) {
                stopSchleife = false;
            }
            System.out.println();
        }

        System.out.println("Ihre Gesammt summe beträgt ");
        for (int i = 0; i < artikel.size(); i++) {
            gesamtsumme = gesamtsumme + artikel.get(i);
        }
        System.out.println(gesamtsumme + "€");

    }

}
