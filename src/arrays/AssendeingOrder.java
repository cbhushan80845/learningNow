package arrays;

public class AssendeingOrder {
	public static void main(String[] args) {
		int ar[]= {11,2,5,4,88,9,8};
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
					
				}
			}
		}
		
		System.out.println();
		System.out.println("Assending order are");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
