package test;

public class palindrome {
	static String palindromeStr;
	
	public static int getPalindromicNumber(String str) {
		for (int i = str.length(); i > 0; i--) {
			char subStr = str.charAt(i);
			
		}
		
		System.out.println(palindromeStr);
		return 0;
	}
	
	public static void main(String[] args) {
		String cat = "cat";
		
		getPalindromicNumber(cat);
	}
}
