package arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = { 12, 14, 55, 8, 3, 222 };
		int temp = 0;
		int size=arr.length;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					
					arr[i] = arr[j];

					arr[j] = temp;

				}
			}
			
			System.out.println(arr[i]);
				
		}
		System.out.println("the seond largest off::"+arr[size-3]);
		System.out.println("the seond smallest off::"+arr[1]);
		//System.out.println("the seond largest off::"+arr[size-3]);

	}

}
