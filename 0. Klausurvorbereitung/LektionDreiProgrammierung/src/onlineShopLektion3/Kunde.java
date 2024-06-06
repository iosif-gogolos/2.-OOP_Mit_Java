package onlineShopLektion3;

public class Kunde {
	
	// Deklaration von Attributen
	private String name;
	private String vorname; 
	private String geschlecht;
	private String geburtsdatum;
	
	// Methoden der Klasse "Kunde"
	public String getName() {
		return name;
	}
	
	//Getter Methoden
	public String getVorname() {
		return vorname;
	}
	
	public String getGeschlecht() {
		return geschlecht;
	}
	
	public String getGeburtsdatum() {
		return geburtsdatum;
	}
	
	// Setter Methoden
	public void setName(String name) {
		this.name = name;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}


}
