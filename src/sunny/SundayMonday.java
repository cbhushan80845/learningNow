package sunny;

import java.util.Scanner;

public class SundayMonday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter day u want");
		int day =sc.nextInt();
		
		switch(day) {
		case 1:
		 System.out.println("Sunday");
		break;
		case 2:
		System.out.println("Monday");
		break;
		case 3:
			 System.out.println("Tuesday");
			break;
		case 4:
			 System.out.println("wednesday");
			break;
		case 5:
			 System.out.println("thrusday");
			break;
		case 6:
			 System.out.println("friday");
			break;
		case 7:
			 System.out.println("saturday");
			break;
			
		}
	}

}
