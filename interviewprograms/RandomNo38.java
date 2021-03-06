package interviewprograms;

import java.lang.Math;
import java.util.Random;

public class RandomNo38 {

	public static void main(String[] args) {


		System.out.println("**************************************");
		// or By Using Random() Method


		System.out.println("1st Random Number: " + Math.random());
		System.out.println("2nd Random Number: " + Math.random());
		System.out.println("3rd Random Number: " + Math.random());
		System.out.println("4th Random Number: " + Math.random());

		System.out.println("**************************************");
		// or Random Number between specified Range

		int min = 200;
		int max = 400;

		System.out.println("Random value of type double between " + min + " to " + max + ":");
		double a1 = Math.random() * (max - min + 1) + min;
		System.out.println(a1);

		System.out.println("Random value of type int between " + min + " to " + max + ":");
		int b1 = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(b1);
		

		System.out.println("**************************************");
		// or By Using Random Class

		// creating an object of Random class
		Random random = new Random();
		
		// Generates random integers 0 to 49
		int x = random.nextInt(50);
		
		// Generates random integers 0 to 999
		int y = random.nextInt(1000);
		// Prints random integer values
		System.out.println("Randomly Generated Integers Values");
		System.out.println(x);
		System.out.println(y);
		
		// Generates Random doubles values
		double a = random.nextDouble();
		double b = random.nextDouble();
		// Prints random double values
		System.out.println("Randomly Generated Double Values");
		System.out.println(a);
		System.out.println(b);
		
		// Generates Random float values
		float f = random.nextFloat();
		float i = random.nextFloat();
		// Prints random float values
		System.out.println("Randomly Generated Float Values");
		System.out.println(f);
		System.out.println(i);
		
		// Generates Random Long values
		long p = random.nextLong();
		long q = random.nextLong();
		// Prints random long values
		System.out.println("Randomly Generated Long Values");
		System.out.println(p);
		System.out.println(q);
		
		// Generates Random boolean values
		boolean m = random.nextBoolean();
		boolean n = random.nextBoolean();
		// Prints random boolean values
		System.out.println("Randomly Generated Boolean Values");
		System.out.println(m);
		System.out.println(n);
		
		
	}

}
