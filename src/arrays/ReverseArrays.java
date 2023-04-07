package arrays;

public class ReverseArrays {
	public static void main(String[] args) {
		
	
	int[] arr= {12,33,44,22,98};
	System.out.println("Beefore reverse");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("After reverse");
	
	for(int i= arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
	}
}
