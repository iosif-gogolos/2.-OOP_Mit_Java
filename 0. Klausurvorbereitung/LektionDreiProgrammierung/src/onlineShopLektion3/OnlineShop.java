package onlineShopLektion3;

public class OnlineShop {
	// Implementierung der main-Methode
	
	public static void main(String[] args) {
		// Erzeugung eines Objekts kunde1 der Klasse Kunde
		Kunde kunde1 = new Kunde(); 
		// Aufruf von Setter-Methoden auf dem Objekt kunde1
		// aus der Klasse OnlineShop heraus
		kunde1.setName("Lange");
		kunde1.setVorname("Gerd");
		
		Kunde kunde2 = new Kunde();
		kunde2.setName("Koch");
		kunde2.setVorname("Franz");
		
		System.out.print(kunde1.getVorname());
		System.out.print(" ");
		System.out.println(kunde1.getName());
		
		System.out.print(kunde2.getVorname());
		System.out.print(" ");
		System.out.println(kunde2.getName());
		
		
		kunde1.setName("Mueller");
		kunde1.setVorname("Harry");
		
		System.out.print(kunde1.getVorname());
		System.out.print(" ");
		System.out.println(kunde1.getName());
		System.out.println(kunde2.getName());
	}

}
