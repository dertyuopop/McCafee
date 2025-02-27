import McCafe.Menu;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner für Userinput
        Scanner sc;sc = new Scanner(System.in);

        //Aufruf der Menüs
        Menu bestellung = new Menu();
        bestellung.showMenu();

        while (true) {
            System.out.print("Geben Sie die Nummer der Kaffeespezialität ein (oder -1 zum Beenden): ");
            int wahl = sc.nextInt();
            if (wahl == -1) break;
            bestellung.addKaffee(wahl);
        }

        System.out.println("=====================================");
        System.out.println();

        //Anzahl bereits abgestempelten Felder
        System.out.print("Bereits abgestempelte Felder:");
        int bereitsabgestempelt = sc.nextInt();
    }
}
