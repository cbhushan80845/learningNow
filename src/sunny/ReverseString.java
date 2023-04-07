package sunny;

public class ReverseString {
	public static void main(String[] args) {
		String str ="chandra";
		String strs=" ";
		String ori=" ";
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			ori=ori+charAt;
		
		}
		
		System.out.println("Original String are:"+ori);
		
		for(int j=str.length()-1;j>=0;j--) {
			char charAt1 = str.charAt(j);
			strs=strs+charAt1;
			
		}
		
		System.out.println("Revesre String are:"+strs);
		
		if(ori.equals(strs)) {
			System.out.println(ori+": is palindrom number");
		}else {
			System.out.println( ori+" : Not Palindrom number:");
		}
	}
	

}
