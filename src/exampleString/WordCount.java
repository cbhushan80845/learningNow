package exampleString;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String words="aa ja aa kk ll ja aa";
		
		Map<String, Integer> map= new HashMap<>();
		
		String[] arr = words.split(" ");
		
		for(String word : arr) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}else {
				map.put(word, 1);
			}
			
		}
		System.out.println(map);
}
}