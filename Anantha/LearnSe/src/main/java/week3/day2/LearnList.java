package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		// Print names starting with "S" from a list
		ArrayList<String> ls = new ArrayList<>();
		//Set<String> s = new HashSet<>();
		Set<String> s = new LinkedHashSet<>();
		int count = 0;
				
		ls.add("Ananth");
		ls.add("Punitha");
		ls.add("Ranjith");
		ls.add("Sridevi");
		ls.add("sam");
		ls.add("Kesav");
		ls.add("sam");
		ls.add("Kesav");	
		
		s.addAll(ls);
		
		for (String teamMates : ls) {			
			if(teamMates.startsWith("S") || teamMates.startsWith("s")) {
				System.out.println("List of names starting with 'S' from list are: "+teamMates);
				count++;
			}		
		}
		if (count==0) {
			System.out.println("No name matches with the provided character 'S' in the list");
		}
		count =0;
		System.out.println("*********************************************");
		for (String classMates : s) {			
			if(classMates.startsWith("S") || classMates.startsWith("s")) {
				System.out.println("List of names starting with 'S' from set are: "+classMates);
				count++;
			}			
		}
		if (count==0) {
			System.out.println("No name matches with the provided character 'S' in the set");
		}
		
		
		//for sorting elements in the list
		Collections.sort(ls);
		System.out.println(ls);
//		for (String string : s) {
//			System.out.println(s);
//		}
		
		//print only duplicates		
		count=0;
		int totalDuplicates = 0;
		for (String teamMates : s) {
			for (String classMates : ls) {
				if (teamMates.matches(classMates)) {
					count=count+1;
					totalDuplicates = count;
				}							
			}
			if (count>1) {
				System.out.println("Duplicate names is: "+teamMates);
			}
			count =0;
			if (totalDuplicates==0) {
				System.out.println("No duplicates in the list");
			}
		}
	}

}
