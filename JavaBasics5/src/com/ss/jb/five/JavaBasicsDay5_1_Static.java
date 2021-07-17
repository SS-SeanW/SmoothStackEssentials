package com.ss.jb.five;

import java.util.Arrays;

public class JavaBasicsDay5_1_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputArray[] = {"Natural", "Elephant", "Homemade", "Clap", "Wood Chipper", "Can't", "Extraterrestrial", "Eucalyptus"};
			
		Arrays.sort(inputArray, (a,b) -> sortByLength(a, b));
		for(int i = 0; i < inputArray.length;i++) {
			System.out.print(inputArray[i]);
			System.out.println();
		}		
		System.out.println();
		
		Arrays.sort(inputArray, (a,b) -> sortByReverseLength(a, b));
		for(int i = 0; i < inputArray.length;i++) {
			System.out.print(inputArray[i]);
			System.out.println();
		}	
		System.out.println();
		
		Arrays.sort(inputArray, (a,b) -> sortByFirstCharacter(a, b));
		for(int i = 0; i < inputArray.length;i++) {
			System.out.print(inputArray[i]);
			System.out.println();
		}	
		System.out.println();
		
		Arrays.sort(inputArray, (a,b) -> firstLetterE(a, b));
		for(int i = 0; i < inputArray.length;i++) {
			System.out.print(inputArray[i]);
			System.out.println();
		}
	}
	
	public static int sortByLength(String a, String b) {
		return Integer.compare(a.length(), b.length());
	}
	
	public static int sortByReverseLength(String a, String b) {
		return Integer.compare(b.length(), a.length());
	}
	
	public static int sortByFirstCharacter(String a, String b) {
		return a.charAt(0) - b.charAt(0);		
	}
	
	public static int firstLetterE(String a, String b) {
		if(a.charAt(0) == 'e' || a.charAt(0) == 'E') {
			return -1;
		} else {
			return b.charAt(0);
		}
	}
}
