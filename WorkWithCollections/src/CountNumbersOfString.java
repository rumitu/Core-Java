import java.util.LinkedHashMap;

public class CountNumbersOfString {

	public  String countWords(String input) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		if (input != null) {
			String[] separatedWords = input.split(" ");
			for (String str : separatedWords) {
				if (map.containsKey(str)) {
					int count = Integer.parseInt((String) map.get(str));
					map.put(str, String.valueOf(count + 1));
				} else {
					map.put(str, "1");
				}
			}
		}
		return map.toString();
	

	}
}
