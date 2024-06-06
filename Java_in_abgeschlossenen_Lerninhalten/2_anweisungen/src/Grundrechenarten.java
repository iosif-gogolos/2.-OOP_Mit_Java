public class Grundrechenarten{
    public static void main(String[] args)
    {
        // ---------- Eingabe ----------
        int zahl1 = 215;
        int zahl2 = 34;
        String zeichenkette1 = "Hallo Welt";
        String zeichenkette2 = "Hallo" + "Welt"; // zeichenkette2 = "HalloWelt"
        int zahl3 = 1;

        String zeichenkette3 = "Hallo Nr." + zahl3; // zeichenkette3 = "Hallo Nr.1"
        int anzahl = zeichenkette3.length(); // anzahl = 11

        // ---------- Berechnung ----------
        int summe = zahl1 + zahl2;
        int differenz = zahl1 - zahl2;
        int multiplikation = zahl1 * zahl2;
        int division = zahl1 / zahl2;

        // ---------- Ausgabe ----------
        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Multiplikation: " + multiplikation);
        System.out.println("Division: " + division);

        System.out.println(zeichenkette1);
        System.out.println(zeichenkette2);
        System.out.println(zeichenkette3);

        System.out.println(anzahl);
    }
}
