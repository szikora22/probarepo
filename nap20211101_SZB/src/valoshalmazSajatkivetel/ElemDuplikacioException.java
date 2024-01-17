package valoshalmazSajatkivetel;

public class ElemDuplikacioException extends Exception {
	
	private int szam;
	
	public int getSzam() {
		return szam;
	}

	public ElemDuplikacioException(int szam, String uzenet) {
		
		super(uzenet);
		this.szam = szam;
		
	}
	

}
