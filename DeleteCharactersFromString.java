package week3.deletecharacter;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {		
		System.out.println(removeAllOccurrences("This is a test", 't')); 
		System.out.println(removeAllOccurrences("Summer is here!", 'e'));
		System.out.println(removeAllOccurrences("---0---", '-'));
	}
	public String removeAllOccurrences(String str, char ch) {
		int index=0;
		while(index!=-1) {                 //the loop runs until the given character is no more in the given string
			for(int i=0;i<str.length();i++) {
				 index=str.indexOf(ch);
				 if(str.charAt(i)==(ch)) {
					str=str.substring(0,index) + str.substring(index+1);
				}	
			}	
		}
		return str;
	}
}
