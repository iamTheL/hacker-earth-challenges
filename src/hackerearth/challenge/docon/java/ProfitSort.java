/**
 * 
 */
package hackerearth.challenge.docon.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Padmanabhan M
 *
 */
public class ProfitSort {

	/**
	 * @param args
	 */
	
	
    // function to find first index >= x
    static int lowerIndex(List<String> arr, int n, int x)
    {
        int l = 0, h = n - 1;
        while (l <= h) 
        {
            int mid = (l + h) / 2;
            if (Integer.parseInt(arr.get(mid)) >= x)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
     
    // function to find last index <= y
    static int upperIndex(List<String> arr, int n, int y)
    {
        int l = 0, h = n - 1;
        while (l <= h) 
        {
            int mid = (l + h) / 2;
            if (Integer.parseInt(arr.get(mid)) <= y)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return h;
    }
     
    // function to count elements within given range
    static int countInRange(List<String> arr, int n, int l, int r)
    {
        // initialize result
        int count = 0;
        count = upperIndex(arr, n, r) - 
                lowerIndex(arr, n, l) + 1;
        return count;
    }

	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int noOfDays = Integer.parseInt(s.nextLine());
		List<String> profitList = new ArrayList<String>(Arrays.asList(s.nextLine().split("\\s")));
		
		Collections.sort(profitList);
		int noOfQueries = Integer.parseInt(s.nextLine());
		
		int i = 0;
		 while (i < noOfQueries) {
			 String[] firstLine = s.nextLine().split("\\s");
				int l = Integer.parseInt(firstLine[0]);
				int r = Integer.parseInt(firstLine[1]);
//				List<String> tempList = new ArrayList<>();
				Integer count = 0;
				
				System.out.println(countInRange(profitList, profitList.size(), l, r));
				
				/*for ( int j = 0; j <profitList.size(); j ++) {
					if(Integer.parseInt(profitList.get(j)) <= l && Integer.parseInt(profitList.get(j)) >= r)
						count ++;
				}*/
			 
			 i++;
		 }
	}

}
