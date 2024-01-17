package valoshalmazSajatkivetel;

/*
 Készítsünk programot, mely egy valós halmazt valósít meg egy tömbön keresztül.
A halmazban minden elem csak egyszer szerepelhet.
Amennyiben egy elemet duplikálni szeretnénk, dobjon ElemDuplikacioException kivételt.
Ha a tömbbe több elemet akarunk írni, mint az elemszáma, dobjon MaxElemszamTullepesException kivételt. */

public class SajatHalmaz {

	private byte[] valosHalmaz;
	private byte aktivElemszam;
	
	public SajatHalmaz() {
		valosHalmaz = new byte[10];
		aktivElemszam = 0;
	}
	
	
	public void tombFeltoltese(byte szam) throws ElemDuplikacioException {
		
		int i=0; 
		while (i<aktivElemszam && (valosHalmaz[i]!=szam)) {
			i++;
		}
		if (i<aktivElemszam) {
			throw new ElemDuplikacioException(szam,"Elem duplikáció!");
		}
		else if(aktivElemszam < valosHalmaz.length) {
			valosHalmaz[aktivElemszam] = szam;
			aktivElemszam++;
		}
		else {
			
			// throw new MaxElemszamTullepesException(szam,"Megtelt a tömb!");
			
		}
		
	}
	
}
