package test;

import java.util.Arrays;

public class test2 {
	static int count = 0;
	public static StringBuilder tst() {
		StringBuilder secretB = new StringBuilder();
		String importData = "this,is,a,new,secret,blah\nthis,is,another,secret,blah";
		
        String[] secretObjs = importData.split("\n|,");
        Arrays.stream(secretObjs)
        	  .forEach(word -> {
        		  switch(count%6) {
        		  case 0:
            		  System.out.println(word);
        			  secretB.append(word);
        			  count++;
        			  break;
        		  //case 1: 
        			  //secretB.protocol(word);
        			  //break;
//        		  case 2:
//        			  secretB.description(word);
//        			  break;
//        		  case 3:
//        			  secretB.userName(word);
//        			  break;
//        		  case 4:
//        			  secretB.password(word);
//        			  try {
//						secretB.build();
//					} catch (SecretException e) {
//						e.printStackTrace();
//					}
        		  default :
        			  count++;
        			 
        		  }
        	  });
        System.out.println(count);
        return secretB;
        
	}
	public static void main(String[] args) {
		System.out.println(tst());
	}
}
