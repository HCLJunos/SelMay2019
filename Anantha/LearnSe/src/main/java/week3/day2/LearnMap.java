package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		String company = "Amazon India";
		Map<Character, Integer> companyMap = new LinkedHashMap<>();
		
		char[] charArray = company.toCharArray();
		
		for (char ch: charArray) {
			if(companyMap.containsKey(ch)) {
				companyMap.put(ch, companyMap.get(ch)+1);
			}
			else
			{				
				companyMap.put(ch,1);
			}					
		}
		System.out.println(companyMap);
	}

}
