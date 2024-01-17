package oopAlapokOsszefoglaloProjekt;

public abstract class Allat {
	
	private String nev;
	private int suly;
	
	
	public Allat(String nev, int suly) {
		super();
		setNev(nev);
		setSuly(suly);
	}


	public String getNev() {
		return nev;
	}


	public void setNev(String nev) {
		if (nev != null && !nev.isBlank()) {
			this.nev = nev;
		}
		else {
			throw new IllegalArgumentException("A név mező nem lehet üres!");
		}
	}


	public int getSuly() {
		if (suly>=2) {
			return suly;
		}
		else {
			throw new IllegalArgumentException("A súly nem lehet kisebb 2 kilogrammnál!");
		}
	}


	public void setSuly(int suly) {
		this.suly = suly;
	}
	
	
	
	public abstract double napiEteladag();
	
	
	
	
	
	
	
	

}
