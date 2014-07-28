

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWordInURL {

		public static ArrayList<String> findAllURL(String content) {
		ArrayList<String> resultList = new ArrayList<>();
		String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			resultList.add(matcher.group(1));
		}
		return resultList;
	}

	public static void search(String url, String needle) throws Exception {
		URL oracle = new URL(url);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				oracle.openStream()));
		String inputLine;
		boolean foundURL = false;
		StringBuffer test = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			test.append(inputLine);
			if (inputLine.contains(needle)) {
				foundURL = true;
				break;
			}
		}
		if (!foundURL) {
			ArrayList<String> urls = findAllURL(test.toString());
			for (String u : urls) {

				if (!(u.equals(url))) {
					URL o = new URL(url + "/" + u);
					if (!(o.toString().contains(".."))) {
						BufferedReader i = new BufferedReader(
								new InputStreamReader(o.openStream()));
						String input;
						while ((input = i.readLine()) != null) {
							if (input.contains(needle)) {
								System.out.println(url + u);
								break;
							}
						}

					}
				}
			}
		}
		in.close();
	}

	public static void main(String[] args) throws Exception {
		// search("http://ebusiness.free.bg", "Револвираща");
		search(args[0], args[1]);
	}
	}
