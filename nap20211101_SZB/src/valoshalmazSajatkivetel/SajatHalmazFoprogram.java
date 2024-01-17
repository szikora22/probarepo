package valoshalmazSajatkivetel;

import valoshalmazSajatkivetel.MaxElemszamTullepesException.MaxElemszamTullepesException1;

public class SajatHalmazFoprogram {
	
public static void main(String[] args) {
		
		SajatHalmaz halmaz = new SajatHalmaz();
		
		try {
			
			halmaz.tombFeltoltese((byte)44);
			halmaz.tombFeltoltese((byte)29);
			halmaz.tombFeltoltese((byte)58);
			halmaz.tombFeltoltese((byte)29);
			
			
		} catch (ElemDuplikacioException e) {
			
			System.err.println(e.getMessage()+" A szám, ami duplikáció miatt nem tölthető be a halmazba: "+e.getSzam());
			
		} catch (MaxElemszamTullepesException1 e) {
			
			System.err.println(e.getMessage()+" A szám, ami már nem fér be a tömbbe: "+e.getSzam());
			
		}
		
		

	}

}
