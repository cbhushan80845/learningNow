package sunny;

public class Find_Smallest_Bigest_2heighest {
	public static void main(String[] args) {
		int temp = 0;
		int arr[] = { 12, 33, 2, 14, 67, 78 ,1};
		int len=arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		
		System.out.println("");
		System.out.println("Accesending order are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[len-1]);
		}

	}

}
