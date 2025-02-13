import McCafe.Menu;
import McCafe.Rechnung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        double gesamtbetrag = 0;

        Menu bestellung = new Menu(); // bereits abgestempelte Felder

        System.out.println("Willkommen im McCafe! Wählen Sie Ihr Getränk aus dem Menü:");
        bestellung.showMenu();

        while (true) {
            System.out.print("Geben Sie die Nummer der Kaffeespezialität ein (oder -1 zum Beenden): ");
            int wahl = sc.nextInt();
            if (wahl == -1) break;
            bestellung.addKaffee(wahl);

        }
    }
}
