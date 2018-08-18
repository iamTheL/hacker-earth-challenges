/**
 * 
 */
package he.circuits.august;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Padmanabhan M
 *
 */
public class PicuBank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arraySize = Integer.parseInt(s.nextLine());
		
		for (int i = 0; i < arraySize; i ++) {
			
			String[] firstLine = s.nextLine().split("\\s");
			/*	
			BigInteger dollar = new BigInteger(firstLine[0]);
			BigInteger a = new BigInteger(firstLine[1]);
			BigInteger m = new BigInteger(firstLine[2]);
			BigInteger b = new BigInteger(firstLine[3]);
			BigInteger target = new BigInteger(firstLine[4]);
			BigInteger baseDifference = target.subtract(dollar);
			BigInteger oneSlot = a.multiply(m).add(b);
			BigInteger oneSlotDuration = m.add(BigInteger.ONE);
			
			BigInteger[] diff = baseDifference.divideAndRemainder(oneSlot);
			
			BigInteger counter = diff[0].multiply(oneSlotDuration);
			
			BigInteger[] newTarget = diff[1].divideAndRemainder(a);
			counter = counter.add(newTarget[0]);
			if(!newTarget[1].equals(BigInteger.ZERO))
			counter = counter.add(BigInteger.ONE);*/
			
			
			Integer dollar = Integer.parseInt(firstLine[0]);
			Integer a = Integer.parseInt(firstLine[1]);
			Integer m = Integer.parseInt(firstLine[2]);
			Integer b = Integer.parseInt(firstLine[3]);
			Integer target = Integer.parseInt(firstLine[4]);
			
			Integer baseDifference = target - dollar;
			Integer oneSlot  = (a * m) +b;
			Integer oneSlotDuration = m +1;
			
			Integer counter = (baseDifference / oneSlot) * oneSlotDuration;
			
			Integer balance = baseDifference % oneSlot;
			
			counter = counter + (balance / a);

			if(balance % a != 0)
				counter ++ ;
			
			System.out.println(counter);
		}
		s.close();
	}

}
