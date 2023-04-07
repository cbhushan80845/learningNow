package sunny;

public class ReverseArray {
	public static void main(String[] args) {
		
	
	int[] arr= {12,33,44,32,12};
	System.out.println("Original array");
	for(int i=0 ;i<arr.length;i++) {
		System.out.println(arr[i]);
		
		
	}
	System.out.println("After Reverse");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
	
	
	

}
}