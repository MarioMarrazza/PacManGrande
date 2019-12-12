package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Map Reader Tool zur Einlesung der Map via BufferedReader & FileReader
 * @author 183641
 *
 */

public class MapReader {
	/**
	 * 
	 * @param fileName = der Dateiname mit den Indexes übergeben
	 * @return result = gibt den ausgelesenen Index zurück
	 */
	public static List<Integer> getMap(String fileName){
		List<Integer> result = new ArrayList<Integer>();
		try {
			//BufferedReader wird erzeugt fileName wird eingelesen
			BufferedReader bfr = new BufferedReader(new FileReader(fileName));
			//liest solange ein bis alle Indexes eingelesen worden sind
			while(bfr.ready()) {
				String line = bfr.readLine();
				int i = Integer.parseInt(line);
				result.add(i);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
}
