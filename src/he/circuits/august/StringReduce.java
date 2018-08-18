/**
 * 
 */
package he.circuits.august;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Padmanabhan M
 *
 */
public class StringReduce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Integer stringSize = Integer.parseInt(s.nextLine());
		
		String sampleString = s.nextLine();
		
		Integer maxFrequency = 0;
		Integer testFrequency = 0;
		int i = 0;
		Map<String , Integer> frequencyMap = new HashMap<String, Integer>();
		
		while( i < stringSize ) {
			
			String key = Character.toString(sampleString.charAt(i));
			
			if(frequencyMap.containsKey(key)) {
				frequencyMap.put(key,frequencyMap.get(key)+1);
				testFrequency = frequencyMap.get(key); 
			}
			else {
				frequencyMap.put(key, 1);
				testFrequency = 1;
			}
				if(testFrequency > maxFrequency)
					maxFrequency = testFrequency;
			i++;
		}
		System.out.print(stringSize-maxFrequency);
		
		s.close();
	
	}

}
