package arrays;

public class findDuplicate {
	public static void main(String[] args) {
		int ar[]= {12,43,55,55,66,77,88,77};
	
		
		for(int i=0;i<ar.length-1;i++) {
			for(int j= i+1;j<ar.length;j++) {
				if(ar[i]==ar[j] && (i!=j)) {
					
					System.out.println("Duplicate elemt are=="+ar[j]);
				}
			}
		}
	}

}
