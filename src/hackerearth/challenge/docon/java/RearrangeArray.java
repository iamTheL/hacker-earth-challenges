/**
 * 
 */
package hackerearth.challenge.docon.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Rearranging arrays
You are given an array A containing N elements and you are required to do the following:

Remove all the repetitions of the number X from this array
Move all the remaining elements to the right
Fill the empty spots on the left side with 1
Write a program to print the rearranged array.

Input format

First line: T (number of test cases)
First line in each test case: N
Second line in each test case: N space-separated integers (denoting the array )
Third line in each test case: X
Output format

For each test case, print the rearranged array.

Constraints






 * @author Padmanabhan M
 *
 */
public class RearrangeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int noOfTests = Integer.parseInt(s.nextLine());
		int i  = 0;
		while ( i < noOfTests ) {
			
			Integer arraySize = Integer.parseInt(s.nextLine()); // First Line
			
//			List<String> arrayList = new ArrayList<String>(Arrays.asList(s.nextLine().split("\\s"))); //Second line
			String testSTrin = s.nextLine();
//			String[] oldString = testSTrin.split("\\s");
			String targetElement = s.nextLine(); // Third line
			String[] newString = testSTrin.replaceAll(targetElement+ " ", "").replaceAll(targetElement, "").split("\\s");
/*			System.out.println(newString.split("\\s"));
			System.out.print(newString.length());*/
			List<String> rearrangedList = new ArrayList<String>();
			
			/*for ( int j = 0; j < arrayList.size(); j ++) {
				if( !arrayList.get(j).equalsIgnoreCase(targetElement)) 
					rearrangedList.add(arrayList.get(j));
			}*/
				
			
			Integer reArrangedListSize = newString.length;
			
			for(int k = reArrangedListSize; k < arraySize; k ++) {
				System.out.print("1 ");
			}
			
			for(int l = 0; l < newString.length; l ++)
			System.out.print(newString[l] + " ");
			i ++;
		}
	}

}
