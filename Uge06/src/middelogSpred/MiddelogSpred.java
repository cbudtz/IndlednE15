package middelogSpred;

import java.util.Scanner;

/**
 * @author Christian Budtz
 *
 */
public class MiddelogSpred {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] intStrings = input.split(" ");
		//Konverter til integer:
		int[] measurements = new int[intStrings.length];
		int sum = 0;
		//En slags loop
		for (int i = 0; i < intStrings.length; i++) {
			int j = Integer.parseInt(intStrings[i]);
			measurements[i]= j;
			sum+= j;
		}
		double mean = ((double)sum)/measurements.length;
		
		double varSum = 0;
		//Iteration
		for (int i : measurements) {
			varSum+=Math.pow(i-mean, 2);
		}
		
		
		System.out.println("Mean: " + mean);
		System.out.println("Standard deviation: " + Math.sqrt(varSum/measurements.length));
		scan.close();
	}
}
