package exampleString;

public class ConceptofString {
	public static void main(String[] args) {
		
	// There are two ways of create string 
		
		//string literals
		// new keyword
		
	String str="chandra";
	String str1="chandra";
	String str2= new String("chandra");
	String str3="bhushan";
	String str4="Chandra";
	
	System.out.println(str2==str1);//false  str2 create memory in heap with new keyword,str is create memory in constant pool.
	
	System.out.println(str==str1);//true
	System.out.println(str.equals(str2));//true
	System.out.println(str==str2);//false
	System.out.println(str==str4);//false
	}
}
