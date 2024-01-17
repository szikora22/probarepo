package osztalyzatokOOPAdatbekeresselEllenorzesselKivetelDobassal;

/*
A., Készítsünk programot, mely képes CSV fájlból felolvasni tanulók adatait, vizsgaeredményeit.
 A tanulókról a fájlban lévő adatok: Név, Matek, Angol, Töri.
Oldjuk meg, hogy a program objektumokban tárolja le az egyes tanulók adatait, 
majd listázzuk ki őket a képernyőre az átlagukkal együtt. */


public class Tanulo {
	
	private String nev;
	private int matek;
	private int angol;
	private int tortenelem;
	
	
	public Tanulo(String nev, int matek, int angol, int tortenelem) {
		super();
		this.nev = nev;
		this.matek = matek;
		this.angol = angol;
		this.tortenelem = tortenelem;
	}


	public Tanulo() {
		
	}


	public String getNev() {
		return nev;
	}


	public int getMatek() {
		return matek;
	}


	public int getAngol() {
		return angol;
	}


	public int getTortenelem() {
		return tortenelem;
	}
	

	/**
	 * Név módosítása ellenőrzött módon --> A név nem lehet üres
	 * @param nev
	 * @throws IllegalArgumentException
	 */


	public void setNev(String nev) {
		if (nev != null && !nev.isBlank()) {
			this.nev = nev;
		}
		else {
			throw new IllegalArgumentException("A név mező nem lehet üres!");
		}
	}


	public void setMatek(int matek) {
		if (matek >= 1 && matek <= 5) {
			this.matek = matek;
		}
		else {
			throw new IllegalArgumentException("Az osztályzat 1 és 5 között kell hogy legyen!");
		}
	}


	public void setAngol(int angol) {
		if (angol >= 1 && angol <= 5) {
			this.angol = angol;
		}
		else {
			throw new IllegalArgumentException("Az osztályzat 1 és 5 között kell hogy legyen!");
		}
	}


	public void setTortenelem(int tortenelem) {
		if (tortenelem >= 1 && tortenelem <= 5) {
			this.tortenelem = tortenelem;
		}
		else {
			throw new IllegalArgumentException("Az osztályzat 1 és 5 között kell hogy legyen!");
		}
	}


	@Override
	public String toString() {
		return "Név: " + nev + " Matek: " + matek + " Angol: " + angol + " Történelem: " + tortenelem;
	}
	
	
	public double atlagSzamitas() {
		
		return (angol+matek+tortenelem) / 3.0;
		
	}
	
	
	public static double osztalyAtlag(Tanulo[] tanulok) {
		
		double osszeg = 0.0;
		
		for(int i=0; i<tanulok.length; i++) {
			
			osszeg += tanulok[i].atlagSzamitas();
						
		}
		
		double atlag = (double)osszeg / tanulok.length;
		return atlag;
		
	}
	
	
	
	
	

}
