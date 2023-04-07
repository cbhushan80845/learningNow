package sunny;

import java.util.HashMap;

public class StringWordCount {
	public static void main(String[] args) {
		String str = "chandrabhushan";
		HashMap<String, Integer> map = new HashMap<>();

		String[] word = str.split("");
		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(word)) {
				//map.put(word, map.get(word) + 1);

			}

		}

	}
}
