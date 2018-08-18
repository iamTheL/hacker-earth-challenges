package hackerearth.challenge.esko.java;

public class TrailingZeros {

	public static void main(String[] args) {
		StringBuilder sb = null;
	/*double inputValue = 0;
	double closestValue = Math.floor((inputValue / Math.pow(5, 1)));
	double answer = 0;
	answer = answer + closestValue;
	double i = 2;
		while (i < closestValue){
			closestValue = Math.floor((inputValue / Math.pow(5, i)));
			answer = answer + closestValue;
			i ++;
		}*/
		
		String binary = Integer.toBinaryString(10);
		binary.length();
		long count = binary.chars().filter(ch -> ch == '1').count();
		sb.append(count+"#");
//		sb.append(Chaac)
//	System.out.println(answer);
	}
}
