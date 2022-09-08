package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("First value to be averaged?");
			int x = in.nextInt();
			System.out.println("Second value to be averaged?");
			int y = in.nextInt();
		double Average = (double)(x+y)/2;
	System.out.println("Your average is " + Average);

	}

}
