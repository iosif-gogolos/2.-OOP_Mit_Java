// Projekt kap11-rechteck-intro, Datei Rechteck.java

public class Rechteck {
	// Instanzvariablen - Attribute
	public double laenge, breite;
	
	//Methoden
	public double berechneUmfang(){
		return (laenge+breite)*2;
	}
	public double berechneFlaeche(){
		return laenge*breite;
	}
}