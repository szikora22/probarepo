package oopAlapokOsszefoglaloProjekt;

public class Kutya extends Allat {
	
	private int marmagassag;

	
	public Kutya(String nev, int suly, int marmagassag) {
		super(nev, suly);
		setMarmagassag(marmagassag);
	}


	public int getMarmagassag() {
		return marmagassag;
	}


	public void setMarmagassag(int marmagassag) {
		if (marmagassag>=10) {
			this.marmagassag = marmagassag;
		}
		else {
			throw new IllegalArgumentException("A marmagasságnak legalább 10 centiméternek kell lennie!");
		}
	}






	@Override
	public double napiEteladag() {
		
		return getSuly() / 50.0;
	}


	@Override
	public String toString() {
		return getNev() + " " + getSuly() + "  " +  marmagassag + " cm";
	}
	
	

}
