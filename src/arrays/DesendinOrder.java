package arrays;

public class DesendinOrder {
	public static void main(String[] args) {
		int[] ar= {12,33,44,54,76};
		int	temp=0;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Desending order are");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
