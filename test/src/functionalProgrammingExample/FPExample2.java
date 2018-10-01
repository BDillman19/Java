package functionalProgrammingExample;

import java.util.Scanner;

public class FPExample2 {
	static Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		Integer theirInt = scan.nextInt();
		
		System.out.println("Please enter another number");
		Integer theirInt2 = scan.nextInt();
		
		scan.close();
		System.out.println("If you add your numbers together, you get: ");
		System.out.println(add.apply(theirInt).apply(theirInt2));
	}
}
