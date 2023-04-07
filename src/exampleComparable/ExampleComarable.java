package exampleComparable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExampleComarable {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "chandra bhushan", LocalDateTime.now(), 1990));
		list.add(new Student(2, "Ravi bhushan", LocalDateTime.now(), 19923));
		list.add(new Student(3, "Sunny bhushan", LocalDateTime.now(), 19390));
		list.add(new Student(4, "Deep bhushan", LocalDateTime.now(), 23990));
		
		System.out.println("tresting");
		

		System.out.println(list);
		System.out.println();
		List<Student> filterName = list.stream().filter(p -> p.getName().startsWith("R")).toList();
		System.out.println(filterName);

	}

}
