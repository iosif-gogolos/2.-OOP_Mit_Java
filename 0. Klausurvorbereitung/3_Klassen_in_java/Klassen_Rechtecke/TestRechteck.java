// Projekt kap11-rechteck-intro, Datei TestRechteck.java
public class TestRechteck {
	// die Programmausführung startet hier mit der main-Funktion
	public static void main(String[] args){
		Rechteck r1 = new Rechteck();
		r1.laenge = 17;
		r1.breite = 12;
		System.out.format(
			"Fläche: %f\n", r1.berechneFlaeche());
		System.out.format(
			"Umfang: %f\n", r1.berechneUmfang());
	}
}