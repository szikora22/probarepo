package kivetelKezeles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* Alkalmazzunk kivételkezelést a következő feladatsorban. Térképezzük fel az összes hibalehetőséget,
idézzük elő őket, figyeljük meg, milyen kivételeket dobnak, majd kezeljük le mindegyiket, 
hogy a következő futásnál már ne okozzanak programleállást.
1.,Kérjünk be a felhasználótól három számot.
2.,Hozzunk létre egy tömböt, elemszáma legyen egyenlő a számok szorzatával.
3.,Írjuk ki a tömb[elemszámadik] elemét.
4.,A számok összegét osszuk el a legkisebb számmal.
5.,Deklaráljunk kér String-et, az egyik hordozzon egy -a felhasználótól bekért- fájlnevet; a fájlt nyissuk is meg olvasásra.
6., Írjuk ki mindkét szöveges változó első karakterét. */



public class FoprogramKivetelKezeles {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int elso = 0; int masodik = 0; int harmadik = 0;
		boolean joErtek = false;
		
		do {
			try {
				
					System.out.print("Kérem az első számot: ");
					elso = Integer.parseInt(br.readLine());
					
					System.out.print("Kérem a második számot: ");
					masodik = Integer.parseInt(br.readLine());
					
					System.out.print("Kérem a harmadik számot: ");
					harmadik = Integer.parseInt(br.readLine());
					
					joErtek = true;
					br.close();
			} catch (NumberFormatException e) {

				System.out.println("Nem megfelelő formátum vagy értéktartomány!" + e.getMessage());								
			}
			catch (IOException e) {

				System.out.println("I/O hiba"); // detailedMessage adattag gettere, az eredeti üzenettel						
			}
		} while (!joErtek);
		
		//2.-3.-4. feladat:
		
		try {
			
				int[] tomb = new int[elso * masodik * harmadik];
				System.out.println(tomb.length);
				
				//System.out.println(tomb[tomb.length]);   //logikailag lehetetlen egy tömb elemszámadik elemét kiíratni
				
				System.out.println((elso * masodik * harmadik) / Math.min(elso, Math.min(masodik, harmadik)));
				
			
		} catch (NegativeArraySizeException e) {
			
			System.out.println("Negatív elemszáma nem lehet a tömbnek!");	
			
		}
		catch (OutOfMemoryError e) {
			
			System.out.println("Túl nagy elemszám nem fér bele a memóriába!" + e.getMessage());	
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Nem létező indexre történt hivatkozás");	
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("Nem létező indexre történt hivatkozás");	
			
		}
		
		// 5. feladat:
		
		String szoveg = null;
		String fajlnev = null;
		
		System.out.print("Adja meg a fájl nevét: ");
		
		try {
			
			fajlnev = br.readLine();
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev),"UTF-8"));
			br2.close();
		} catch (UnsupportedEncodingException e) {

			System.out.println("Karakterkódolási hiba!");
			
		}
		catch (FileNotFoundException e) {

			System.out.println("A fájl nem található!");
			
		}
		catch (IOException e) {

			System.out.println("I/O hiba");
			
		}
		
		
		
		//6. feladat:
		
		try {
			System.out.println(fajlnev.charAt(0));
			System.out.println(szoveg.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("Nincs értéke a változónak!");
		}
	}
	
	
	
}
