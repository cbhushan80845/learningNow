package arrays;

public class CheckOddEven {
	public static void main(String[] args) {
		int a[]= {12,33,24,88};
		
		System.out.println("odd numbers");
		for(int i=0;i<a.length;i++) {
			if(a[i]% 2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("even no");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}
