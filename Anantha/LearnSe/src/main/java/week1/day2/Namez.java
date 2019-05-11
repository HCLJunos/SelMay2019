package week1.day2;

public class Namez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Namegame n = new Namegame();
		
		String myName = "Ananth";		
		
		// 1. Print last but one character of your name
		char[] myNam = myName.toLowerCase().toCharArray();
		System.out.println(myNam[myNam.length-2]);
		
		// 2. how many characters has "a" in it
		int expCharCount = 0;
		//for(int i = 0; i<myName.length();i++) {
		for(int i = 0; i<myNam.length;i++) {
			
		if(myNam[i] == 'a') {
			expCharCount++;				
		}
		}		
		System.out.println("No. of 'a' in my Name is: "+expCharCount);
		
		// 3. Convert your name to uppercase
		System.out.println("My Name in all capitals: "+myName.toUpperCase());
		
		// 4. Replace last character with '$'
		//char replaceChar = myNam[myNam.length-1];
		//System.out.println("My new name with last character as '$': "+myName.replace(replaceChar, '$'));
		//System.out.println("My new name with last character as '$': "+myName.replace(myNam[myNam.length-1], '$'));
		//myName.endsWith()
		
		System.out.println(myName.endsWith("h"));
		
		/*for(int i = 0; i<myNam.length;i++) {
			System.out.print(myNam[i]);
			if(i==myNam[myNam.length-1]) {
				System.out.print('$');
		    }
		}*/
		
		//System.out.println(myName.substring((0,myName.length()-1),"$");
		// 5. 
	}
}
