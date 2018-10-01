package test;

import java.util.Arrays;
import java.util.stream.Collectors;

import java.util.List;

public class testFile {
	public static void main(String[] args) {
		String [][] myString = {{"a", "b"}, {"c"},{"d","e","f"}};
		
		List<String> myNewStrings = Arrays.stream(myString)
				.flatMap(n -> Arrays.stream(n))
				.peek(n -> System.out.println(n))
				.collect(Collectors.toList());
		}
	}


