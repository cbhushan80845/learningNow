package exampleString;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		String str="aaaabcs";//please take same input
		Set<Character> s1 =new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
		
		 s1.add(c);
		
		
	}
		String string = s1.toString();
		System.out.println(string);
	}
	
}
