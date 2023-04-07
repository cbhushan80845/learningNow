package arrays;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] ar = { 12, 33, 76, 13, 64, 77, 13, 22, 33 };

		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] == ar[j])
					System.out.println(ar[j]);

			}
		}
	}

}
