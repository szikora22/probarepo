package osztalyzatokOOPAdatbekeresselEllenorzesselKivetelDobassal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fajlkezeles {
	
	public Tanulo[] fajlBeolvasas(String fajlnev, String elvalaszto) throws IOException {
		
		Tanulo[] tanulok = new Tanulo[fajlSorainakSzama(fajlnev)-1];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev),"UTF-8"));
		
		String fejlec = br.readLine();	// fejlécet külön olvassuk be, mert nem objektumot reprezentál
		
		for (int i=0; i<tanulok.length; i++) {
			
			String sor = br.readLine();
			String[] csvSor = sor.split(elvalaszto);
			
			Tanulo tanuloObj = new Tanulo(csvSor[0],
							Integer.parseInt(csvSor[1]),
							Integer.parseInt(csvSor[2]),
							Integer.parseInt(csvSor[3]));
			
			tanulok[i] = tanuloObj;					
			
		}
		br.close();
		
		return tanulok;
		
	}

	private int fajlSorainakSzama(String fajlnev) throws IOException {
		
		Path utvonal = Paths.get(fajlnev);
		
		long sorokszama = Files.lines(utvonal).count();	// Stream API később fogunk vele foglalkozni
		
		return (int)sorokszama;
		
	}

	public void fajlbaIras(String fajlnev,String elvalaszto, Tanulo tanulo) {

		try {
			FileWriter fw = new FileWriter(fajlnev,Charset.forName("UTF-8"), true);
			
			String kiiras = tanulo.getNev()+elvalaszto+tanulo.getMatek()+elvalaszto+tanulo.getAngol()+elvalaszto+tanulo.getTortenelem();
			
			fw.write(kiiras+"\n");
			fw.close();
			
			System.out.println("A fájlbaírás megtörtént!");
			
		}catch (FileNotFoundException e) {
			System.out.println("A fájl nem található!");
		}catch (UnsupportedEncodingException e) {
			System.out.println("Hibás karakterkódolás!");
		}catch (IOException e) {
			System.out.println("I/O hiba" + e.getMessage());
		}
		
		
		
		
	}
	
	

}
