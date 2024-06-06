public class PKW{

	private String hersteller = "Volkswagen"; //Defaultwert
	private String fahrgestellNr;
	private String typ; //Zeichenkette
	private int leistungInPs; // Ganze Zahl
	private float hubraum; // Kommazahl
	private boolean tuev = true; // Wahr oder falsch -> Wahrheitswert

	public void setFahrgestellNr(String fahrgestellNr){ // sichtbarkeitsmodifikator rückgabedatentyp (void wenn nichts zurückgegeben wird)
		// der Wert wird der Methode übergeben
		this.fahrgestellNr = fahrgestellNr;
	}

	// Getter: Abruf des Wertes der fahrgestellNr.
	public String getFahrgestellNr(){
		return this.fahrgestellNr;
	}

	public static void main(String[] args){
		System.out.println("Hallo Auto!");
	}
}