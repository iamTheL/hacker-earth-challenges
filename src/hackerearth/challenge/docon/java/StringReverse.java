package hackerearth.challenge.docon.java;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    
    for ( int i = name.length()-1; i >= 0; i--){
    	System.out.print(name.charAt(i));
    }
	}
}
