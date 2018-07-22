/**
 * Problem Statement in package-info.java
 * 
 * Initial draft solution.
 */
package hackerearth.challenge.esko.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author Padmanabhan M
 *
 */
public class TestClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	static class UnitRelation{
		private String unitName;
		private Integer unitValue;
		
		public UnitRelation(String unitName, Integer unitValue) {
			super();
			this.unitName = unitName;
			this.unitValue = unitValue;
		}
		public String getUnitName() {
			return unitName;
		}
		public void setUnitName(String unitName) {
			this.unitName = unitName;
		}
		public Integer getUnitValue() {
			return unitValue;
		}
		public void setUnitValue(Integer unitValue) {
			this.unitValue = unitValue;
		}
	}
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("started");
        String rawUnits = br.readLine();                // Reading input from STDIN
        List<String> rawUnitsList = Arrays.asList(rawUnits.toLowerCase().split(","));
        
        List<String> sortedList = new ArrayList<String>();
        Map<String,UnitRelation> lookUpMap = new HashMap<String,UnitRelation>();
        for ( int i = 0; i < rawUnitsList.size()-1; i ++) {
        	List<String> tempList = new ArrayList<String>();
        	tempList = Arrays.asList(br.readLine().toLowerCase().split("[\\s=]+"));
        		lookUpMap.put(tempList.get(0), new UnitRelation(tempList.get(2),Integer.parseInt(tempList.get(1))));
        }
        
        String seedString = lookUpMap.keySet().toArray()[0].toString();
        
        sortedList.add(seedString);
        sortedList.add(lookUpMap.get(seedString).getUnitName());
        
        String firstString = null;
        String lastString = null;
        String keyValue = null;
        
        StringBuilder answer = new StringBuilder();
        for ( int j = 1; j < lookUpMap.keySet().toArray().length; j ++) {
        	firstString = sortedList.get(0);
        	lastString = sortedList.get(sortedList.size()-1);
        	if(lookUpMap.containsKey(lastString) ) {
        		sortedList.add(lookUpMap.get(lastString).getUnitName());
        	}
        	keyValue = fetchKey(lookUpMap,firstString);
        	if ( keyValue != null) {
        		sortedList.add(0, keyValue);
        	}	
        }
        Integer currentValue = null;
        Integer prevValue = 1;
        answer.append("1 " + sortedList.get(0) + " = ");
        for(int k = 1; k < sortedList.size(); k++) {
        	currentValue = lookUpMap.get(sortedList.get(k-1)).getUnitValue();
        	answer.append( (currentValue * prevValue) +" " +sortedList.get(k));
        	prevValue = currentValue * prevValue;
        	if( !(k == sortedList.size()-1)) {
        		answer.append(" = ");
        	}
        }
        System.out.println(answer);
	}
	private static String fetchKey(Map<String, UnitRelation> lookUpMap, String firstString) {
		String keyValue = null;
		for( int i = 0; i < lookUpMap.keySet().size(); i++) {
			if(lookUpMap.get(lookUpMap.keySet().toArray()[i].toString()).getUnitName().equals(firstString)) {
				keyValue = lookUpMap.keySet().toArray()[i].toString();
				break;
			}
		}
		return keyValue;
	}
	

}
