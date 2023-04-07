package arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[] arr= new  int[6];
		int[] arr11= new  int[] {12,33,44,22};
		int[] arr1= {10,12,14,22,34,76};
		arr[0]=1;
		arr[1]=22;
		arr[2]=33;
		arr[5]=43;
		
		
		// there are many way to iterate Array
		
		//1.for loop
		System.out.println("------------Using for loop--------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------Using for each--------------");
		//for each
		for(int s:arr) {
			System.out.println(s); 
		}
		System.out.println("------------Using while--------------");
		
		//while loop
		int i=0;
		
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		
		System.out.println("------------Using do while--------------");
		
		if(arr.length>0) {
			int j=0;
		do {
			System.out.println(arr[j]);
			j++;
		}while(j<arr.length);
	}
		
		//using for each(functional style
		System.out.println("----------------using for each(functional stle)-----------------");
		Arrays.asList(arr).stream().forEach(System.out::println);
		
		System.out.println("----------------using map(functional stle)-----------------");
		Arrays.asList(arr).stream().map(ele -> {
			System.out.println(ele);
			return ele;
		});
	}

}
