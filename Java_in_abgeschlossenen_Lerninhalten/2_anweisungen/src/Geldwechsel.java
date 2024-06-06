public class Geldwechsel
{
    public static void main(String[] args)
    {
        //  -------- Eingabe --------
        int cent = 979;

        //  -------- Berechnung --------
        int zweiEuro = cent / 200;
        int rest = cent % 200;

        int einEuro = rest / 100;
        rest = rest % 100;

        //  -------- Ausgabe --------
        System.out.println("Zwei Euro: " + zweiEuro + " Stück");
        System.out.println("Ein Euro: " + einEuro + " Stück");
        System.out.println("Restbetrag: " + rest + " Cent");
    }
}
