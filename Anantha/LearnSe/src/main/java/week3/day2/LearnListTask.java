package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnListTask {
	
	
	public static void main(String[] args) {
		
		//Set<String> ls = new HashSet<>();
		//Set<String> ls = new TreeSet<>();
		Set<String> ls = new LinkedHashSet<>();
		
		ls.add("Ananth");
		ls.add("Punitha");
		ls.add("Ranjith");
		ls.add("Sridevi");
		ls.add("Kesav");
		ls.add("Sam");
		
		for (String string : ls) {
			System.out.println(string);
		}

		
	}
	
}
