package osztalyzatokOOPAdatbekeresselEllenorzesselKivetelDobassal;

/*
 B., Bővítsük a programot és a lista végére írjuk ki a tanulók összátlagát is.
 */

import java.io.IOException;

public class OsztalyzatokFoprogram {

	public static void main(String[] args) throws IOException {
		
		
		Fajlkezeles fajlObj = new Fajlkezeles();
		
		Tanulo[] tanulok = fajlObj.fajlBeolvasas("osztalyzatok.csv", ";");
		
		for (Tanulo tanulo : tanulok) {
			
			System.out.print(tanulo.toString());
			System.out.printf(" átlaga: %.2f%n",tanulo.atlagSzamitas());
			
		}
		
		Adatkezeles adatObj = new Adatkezeles();
		
		fajlObj.fajlbaIras("osztalyzatok.csv",";",adatObj.adatokKonzolrol());
		
		/*
		StatikusmetodusokOsztalya statikObj = new StatikusmetodusokOsztalya();
		System.out.printf("\nAz osztály átlaga: %.2f",statikObj.osztalyAtlag(tanulok));
	*/
		
		
		

	}

}
