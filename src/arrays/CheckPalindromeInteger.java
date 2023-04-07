package arrays;

public class CheckPalindromeInteger {
	public static void main(String[] args) {
		String a="0101";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
		 	rev=rev+a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
	}

}
