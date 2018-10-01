package functionalProgrammingExample;

import java.util.Scanner;

public class FPExample1 {
	static Function<Integer, Integer> square = x -> x * x;
	static Function<Integer, Integer> min = x -> x * 2;
 	static Function<Integer, Integer> triple = x -> x * 3;
	
	static Function<Integer, Integer> compose(final Function<Integer, Integer> f1, final Function<Integer, Integer> f2) {
		return arg -> f2.apply(f1.apply(arg));
	}
	
	static Function<Function<Integer,Integer>,
				Function<Function<Integer,Integer>,
						Function<Integer, Integer>>> compose = 
								x -> y -> z -> x.apply(y.apply(z));
								
	static Function<Integer, Integer> f = compose.apply(triple).apply(square);
	
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		
		Integer theirInt = scan.nextInt();
		
		scan.close();
		System.out.println("If you Square your number, and then triple it, you get: ");
		System.out.println(compose(square, triple).apply(theirInt));
		
		System.out.println("This one is done by composing the square and triple functions into a single function");
		System.out.println(f.apply(theirInt));
	}
}
