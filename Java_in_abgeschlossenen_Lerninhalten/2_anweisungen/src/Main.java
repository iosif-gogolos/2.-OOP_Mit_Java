public class Main
{
    public static void main(String[] args)
    {
        int zahl1;
        double zahl2;
        int zahl3 = 29;
        double zahl4 = 308.902;

        int a, b, c;

        zahl1 = 106;
        zahl2 = 134.5;

        double addition = zahl1 + zahl2;
        double multiplication = zahl3 * zahl4;

        System.out.println(addition);
        System.out.println(multiplication);

        Kunde kunde1 = new Kunde();
        kunde1.setName("Gogolos");
        kunde1.setVorname("Iosif");
        kunde1.setGeschlecht("Männlich");
        kunde1.setGeschlecht("07.16.1996");

        String name = kunde1.getName();

        System.out.println(name);

    }
}
